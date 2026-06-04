package com.flurry.android;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class bz extends eb implements DialogInterface.OnKeyListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, by {
    private Context A;
    private Activity B;
    private s C;
    private au D;
    private String E;
    private List F;
    private final String e;
    private ProgressDialog f;
    private cr g;
    private WebView h;
    private boolean i;
    private WebViewClient j;
    private WebChromeClient k;
    private View l;
    private int m;
    private WebChromeClient.CustomViewCallback n;
    private Dialog o;
    private FrameLayout p;
    private int q;
    private Dialog r;
    private FrameLayout s;
    private boolean t;
    private boolean u;
    private AlertDialog v;
    private List w;
    private boolean x;
    private Map y;
    private Map z;

    static /* synthetic */ void c(bz bzVar) {
        if (bzVar.i) {
            return;
        }
        String str = "{useCustomClose:false,isModal:false,width:undefined,height:undefined,placementType:\"" + (bzVar.c() ? "interstitial" : "inline") + "\"}";
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:");
        sb.append("(function() {");
        sb.append("var Hogan={};(function(Hogan,useArrayBuffer){Hogan.Template=function(renderFunc,text,compiler,options){this.r=renderFunc||this.r;this.c=compiler;this.options=options;this.text=text||\"\";this.buf=useArrayBuffer?[]:\"\"};Hogan.Template.prototype={r:function(context,partials,indent){return\"\"},v:hoganEscape,t:coerceToString,render:function render(context,partials,indent){return this.ri([context],partials||{},indent)},ri:function(context,partials,indent){return this.r(context,partials,indent)},rp:function(name,context,partials,indent){var partial=partials[name];if(!partial)return\"\";if(this.c&&typeof partial==\"string\")partial=this.c.compile(partial,this.options);return partial.ri(context,partials,indent)},rs:function(context,partials,section){var tail=context[context.length-1];if(!isArray(tail)){section(context,partials,this);return}for(var i=0;i<tail.length;i++){context.push(tail[i]);section(context,partials,this);context.pop()}},s:function(val,ctx,partials,inverted,start,end,tags){var pass;if(isArray(val)&&val.length===0)return false;if(typeof val==\"function\")val=this.ls(val,ctx,partials,inverted,start,end,tags);pass=val===\"\"||!!val;if(!inverted&&pass&&ctx)ctx.push(typeof val==\"object\"?val:ctx[ctx.length-1]);return pass},d:function(key,ctx,partials,returnFound){var names=key.split(\".\"),val=this.f(names[0],ctx,partials,returnFound),cx=null;if(key===\".\"&&isArray(ctx[ctx.length-2]))return ctx[ctx.length-1];for(var i=1;i<names.length;i++)if(val&&typeof val==\"object\"&&names[i]in val){cx=val;val=val[names[i]]}else val=\"\";if(returnFound&&!val)return false;if(!returnFound&&typeof val==\"function\"){ctx.push(cx);val=this.lv(val,ctx,partials);ctx.pop()}return val},f:function(key,ctx,partials,returnFound){var val=false,v=null,found=false;for(var i=ctx.length-1;i>=0;i--){v=ctx[i];if(v&&typeof v==\"object\"&&key in v){val=v[key];found=true;break}}if(!found)return returnFound?false:\"\";if(!returnFound&&typeof val==\"function\")val=this.lv(val,ctx,partials);return val},ho:function(val,cx,partials,text,tags){var compiler=this.c;var options=this.options;options.delimiters=tags;var t=val.call(cx,text,function(t){return compiler.compile(t,options).render(cx,partials)});this.b(compiler.compile(t.toString(),options).render(cx,partials));return false},b:useArrayBuffer?function(s){this.buf.push(s)}:function(s){this.buf+=s},fl:useArrayBuffer?function(){var r=this.buf.join(\"\");this.buf=[];return r}:function(){var r=this.buf;this.buf=\"\";return r},ls:function(val,ctx,partials,inverted,start,end,tags){var cx=ctx[ctx.length-1],t=null;if(!inverted&&this.c&&val.length>0)return this.ho(val,cx,partials,this.text.substring(start,end),tags);t=val.call(cx);if(typeof t==\"function\")if(inverted)return true;else if(this.c)return this.ho(t,cx,partials,this.text.substring(start,end),tags);return t},lv:function(val,ctx,partials){var cx=ctx[ctx.length-1];var result=val.call(cx);if(typeof result==\"function\")result=result.call(cx);result=coerceToString(result);if(this.c&&~result.indexOf(\"{{\"))return this.c.compile(result,this.options).render(cx,partials);return result}};var rAmp=/&/g,rLt=/</g,rGt=/>/g,rApos=/\\'/g,rQuot=/\\\"/g,hChars=/[&<>\\\"\\']/;function coerceToString(val){return String(val===null||val===undefined?\"\":val)}function hoganEscape(str){str=coerceToString(str);return hChars.test(str)?str.replace(rAmp,\"&amp;\").replace(rLt,\"&lt;\").replace(rGt,\"&gt;\").replace(rApos,\"&#39;\").replace(rQuot,\"&quot;\"):str}var isArray=Array.isArray||function(a){return Object.prototype.toString.call(a)===\"[object Array]\"}})(typeof exports!==\"undefined\"?exports:Hogan);(function(Hogan){var rIsWhitespace=/\\S/,rQuot=/\\\"/g,rNewline=/\\n/g,rCr=/\\r/g,rSlash=/\\\\/g,tagTypes={\"#\":1,\"^\":2,\"/\":3,\"!\":4,\">\":5,\"<\":6,\"=\":7,\"_v\":8,\"{\":9,\"&\":10};Hogan.scan=function scan(text,delimiters){var len=text.length,IN_TEXT=0,IN_TAG_TYPE=1,IN_TAG=2,state=IN_TEXT,tagType=null,tag=null,buf=\"\",tokens=[],seenTag=false,i=0,lineStart=0,otag=\"{{\",ctag=\"}}\";function addBuf(){if(buf.length>0){tokens.push(new String(buf));buf=\"\"}}function lineIsWhitespace(){var isAllWhitespace=true;for(var j=lineStart;j<tokens.length;j++){isAllWhitespace=tokens[j].tag&&tagTypes[tokens[j].tag]<tagTypes[\"_v\"]||!tokens[j].tag&&tokens[j].match(rIsWhitespace)===null;if(!isAllWhitespace)return false}return isAllWhitespace}function filterLine(haveSeenTag,noNewLine){addBuf();if(haveSeenTag&&lineIsWhitespace())for(var j=lineStart,next;j<tokens.length;j++){if(!tokens[j].tag){if((next=tokens[j+1])&&next.tag==\">\")next.indent=tokens[j].toString();tokens.splice(j,1)}}else if(!noNewLine)tokens.push({tag:\"\\n\"});seenTag=false;lineStart=tokens.length}function changeDelimiters(text,index){var close=\"=\"+ctag,closeIndex=text.indexOf(close,index),delimiters=trim(text.substring(text.indexOf(\"=\",index)+1,closeIndex)).split(\" \");otag=delimiters[0];ctag=delimiters[1];return closeIndex+close.length-1}if(delimiters){delimiters=delimiters.split(\" \");otag=delimiters[0];ctag=delimiters[1]}for(i=0;i<len;i++)if(state==IN_TEXT)if(tagChange(otag,text,i)){--i;addBuf();state=IN_TAG_TYPE}else if(text.charAt(i)==\"\\n\")filterLine(seenTag);else buf+=text.charAt(i);else if(state==IN_TAG_TYPE){i+=otag.length-1;tag=tagTypes[text.charAt(i+1)];tagType=tag?text.charAt(i+1):\"_v\";if(tagType==\"=\"){i=changeDelimiters(text,i);state=IN_TEXT}else{if(tag)i++;state=IN_TAG}seenTag=i}else if(tagChange(ctag,text,i)){tokens.push({tag:tagType,n:trim(buf),otag:otag,ctag:ctag,i:tagType==\"/\"?seenTag-ctag.length:i+otag.length});buf=\"\";i+=ctag.length-1;state=IN_TEXT;if(tagType==\"{\")if(ctag==\"}}\")i++;else cleanTripleStache(tokens[tokens.length-1])}else buf+=text.charAt(i);filterLine(seenTag,true);return tokens};function cleanTripleStache(token){if(token.n.substr(token.n.length-1)===\"}\")token.n=token.n.substring(0,token.n.length-1)}function trim(s){if(s.trim)return s.trim();return s.replace(/^\\s*|\\s*$/g,\"\")}function tagChange(tag,text,index){if(text.charAt(index)!=tag.charAt(0))return false;for(var i=1,l=tag.length;i<l;i++)if(text.charAt(index+i)!=tag.charAt(i))return false;return true}function buildTree(tokens,kind,stack,customTags){var instructions=[],opener=null,token=null;while(tokens.length>0){token=tokens.shift();if(token.tag==\"#\"||token.tag==\"^\"||isOpener(token,customTags)){stack.push(token);token.nodes=buildTree(tokens,token.tag,stack,customTags);instructions.push(token)}else if(token.tag==\"/\"){if(stack.length===0)throw new Error(\"Closing tag without opener: /\"+token.n);opener=stack.pop();if(token.n!=opener.n&&!isCloser(token.n,opener.n,customTags))throw new Error(\"Nesting error: \"+opener.n+\" vs. \"+token.n);opener.end=token.i;return instructions}else instructions.push(token)}if(stack.length>0)throw new Error(\"missing closing tag: \"+stack.pop().n);return instructions}function isOpener(token,tags){for(var i=0,l=tags.length;i<l;i++)if(tags[i].o==token.n){token.tag=\"#\";return true}}function isCloser(close,open,tags){for(var i=0,l=tags.length;i<l;i++)if(tags[i].c==close&&tags[i].o==open)return true}function writeCode(tree){return'var _=this;_.b(i=i||\"\");'+walk(tree)+\"return _.fl();\"}Hogan.generate=function(code,text,options){if(options.asString)return\"function(c,p,i){\"+code+\";}\";return new Hogan.Template(new Function(\"c\",\"p\",\"i\",code),text,Hogan,options)};function esc(s){return s.replace(rSlash,\"\\\\\\\\\").replace(rQuot,'\\\\\"').replace(rNewline,\"\\\\n\").replace(rCr,\"\\\\r\")}function chooseMethod(s){return~s.indexOf(\".\")?\"d\":\"f\"}function walk(tree){var code=\"\";for(var i=0,l=tree.length;i<l;i++){var tag=tree[i].tag;if(tag==\"#\")code+=section(tree[i].nodes,tree[i].n,chooseMethod(tree[i].n),tree[i].i,tree[i].end,tree[i].otag+\" \"+tree[i].ctag);else if(tag==\"^\")code+=invertedSection(tree[i].nodes,tree[i].n,chooseMethod(tree[i].n));else if(tag==\"<\"||tag==\">\")code+=partial(tree[i]);else if(tag==\"{\"||tag==\"&\")code+=tripleStache(tree[i].n,chooseMethod(tree[i].n));else if(tag==\"\\n\")code+=text('\"\\\\n\"'+(tree.length-1==i?\"\":\" + i\"));else if(tag==\"_v\")code+=variable(tree[i].n,chooseMethod(tree[i].n));else if(tag===undefined)code+=text('\"'+esc(tree[i])+'\"')}return code}function section(nodes,id,method,start,end,tags){return\"if(_.s(_.\"+method+'(\"'+esc(id)+'\",c,p,1),'+\"c,p,0,\"+start+\",\"+end+',\"'+tags+'\")){'+\"_.rs(c,p,\"+\"function(c,p,_){\"+walk(nodes)+\"});c.pop();}\"}function invertedSection(nodes,id,method){return\"if(!_.s(_.\"+method+'(\"'+esc(id)+'\",c,p,1),c,p,1,0,0,\"\")){'+walk(nodes)+\"};\"}function partial(tok){return'_.b(_.rp(\"'+esc(tok.n)+'\",c,p,\"'+(tok.indent||\"\")+'\"));'}function tripleStache(id,method){return\"_.b(_.t(_.\"+method+'(\"'+esc(id)+'\",c,p,0)));'}function variable(id,method){return\"_.b(_.v(_.\"+method+'(\"'+esc(id)+'\",c,p,0)));'}function text(id){return\"_.b(\"+id+\");\"}Hogan.parse=function(tokens,text,options){options=options||{};return buildTree(tokens,\"\",[],options.sectionTags||[])},Hogan.cache={};Hogan.compile=function(text,options){options=options||{};var key=text+\"||\"+!!options.asString;var t=this.cache[key];if(t)return t;t=this.generate(writeCode(this.parse(this.scan(text,options.delimiters),text,options)),text,options);return this.cache[key]=t}})(typeof exports!==\"undefined\"?exports:Hogan);");
        sb.append("var flurryBridgeCtor=function(w){var flurryadapter={};flurryadapter.flurryCallQueue=[];flurryadapter.flurryCallInProgress=false;flurryadapter.callComplete=function(cmd){if(this.flurryCallQueue.length==0){this.flurryCallInProgress=false;return}var adapterCall=this.flurryCallQueue.splice(0,1)[0];this.executeNativeCall(adapterCall);return\"OK\"};flurryadapter.executeCall=function(command){var adapterCall=\"flurry://flurrycall?event=\"+command;var value;for(var i=1;i<arguments.length;i+=2){value=arguments[i+1];if(value==null)continue;adapterCall+=\"&\"+arguments[i]+\"=\"+escape(value)}if(this.flurryCallInProgress)this.flurryCallQueue.push(adapterCall);else this.executeNativeCall(adapterCall)};flurryadapter.executeNativeCall=function(adapterCall){if(adapterCall.length==0)return;this.flurryCallInProgress=true;w.location=adapterCall};return flurryadapter};");
        sb.append("window.Hogan=Hogan;window.flurryadapter=flurryBridgeCtor(window);");
        if (bzVar.d == 0) {
            sb.append("var mraidCtor=function(flurryBridge,initState){var mraid={};var STATES=mraid.STATES={LOADING:\"loading\",UNKNOWN:\"unknown\",DEFAULT:\"default\",EXPANDED:\"expanded\",HIDDEN:\"hidden\"};var EVENTS=mraid.EVENTS={ASSETREADY:\"assetReady\",ASSETREMOVED:\"assetRemoved\",ASSETRETIRED:\"assetRetired\",INFO:\"info\",ERROR:\"error\",ORIENTATIONCHANGE:\"orientationChange\",READY:\"ready\",STATECHANGE:\"stateChange\",VIEWABLECHANGE:\"viewableChange\"};var listeners={};var currentState=STATES.LOADING;var expandProperties={width:initState.width,height:initState.height,isModal:initState.isModal,useCustomClose:false};var collapseProperties={};var placementType=initState.placementType;var disable=false;var closeId=\"flurry-mraid-default-close\";var imgUrl=\"http://flurry.cachefly.net/adSpaceStyles/images/bttn-close-bw.png\";var safeClose=function(){try{if(window.mraid)window.mraid.close();else if(window.flurryadapter)flurryadapter.executeCall(\"adWillClose\");else console.log(\"unable to close\")}catch(error){console.log(\"unable to close: \"+error)}};var makeDefaultClose=function(){var img=document.createElement(\"img\");img.src=imgUrl;img.id=closeId;img.style.position=\"absolute\";img.style.top=\"10px\";img.style.right=\"10px\";img.style.width=\"50px\";img.style.height=\"50px\";img.style.zIndex=1E4;return img};var updateDefaultClose=function(){if(!expandProperties.useCustomClose&&(placementType===\"interstitial\"||currentState===STATES.EXPANDED))addDefaultClose();else removeDefaultClose()};var addDefaultClose=function(){var closeButton=document.getElementById(closeId);if(!closeButton){closeButton=makeDefaultClose();document.body.appendChild(closeButton)}};var removeDefaultClose=function(){var closeButton=document.getElementById(closeId);if(closeButton)document.body.removeChild(closeButton)};var setupDefaultCloseHandler=function(){document.body.addEventListener(\"click\",function(e){e=e||window.event;var target=e.target||e.srcElement;if(target.id===closeId)safeClose()})};var contains=function(value,obj){for(var i in obj)if(obj[i]===value)return true;return false};var stringify=function(obj){if(typeof obj==\"object\")if(obj.push){var out=[];for(var p in obj)if(obj.hasOwnProperty(p))out.push(obj[p]);return\"[\"+out.join(\",\")+\"]\"}else{var out=[];for(var p in obj)if(obj.hasOwnProperty(p))out.push(\"'\"+p+\"':\"+obj[p]);return\"{\"+out.join(\",\")+\"}\"}else return new String(obj)};var broadcastEvent=function(){var args=new Array(arguments.length);for(var i=0;i<arguments.length;i++)args[i]=arguments[i];var event=args.shift();try{if(listeners[event])for(var j=0;j<listeners[event].length;j++)if(typeof listeners[event][j]===\"function\")listeners[event][j].apply(undefined,args);else if(typeof listeners[event][j]===\"string\"&&typeof window[listeners[event][j]]===\"function\")window[listeners[event][j]].apply(undefined,args)}catch(e){console.log(e)}};mraid.disable=function(){removeDefaultClose();disable=true};mraid.addEventListener=function(event,listener){if(disable)return;if(!event||!listener)broadcastEvent(EVENTS.ERROR,\"Both event and listener are required.\",\"addEventListener\");else if(!contains(event,EVENTS))broadcastEvent(EVENTS.ERROR,\"Unknown event: \"+event,\"addEventListener\");else if(!listeners[event])listeners[event]=[listener];else listeners[event].push(listener);flurryBridge.executeCall(\"eventListenerAdded\")};mraid.stateChange=function(newState){if(disable)return;if(currentState===newState)return;broadcastEvent(EVENTS.INFO,\"setting state to \"+stringify(newState));var oldState=currentState;currentState=newState;if(oldState===STATES.LOADING&&newState===STATES.DEFAULT){setupDefaultCloseHandler();updateDefaultClose();broadcastEvent(EVENTS.READY)}else if(oldState===STATES.HIDDEN||newState===STATES.HIDDEN)broadcastEvent(EVENTS.VIEWABLECHANGE);else if(oldState===STATES.DEFAULT&&newState===STATES.EXPANDED)updateDefaultClose();else if(newState===STATES.DEFAULT&&oldState===STATES.EXPANDED)updateDefaultClose();broadcastEvent(EVENTS.STATECHANGE,currentState)};mraid.close=function(){if(disable)return;var state=mraid.getState();if(state===STATES.DEFAULT){mraid.stateChange(STATES.HIDDEN);flurryBridge.executeCall(\"adWillClose\")}else if(state===STATES.EXPANDED){mraid.stateChange(STATES.DEFAULT);flurryBridge.executeCall(\"collapse\")}else console.log(\"close() called in state \"+state)};mraid.expand=function(url){if(disable)return;var state=mraid.getState();if(state!==STATES.DEFAULT){console.log(\"expand() called in state \"+state);return}if(placementType===\"interstitial\"){console.log(\"expand() called for placement type \"+placementType);return}if(url)flurryBridge.executeCall(\"expand\",\"width\",expandProperties.width,\"height\",expandProperties.height,\"url\",url);else flurryBridge.executeCall(\"expand\",\"width\",expandProperties.width,\"height\",expandProperties.height);mraid.stateChange(STATES.EXPANDED)};mraid.setExpandProperties=function(properties){if(disable)return;if(typeof properties.width===\"number\"&&!isNaN(properties.width))expandProperties.width=properties.width;if(typeof properties.height===\"number\"&&!isNaN(properties.height))expandProperties.height=properties.height;if(typeof properties.useCustomClose===\"boolean\"){expandProperties.useCustomClose=properties.useCustomClose;updateDefaultClose()}};mraid.getExpandProperties=function(properties){if(disable)return;var ret={};ret.width=expandProperties.width;ret.height=expandProperties.height;ret.isModal=expandProperties.isModal;ret.useCustomClose=expandProperties.useCustomClose;return ret};mraid.getPlacementType=function(){return placementType};mraid.getVersion=function(){if(disable)return\"\";return\"1.0\"};mraid.getState=function(){if(disable)return\"\";return currentState};mraid.isViewable=function(){if(disable)return false;if(mraid.getState()===\"hidden\")return false;else return true};mraid.open=function(url){if(disable)return;try{flurryBridge.executeCall(\"open\",\"url\",url)}catch(e){console.log(e)}};mraid.removeEventListener=function(event,listener){if(disable)return;if(!event)broadcastEvent(\"error\",\"Must specify an event.\",\"removeEventListener\");else if(listener&&listeners[event])for(var i=0;i<listeners[event].length;i++){if(listeners[event][i]===listener)listeners[event].splice(i,1)}else if(listeners[event])listeners[event]=[]};mraid.useCustomClose=function(use){if(disable)return;if(typeof use===\"boolean\"){expandProperties.useCustomClose=use;updateDefaultClose()}};return mraid};");
            sb.append("window.flurryAdapterAvailable=true;if(typeof window.FlurryAdapterReady === 'function'){window.FlurryAdapterReady();}window.mraid=mraidCtor(window.flurryadapter," + str + ");");
        }
        sb.append("})();");
        if (bzVar.h != null) {
            bzVar.h.loadUrl(sb.toString());
        }
        bzVar.i = true;
    }

    static /* synthetic */ void f(bz bzVar) {
        if (bzVar.c()) {
            bi.b(bzVar.B, bi.a());
        }
    }

    static /* synthetic */ void h(bz bzVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:");
        String obj = bzVar.h().d().toString();
        if (!bzVar.x && obj != null && obj.length() > 0 && !obj.equals("{}")) {
            sb.append("(function(){");
            sb.append("if(!window.Hogan){var Hogan={};(function(Hogan,useArrayBuffer){Hogan.Template=function(renderFunc,text,compiler,options){this.r=renderFunc||this.r;this.c=compiler;this.options=options;this.text=text||\"\";this.buf=useArrayBuffer?[]:\"\"};Hogan.Template.prototype={r:function(context,partials,indent){return\"\"},v:hoganEscape,t:coerceToString,render:function render(context,partials,indent){return this.ri([context],partials||{},indent)},ri:function(context,partials,indent){return this.r(context,partials,indent)},rp:function(name,context,partials,indent){var partial=partials[name];if(!partial)return\"\";if(this.c&&typeof partial==\"string\")partial=this.c.compile(partial,this.options);return partial.ri(context,partials,indent)},rs:function(context,partials,section){var tail=context[context.length-1];if(!isArray(tail)){section(context,partials,this);return}for(var i=0;i<tail.length;i++){context.push(tail[i]);section(context,partials,this);context.pop()}},s:function(val,ctx,partials,inverted,start,end,tags){var pass;if(isArray(val)&&val.length===0)return false;if(typeof val==\"function\")val=this.ls(val,ctx,partials,inverted,start,end,tags);pass=val===\"\"||!!val;if(!inverted&&pass&&ctx)ctx.push(typeof val==\"object\"?val:ctx[ctx.length-1]);return pass},d:function(key,ctx,partials,returnFound){var names=key.split(\".\"),val=this.f(names[0],ctx,partials,returnFound),cx=null;if(key===\".\"&&isArray(ctx[ctx.length-2]))return ctx[ctx.length-1];for(var i=1;i<names.length;i++)if(val&&typeof val==\"object\"&&names[i]in val){cx=val;val=val[names[i]]}else val=\"\";if(returnFound&&!val)return false;if(!returnFound&&typeof val==\"function\"){ctx.push(cx);val=this.lv(val,ctx,partials);ctx.pop()}return val},f:function(key,ctx,partials,returnFound){var val=false,v=null,found=false;for(var i=ctx.length-1;i>=0;i--){v=ctx[i];if(v&&typeof v==\"object\"&&key in v){val=v[key];found=true;break}}if(!found)return returnFound?false:\"\";if(!returnFound&&typeof val==\"function\")val=this.lv(val,ctx,partials);return val},ho:function(val,cx,partials,text,tags){var compiler=this.c;var options=this.options;options.delimiters=tags;var t=val.call(cx,text,function(t){return compiler.compile(t,options).render(cx,partials)});this.b(compiler.compile(t.toString(),options).render(cx,partials));return false},b:useArrayBuffer?function(s){this.buf.push(s)}:function(s){this.buf+=s},fl:useArrayBuffer?function(){var r=this.buf.join(\"\");this.buf=[];return r}:function(){var r=this.buf;this.buf=\"\";return r},ls:function(val,ctx,partials,inverted,start,end,tags){var cx=ctx[ctx.length-1],t=null;if(!inverted&&this.c&&val.length>0)return this.ho(val,cx,partials,this.text.substring(start,end),tags);t=val.call(cx);if(typeof t==\"function\")if(inverted)return true;else if(this.c)return this.ho(t,cx,partials,this.text.substring(start,end),tags);return t},lv:function(val,ctx,partials){var cx=ctx[ctx.length-1];var result=val.call(cx);if(typeof result==\"function\")result=result.call(cx);result=coerceToString(result);if(this.c&&~result.indexOf(\"{{\"))return this.c.compile(result,this.options).render(cx,partials);return result}};var rAmp=/&/g,rLt=/</g,rGt=/>/g,rApos=/\\'/g,rQuot=/\\\"/g,hChars=/[&<>\\\"\\']/;function coerceToString(val){return String(val===null||val===undefined?\"\":val)}function hoganEscape(str){str=coerceToString(str);return hChars.test(str)?str.replace(rAmp,\"&amp;\").replace(rLt,\"&lt;\").replace(rGt,\"&gt;\").replace(rApos,\"&#39;\").replace(rQuot,\"&quot;\"):str}var isArray=Array.isArray||function(a){return Object.prototype.toString.call(a)===\"[object Array]\"}})(typeof exports!==\"undefined\"?exports:Hogan);(function(Hogan){var rIsWhitespace=/\\S/,rQuot=/\\\"/g,rNewline=/\\n/g,rCr=/\\r/g,rSlash=/\\\\/g,tagTypes={\"#\":1,\"^\":2,\"/\":3,\"!\":4,\">\":5,\"<\":6,\"=\":7,\"_v\":8,\"{\":9,\"&\":10};Hogan.scan=function scan(text,delimiters){var len=text.length,IN_TEXT=0,IN_TAG_TYPE=1,IN_TAG=2,state=IN_TEXT,tagType=null,tag=null,buf=\"\",tokens=[],seenTag=false,i=0,lineStart=0,otag=\"{{\",ctag=\"}}\";function addBuf(){if(buf.length>0){tokens.push(new String(buf));buf=\"\"}}function lineIsWhitespace(){var isAllWhitespace=true;for(var j=lineStart;j<tokens.length;j++){isAllWhitespace=tokens[j].tag&&tagTypes[tokens[j].tag]<tagTypes[\"_v\"]||!tokens[j].tag&&tokens[j].match(rIsWhitespace)===null;if(!isAllWhitespace)return false}return isAllWhitespace}function filterLine(haveSeenTag,noNewLine){addBuf();if(haveSeenTag&&lineIsWhitespace())for(var j=lineStart,next;j<tokens.length;j++){if(!tokens[j].tag){if((next=tokens[j+1])&&next.tag==\">\")next.indent=tokens[j].toString();tokens.splice(j,1)}}else if(!noNewLine)tokens.push({tag:\"\\n\"});seenTag=false;lineStart=tokens.length}function changeDelimiters(text,index){var close=\"=\"+ctag,closeIndex=text.indexOf(close,index),delimiters=trim(text.substring(text.indexOf(\"=\",index)+1,closeIndex)).split(\" \");otag=delimiters[0];ctag=delimiters[1];return closeIndex+close.length-1}if(delimiters){delimiters=delimiters.split(\" \");otag=delimiters[0];ctag=delimiters[1]}for(i=0;i<len;i++)if(state==IN_TEXT)if(tagChange(otag,text,i)){--i;addBuf();state=IN_TAG_TYPE}else if(text.charAt(i)==\"\\n\")filterLine(seenTag);else buf+=text.charAt(i);else if(state==IN_TAG_TYPE){i+=otag.length-1;tag=tagTypes[text.charAt(i+1)];tagType=tag?text.charAt(i+1):\"_v\";if(tagType==\"=\"){i=changeDelimiters(text,i);state=IN_TEXT}else{if(tag)i++;state=IN_TAG}seenTag=i}else if(tagChange(ctag,text,i)){tokens.push({tag:tagType,n:trim(buf),otag:otag,ctag:ctag,i:tagType==\"/\"?seenTag-ctag.length:i+otag.length});buf=\"\";i+=ctag.length-1;state=IN_TEXT;if(tagType==\"{\")if(ctag==\"}}\")i++;else cleanTripleStache(tokens[tokens.length-1])}else buf+=text.charAt(i);filterLine(seenTag,true);return tokens};function cleanTripleStache(token){if(token.n.substr(token.n.length-1)===\"}\")token.n=token.n.substring(0,token.n.length-1)}function trim(s){if(s.trim)return s.trim();return s.replace(/^\\s*|\\s*$/g,\"\")}function tagChange(tag,text,index){if(text.charAt(index)!=tag.charAt(0))return false;for(var i=1,l=tag.length;i<l;i++)if(text.charAt(index+i)!=tag.charAt(i))return false;return true}function buildTree(tokens,kind,stack,customTags){var instructions=[],opener=null,token=null;while(tokens.length>0){token=tokens.shift();if(token.tag==\"#\"||token.tag==\"^\"||isOpener(token,customTags)){stack.push(token);token.nodes=buildTree(tokens,token.tag,stack,customTags);instructions.push(token)}else if(token.tag==\"/\"){if(stack.length===0)throw new Error(\"Closing tag without opener: /\"+token.n);opener=stack.pop();if(token.n!=opener.n&&!isCloser(token.n,opener.n,customTags))throw new Error(\"Nesting error: \"+opener.n+\" vs. \"+token.n);opener.end=token.i;return instructions}else instructions.push(token)}if(stack.length>0)throw new Error(\"missing closing tag: \"+stack.pop().n);return instructions}function isOpener(token,tags){for(var i=0,l=tags.length;i<l;i++)if(tags[i].o==token.n){token.tag=\"#\";return true}}function isCloser(close,open,tags){for(var i=0,l=tags.length;i<l;i++)if(tags[i].c==close&&tags[i].o==open)return true}function writeCode(tree){return'var _=this;_.b(i=i||\"\");'+walk(tree)+\"return _.fl();\"}Hogan.generate=function(code,text,options){if(options.asString)return\"function(c,p,i){\"+code+\";}\";return new Hogan.Template(new Function(\"c\",\"p\",\"i\",code),text,Hogan,options)};function esc(s){return s.replace(rSlash,\"\\\\\\\\\").replace(rQuot,'\\\\\"').replace(rNewline,\"\\\\n\").replace(rCr,\"\\\\r\")}function chooseMethod(s){return~s.indexOf(\".\")?\"d\":\"f\"}function walk(tree){var code=\"\";for(var i=0,l=tree.length;i<l;i++){var tag=tree[i].tag;if(tag==\"#\")code+=section(tree[i].nodes,tree[i].n,chooseMethod(tree[i].n),tree[i].i,tree[i].end,tree[i].otag+\" \"+tree[i].ctag);else if(tag==\"^\")code+=invertedSection(tree[i].nodes,tree[i].n,chooseMethod(tree[i].n));else if(tag==\"<\"||tag==\">\")code+=partial(tree[i]);else if(tag==\"{\"||tag==\"&\")code+=tripleStache(tree[i].n,chooseMethod(tree[i].n));else if(tag==\"\\n\")code+=text('\"\\\\n\"'+(tree.length-1==i?\"\":\" + i\"));else if(tag==\"_v\")code+=variable(tree[i].n,chooseMethod(tree[i].n));else if(tag===undefined)code+=text('\"'+esc(tree[i])+'\"')}return code}function section(nodes,id,method,start,end,tags){return\"if(_.s(_.\"+method+'(\"'+esc(id)+'\",c,p,1),'+\"c,p,0,\"+start+\",\"+end+',\"'+tags+'\")){'+\"_.rs(c,p,\"+\"function(c,p,_){\"+walk(nodes)+\"});c.pop();}\"}function invertedSection(nodes,id,method){return\"if(!_.s(_.\"+method+'(\"'+esc(id)+'\",c,p,1),c,p,1,0,0,\"\")){'+walk(nodes)+\"};\"}function partial(tok){return'_.b(_.rp(\"'+esc(tok.n)+'\",c,p,\"'+(tok.indent||\"\")+'\"));'}function tripleStache(id,method){return\"_.b(_.t(_.\"+method+'(\"'+esc(id)+'\",c,p,0)));'}function variable(id,method){return\"_.b(_.v(_.\"+method+'(\"'+esc(id)+'\",c,p,0)));'}function text(id){return\"_.b(\"+id+\");\"}Hogan.parse=function(tokens,text,options){options=options||{};return buildTree(tokens,\"\",[],options.sectionTags||[])},Hogan.cache={};Hogan.compile=function(text,options){options=options||{};var key=text+\"||\"+!!options.asString;var t=this.cache[key];if(t)return t;t=this.generate(writeCode(this.parse(this.scan(text,options.delimiters),text,options)),text,options);return this.cache[key]=t}})(typeof exports!==\"undefined\"?exports:Hogan);window.Hogan=Hogan;}");
            sb.append("if(!window.flurryadapter){var flurryBridgeCtor=function(w){var flurryadapter={};flurryadapter.flurryCallQueue=[];flurryadapter.flurryCallInProgress=false;flurryadapter.callComplete=function(cmd){if(this.flurryCallQueue.length==0){this.flurryCallInProgress=false;return}var adapterCall=this.flurryCallQueue.splice(0,1)[0];this.executeNativeCall(adapterCall);return\"OK\"};flurryadapter.executeCall=function(command){var adapterCall=\"flurry://flurrycall?event=\"+command;var value;for(var i=1;i<arguments.length;i+=2){value=arguments[i+1];if(value==null)continue;adapterCall+=\"&\"+arguments[i]+\"=\"+escape(value)}if(this.flurryCallInProgress)this.flurryCallQueue.push(adapterCall);else this.executeNativeCall(adapterCall)};flurryadapter.executeNativeCall=function(adapterCall){if(adapterCall.length==0)return;this.flurryCallInProgress=true;w.location=adapterCall};return flurryadapter};window.flurryadapter=flurryBridgeCtor(window);}");
            sb.append("if(!window.flurryAdapterAvailable){window.flurryAdapterAvailable=true;if(typeof window.FlurryAdapterReady === 'function'){window.FlurryAdapterReady();} }");
            String d = bp.d(obj);
            sb.append("var content='");
            sb.append(d);
            sb.append("';var compiled=window.Hogan.compile(document.body.innerHTML);var rendered=compiled.render(JSON.parse(content));document.body.innerHTML=rendered;");
            sb.append("if(window.mraid){window.mraid.useCustomClose(true);}");
            sb.append("})();");
        }
        sb.append("if(window.mraid){window.mraid.stateChange(window.mraid.STATES.DEFAULT);}");
        if (bzVar.h != null) {
            bzVar.h.loadUrl(sb.toString());
        }
    }

    bz(Context context, s sVar, dl dlVar, j jVar, int i) {
        super(context, sVar, dlVar);
        this.e = getClass().getSimpleName();
        this.E = null;
        this.A = context;
        if (context instanceof Activity) {
            this.B = (Activity) context;
        }
        setClickable(true);
        this.c = jVar;
        this.d = i;
        this.b = dlVar;
        if (this.c != null) {
            this.w = this.c.d();
            this.x = this.c.e().intValue() == 1;
            if (this.x) {
                this.z = new HashMap();
                this.y = new HashMap();
                this.z.put(dlVar.b(), dlVar);
                this.y.put(((b) jVar.d().get(0)).g().toString(), jVar);
            }
            this.C = sVar;
            this.D = this.C.b;
            this.c = this.c;
            this.b = this.b;
            this.F = new LinkedList();
        }
    }

    private void e() {
        if (c()) {
            try {
                ((Activity) this.A).finish();
            } catch (ClassCastException e) {
                String str = "caught class cast exception: " + e;
            }
        }
    }

    @Override // com.flurry.android.eb
    public final void a(Context context) {
        byte b = 0;
        String str = "initLayout: ad creative layout: {width = " + h().e().b() + ", height = " + h().e().c() + "}";
        removeAllViews();
        setFocusable(true);
        setFocusableInTouchMode(true);
        switch (a()) {
            case 1:
            case 2:
                if (this.h == null) {
                    this.h = new WebView(context);
                    this.h.getSettings().setJavaScriptEnabled(true);
                    this.h.setVerticalScrollBarEnabled(false);
                    this.h.setHorizontalScrollBarEnabled(false);
                    this.h.setBackgroundColor(0);
                    this.h.clearCache(false);
                    this.k = new de(this, b);
                    this.h.setWebChromeClient(this.k);
                    this.j = new cl(this, b);
                    this.h.setWebViewClient(this.j);
                }
                a("rendered", Collections.emptyMap(), this.c, this.b, this.d, 0);
                if (a() == 1) {
                    if (this.E != null) {
                        this.h.loadUrl(this.E);
                    } else {
                        this.h.loadUrl(f());
                    }
                } else if (a() == 2) {
                    this.h.loadDataWithBaseURL("base://url/", f(), "text/html", "utf-8", "base://url/");
                }
                this.h.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                break;
            case 3:
                if (this.g == null) {
                    this.g = new cr(context);
                    this.g.setOnPreparedListener(this);
                    this.g.setOnCompletionListener(this);
                    this.g.setOnErrorListener(this);
                    this.g.setMediaController(new MediaController(context));
                }
                this.g.setVideoURI(Uri.parse(f()));
                Cdo.a(this.e, "URI: " + Uri.parse(f()).toString());
                this.g.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                addView(this.g);
                ((RelativeLayout) this.g.getParent()).setGravity(17);
                this.f = new ProgressDialog(context);
                this.f.setProgressStyle(0);
                this.f.setMessage("Loading...");
                this.f.setCancelable(true);
                this.f.setOnKeyListener(this);
                this.f.show();
                break;
            default:
                a("renderFailed", Collections.emptyMap(), this.c, this.b, this.d, 0);
                break;
        }
    }

    @Override // com.flurry.android.by
    public final void a(aq aqVar, s sVar, int i) {
        int i2;
        int i3;
        int i4;
        String str;
        String str2;
        String str3;
        String str4 = aqVar.a;
        di diVar = aqVar.c;
        Map map = aqVar.b;
        if (i > 10) {
            String str5 = "Maximum depth for event/action loop exceeded when performing action:" + str4 + "," + map + ",triggered by:" + diVar.a;
            return;
        }
        String str6 = "performAction(action=" + str4 + ",params=" + aqVar.b + ",triggering event=" + diVar.a + ")";
        if (str4.equals("nextAdUnit")) {
            try {
                an anVar = (an) getParent();
                if (anVar != null) {
                    try {
                        i2 = Integer.parseInt((String) aqVar.b.get("delay"));
                    } catch (NumberFormatException e) {
                        i2 = 0;
                    }
                    anVar.a(i2 * ThemeShellDescription.PICKER_MENU);
                }
            } catch (ClassCastException e2) {
                e2.toString();
                e();
                if (!c()) {
                    try {
                        this.C.b(this.A, this.c.b().toString());
                    } catch (Exception e3) {
                        String str7 = "remove ad exception: " + e3;
                    }
                }
            }
        } else if (str4.equals("nextFrame")) {
            int i5 = this.d + 1;
            String str8 = (String) map.get("offset");
            if (str8 != null) {
                if (str8.equals("next")) {
                    i5 = this.d + 1;
                } else if (!str8.equals("current")) {
                    try {
                        i5 = Integer.parseInt(str8);
                    } catch (NumberFormatException e4) {
                        String str9 = "caught: " + e4.getMessage();
                    }
                } else {
                    return;
                }
            }
            a("clicked", Collections.emptyMap());
            if (this.x) {
                String str10 = (String) aqVar.c.b.get("guid");
                if (str10 != null) {
                    this.c = b(str10);
                    this.w = this.c.d();
                    this.b = aqVar.c.e;
                    if (c()) {
                        this.C.a(this.c);
                        this.C.b(this.b);
                    }
                    this.d = i5;
                    this.x = false;
                    a(this.A);
                }
            } else if (i5 != this.d && i5 < this.w.size()) {
                b bVar = (b) this.c.d().get(i5);
                String g = g();
                String obj = bVar.e().e().toString();
                if (obj.equals(g)) {
                    this.d = i5;
                    a(this.A);
                } else if (obj.equals("takeover")) {
                    this.C.b(this.b);
                    this.C.a(this.c);
                    Intent intent = new Intent(this.A, (Class<?>) FlurryFullscreenTakeoverActivity.class);
                    intent.putExtra("frameIndex", i5);
                    s sVar2 = this.C;
                    s.a(this.A, intent, this.c.b().toString());
                }
            }
        } else if (str4.equals("closeAd")) {
            e();
        } else if (str4.equals("notifyUser")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.A);
            if (map.containsKey("message") && map.containsKey("confirmDisplay") && map.containsKey("cancelDisplay")) {
                str = (String) map.get("message");
                str2 = (String) map.get("confirmDisplay");
                str3 = (String) map.get("cancelDisplay");
            } else {
                str = "Are you sure?";
                str2 = "Cancel";
                str3 = "OK";
            }
            builder.setMessage(str).setCancelable(false).setPositiveButton(str3, new cj(this, diVar, i)).setNegativeButton(str2, new cf(this, diVar, i));
            this.v = builder.create();
            if (this.g != null && a() == 3) {
                this.g.pause();
            }
            this.v.show();
        } else if (str4.equals("loadAdComponents")) {
            int i6 = 3;
            if (map.containsKey("min") && map.containsKey("max")) {
                try {
                    Integer.parseInt((String) map.get("min"));
                    i6 = Integer.parseInt((String) map.get("max"));
                } catch (NumberFormatException e5) {
                    i6 = 3;
                }
            }
            this.c.b().toString();
            List<j> a = a(i6);
            if (a.size() > 0) {
                this.c.b().toString();
                String a2 = a(a);
                if (this.h != null) {
                    this.h.loadUrl("javascript:(function() {var multiadwraps=document.getElementsByClassName('multiAdWrap');if(multiadwraps.length>0){var template=document.getElementsByClassName('multiAdWrap')[0];var compiled=Hogan.compile(template.innerHTML);template.innerHTML='';template.innerHTML=compiled.render(JSON.parse(" + a2 + "));}})();");
                    this.h.loadUrl("javascript:flurryadapter.callComplete();");
                }
                for (j jVar : a) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("guid", ((b) jVar.d().get(0)).g().toString());
                    a("rendered", hashMap, jVar, a(((b) jVar.d().get(0)).g().toString()), 0, 0);
                }
                if (this.h != null && !a(this.h)) {
                    addView(this.h);
                }
            } else {
                a("renderFailed", Collections.emptyMap(), this.c, this.b, this.d, 0);
            }
        } else if (str4.equals("doExpand")) {
            int a3 = bp.a(this.A);
            int b = bp.b(this.A);
            if (aqVar.c.b.containsKey("width") && aqVar.c.b.containsKey("height")) {
                try {
                    i3 = bp.b(this.A, Integer.parseInt((String) aqVar.c.b.get("width")));
                    i4 = bp.b(this.A, Integer.parseInt((String) aqVar.c.b.get("height")));
                } catch (NumberFormatException e6) {
                    e6.getMessage();
                    i3 = bp.a(this.A);
                    i4 = bp.b(this.A);
                }
            } else {
                i3 = a3;
                i4 = b;
            }
            String str11 = "expand to width = " + i3 + " height = " + i4;
            try {
                if (((an) getParent()) != null) {
                    a("clicked", Collections.emptyMap());
                    if (this.r == null) {
                        String str12 = "expand(" + i3 + "," + i4 + ")";
                        if (this.h != null && -1 != indexOfChild(this.h)) {
                            removeView(this.h);
                        }
                        this.q = this.B.getRequestedOrientation();
                        if (this.s == null) {
                            this.s = new FrameLayout(this.A);
                            this.s.setBackgroundColor(-16777216);
                            if (this.h != null && this.h.getParent() == null) {
                                this.s.addView(this.h, new FrameLayout.LayoutParams(-1, -1, 17));
                            }
                        }
                        if (this.r == null) {
                            this.r = new Dialog(this.A, R.style.Theme.Black.NoTitleBar.Fullscreen);
                            ei.a(this.r.getWindow());
                            this.r.setContentView(this.s, new ViewGroup.LayoutParams(-1, -1));
                            this.r.setOnDismissListener(new ch(this));
                            this.r.setCancelable(true);
                            this.r.show();
                        }
                        bi.b(this.B, bi.a());
                        s sVar3 = this.a;
                        this.c.b().toString();
                        sVar3.a(false);
                    }
                }
                if (aqVar.c.b.containsKey("url")) {
                    this.E = (String) aqVar.c.b.get("url");
                    a(this.A);
                }
            } catch (ClassCastException e7) {
                e7.getMessage();
            }
        } else if (str4.equals("doCollapse")) {
            int intValue = h().e().b().intValue();
            int intValue2 = h().e().c().intValue();
            int b2 = bp.b(this.A, intValue);
            int b3 = bp.b(this.A, intValue2);
            if (this.E != null) {
                this.E = null;
                a(this.A);
            }
            try {
                if (((an) getParent()) != null) {
                    a(b2, b3);
                }
            } catch (ClassCastException e8) {
                String str13 = "action doCollapse failed:" + e8.getMessage();
            }
        } else {
            if (str4.equals("directOpen")) {
                a("clicked", Collections.emptyMap());
            }
            this.a.a(aqVar, sVar, i);
        }
        if (!this.F.contains(aqVar.c.a) || this.h == null) {
            return;
        }
        this.h.loadUrl("javascript:flurryadapter.callComplete('" + aqVar.c.a + "');");
        this.F.remove(aqVar.c.a);
    }

    private void a(int i, int i2) {
        if (this.r != null) {
            String str = "collapse(" + i + "," + i2 + ")";
            if (this.r != null && this.r.isShowing()) {
                this.r.hide();
                this.r.setOnDismissListener(null);
                this.r.dismiss();
            }
            this.r = null;
            bi.a(this.B, this.q);
            if (this.s != null) {
                if (this.h != null && -1 != this.s.indexOfChild(this.h)) {
                    this.s.removeView(this.h);
                }
                this.s = null;
            }
            if (this.h != null && this.h.getParent() == null) {
                addView(this.h);
            }
            s sVar = this.a;
            this.c.b().toString();
            sVar.d();
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        a("videoCompleted", Collections.emptyMap(), this.c, this.b, this.d, 0);
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        if (a() == 3) {
            if (this.f.isShowing()) {
                this.f.dismiss();
            }
            if (this.v == null || !this.v.isShowing()) {
                this.g.start();
            }
            a("rendered", Collections.emptyMap(), this.c, this.b, this.d, 0);
            a("videoStart", Collections.emptyMap(), this.c, this.b, this.d, 0);
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.f != null && this.f.isShowing()) {
            this.f.dismiss();
        }
        a("renderFailed", Collections.emptyMap(), this.c, this.b, this.d, 0);
        removeView(this.g);
        return false;
    }

    @Override // com.flurry.android.eb
    public final void b() {
        if (a() == 3) {
            if (this.f != null && this.f.isShowing()) {
                this.f.dismiss();
            }
            if (this.g != null && this.g.isPlaying()) {
                this.g.stopPlayback();
            }
        }
        if (this.h != null) {
            if (this.l != null && this.k != null) {
                this.k.onHideCustomView();
            }
            if (this.r != null) {
                a(0, 0);
            }
            removeView(this.h);
            this.h.stopLoading();
            if (dx.a >= 11) {
                this.h.onPause();
            }
            this.h.destroy();
            this.h = null;
        }
        if (c()) {
            a("adClosed", Collections.emptyMap(), this.c, this.b, this.d, 0);
        }
    }

    final void a(String str, Map map, j jVar, dl dlVar, int i, int i2) {
        String str2 = "fireEvent(event=" + str + ",params=" + map + ")";
        this.a.a(new di(str, map, this.A, jVar, dlVar, i), this, i2);
    }

    final int a() {
        return h().b().intValue();
    }

    private String f() {
        return h().c().toString();
    }

    private String g() {
        return h().e().e().toString();
    }

    final boolean c() {
        return g().equals("takeover");
    }

    private b h() {
        return (b) this.w.get(this.d);
    }

    private static String a(List list) {
        StringBuilder sb = new StringBuilder();
        sb.append("'{\"adComponents\":[");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(bp.d(((b) ((j) it.next()).d().get(0)).d().toString()));
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        sb.append("]}'");
        return sb.toString();
    }

    private List a(int i) {
        List<j> b = this.D.b(this.c.b().toString(), i);
        for (j jVar : b) {
            if (jVar.d().size() > 0) {
                this.y.put(((b) jVar.d().get(0)).g().toString(), jVar);
            }
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public dl a(String str) {
        if (this.z == null) {
            return null;
        }
        dl dlVar = (dl) this.z.get(str);
        if (dlVar == null) {
            dl a = dj.a(this.C, str);
            this.z.put(str, a);
            return a;
        }
        return dlVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j b(String str) {
        if (this.y == null) {
            return null;
        }
        return (j) this.y.get(str);
    }

    @Override // com.flurry.android.eb
    final boolean d() {
        if (!(this.r != null)) {
            if (!(this.o != null)) {
                return true;
            }
        }
        return false;
    }

    final boolean a(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent == this;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        String str = "onkey,keycode=" + i + ",event=" + keyEvent.getAction();
        if (dialogInterface != this.f || i != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        a("adWillClose", Collections.emptyMap(), this.c, this.b, this.d, 0);
        dialogInterface.dismiss();
        return true;
    }
}
