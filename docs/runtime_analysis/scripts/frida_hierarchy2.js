'use strict';

var tree = {};
var nodes = {};
var roots = {};
var mc = 0;

function hookContainers() {
    try {
        var VC = Java.use('com.censivn.C3DEngine.api.core.VObject3dContainer');
        VC.addChild.implementation = function(child) {
            var ph = this.hashCode();
            var pc = this.$className;
            var ch = child ? child.hashCode() : -1;
            var cc = child ? child.$className : 'null';
            mc++;
            if (!tree[ph]) tree[ph] = {c: pc, kids: {}};
            if (ch >= 0) {
                tree[ph].kids[ch] = cc;
                nodes[ch] = {c: cc, p: ph};
                delete roots[ch]; // child is never a root
            }
            if (!nodes[ph]) nodes[ph] = {c: pc, p: -1};
            if (nodes[ph].p < 0) roots[ph] = 1; // potential root
            return this.addChild(child);
        };
        VC.removeChild.implementation = function(child) {
            var ph = this.hashCode();
            var ch = child ? child.hashCode() : -1;
            if (tree[ph] && tree[ph].kids[ch]) delete tree[ph].kids[ch];
            if (nodes[ch]) { nodes[ch].p = -1; roots[ch] = 1; }
            return this.removeChild(child);
        };
        send('hooks ok');
    } catch(e) { send('hook err: ' + e.message); }
}

function dump() {
    var r = Object.keys(roots);
    send('=== TREE (' + mc + ' mutations, ' + r.length + ' roots) ===');
    r.forEach(function(h) { printNode(h, 0); });
    send('=== END ===');
}

function printNode(h, d) {
    var n = tree[h];
    if (!n) {
        var nn = nodes[h];
        send('  '.repeat(d) + (nn ? nn.c : 'UNKNOWN@' + h) + ' (leaf)');
        return;
    }
    var ks = Object.keys(n.kids);
    send('  '.repeat(d) + n.c + ' (' + ks.length + ' kids)');
    ks.forEach(function(k) { printNode(k, d + 1); });
}

Java.perform(function() {
    Java.deoptimizeEverything();
    send('deopt');
    hookContainers();
    send('ready');
});

setTimeout(function() {
    Java.perform(function() { dump(); });
}, 12000);
