package com.flurry.a.b.a.b;

import com.censivn.C3DEngine.api.tween.VEasing;
import com.flurry.a.b.a.h.l;
import com.flurry.a.b.a.k;
import com.flurry.a.b.a.o;
import com.flurry.a.b.a.p;
import java.io.IOException;
import java.io.Reader;

/* loaded from: classes.dex */
public final class h extends c {
    protected Reader I;
    protected char[] J;
    protected p K;
    protected final com.flurry.a.b.a.f.c L;
    protected boolean M;

    public h(com.flurry.a.b.a.c.b bVar, int i, Reader reader, p pVar, com.flurry.a.b.a.f.c cVar) {
        super(bVar, i);
        this.M = false;
        this.I = reader;
        this.J = bVar.d();
        this.K = pVar;
        this.L = cVar;
    }

    @Override // com.flurry.a.b.a.j
    public final p a() {
        return this.K;
    }

    @Override // com.flurry.a.b.a.b.c
    protected final boolean B() {
        this.h += this.g;
        this.j -= this.g;
        if (this.I == null) {
            return false;
        }
        int read = this.I.read(this.J, 0, this.J.length);
        if (read > 0) {
            this.f = 0;
            this.g = read;
            return true;
        }
        C();
        if (read == 0) {
            throw new IOException("Reader returned 0 characters when trying to read " + this.g);
        }
        return false;
    }

    private char e(String str) {
        if (this.f >= this.g && !B()) {
            c(str);
        }
        char[] cArr = this.J;
        int i = this.f;
        this.f = i + 1;
        return cArr[i];
    }

    @Override // com.flurry.a.b.a.b.c
    protected final void C() {
        if (this.I != null) {
            if (this.d.b() || a(k.AUTO_CLOSE_SOURCE)) {
                this.I.close();
            }
            this.I = null;
        }
    }

    @Override // com.flurry.a.b.a.b.c
    protected final void D() {
        super.D();
        char[] cArr = this.J;
        if (cArr != null) {
            this.J = null;
            this.d.a(cArr);
        }
    }

    @Override // com.flurry.a.b.a.b.d, com.flurry.a.b.a.j
    public final String k() {
        o oVar = this.b;
        if (oVar == o.VALUE_STRING) {
            if (this.M) {
                this.M = false;
                L();
            }
            return this.p.e();
        }
        if (oVar == null) {
            return null;
        }
        switch (i.a[oVar.ordinal()]) {
            case 1:
                return this.n.h();
            case 2:
            case 3:
            case 4:
                return this.p.e();
            default:
                return oVar.a();
        }
    }

    @Override // com.flurry.a.b.a.j
    public final char[] l() {
        if (this.b != null) {
            switch (i.a[this.b.ordinal()]) {
                case 1:
                    if (!this.r) {
                        String h = this.n.h();
                        int length = h.length();
                        if (this.q == null) {
                            this.q = this.d.a(length);
                        } else if (this.q.length < length) {
                            this.q = new char[length];
                        }
                        h.getChars(0, length, this.q, 0);
                        this.r = true;
                    }
                    return this.q;
                case 2:
                    if (this.M) {
                        this.M = false;
                        L();
                        break;
                    }
                    break;
                case 3:
                case 4:
                    break;
                default:
                    return this.b.b();
            }
            return this.p.d();
        }
        return null;
    }

    @Override // com.flurry.a.b.a.j
    public final int m() {
        if (this.b == null) {
            return 0;
        }
        switch (i.a[this.b.ordinal()]) {
            case 1:
                return this.n.h().length();
            case 2:
                if (this.M) {
                    this.M = false;
                    L();
                    break;
                }
                break;
            case 3:
            case 4:
                break;
            default:
                return this.b.b().length;
        }
        return this.p.b();
    }

    @Override // com.flurry.a.b.a.j
    public final int n() {
        if (this.b == null) {
            return 0;
        }
        switch (i.a[this.b.ordinal()]) {
            case 1:
            default:
                return 0;
            case 2:
                if (this.M) {
                    this.M = false;
                    L();
                    break;
                }
                break;
            case 3:
            case 4:
                break;
        }
        return this.p.c();
    }

    @Override // com.flurry.a.b.a.j
    public final byte[] a(com.flurry.a.b.a.a aVar) {
        if (this.b != o.VALUE_STRING && (this.b != o.VALUE_EMBEDDED_OBJECT || this.t == null)) {
            d("Current token (" + this.b + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.M) {
            try {
                this.t = b(aVar);
                this.M = false;
            } catch (IllegalArgumentException e) {
                throw a("Failed to decode VALUE_STRING as base64 (" + aVar + "): " + e.getMessage());
            }
        } else if (this.t == null) {
            com.flurry.a.b.a.h.d F = F();
            a(k(), F, aVar);
            this.t = F.b();
        }
        return this.t;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.flurry.a.b.a.b.d, com.flurry.a.b.a.j
    public final o b() {
        char c;
        o c2;
        int i;
        this.y = 0;
        if (this.b == o.FIELD_NAME) {
            this.r = false;
            o oVar = this.o;
            this.o = null;
            if (oVar == o.START_ARRAY) {
                this.n = this.n.a(this.l, this.m);
            } else if (oVar == o.START_OBJECT) {
                this.n = this.n.b(this.l, this.m);
            }
            this.b = oVar;
            return oVar;
        }
        if (this.M) {
            this.M = false;
            int i2 = this.f;
            int i3 = this.g;
            char[] cArr = this.J;
            while (true) {
                if (i2 >= i3) {
                    this.f = i2;
                    if (!B()) {
                        c(": was expecting closing quote for a string value");
                    }
                    i2 = this.f;
                    i3 = this.g;
                }
                i = i2 + 1;
                char c3 = cArr[i2];
                if (c3 <= '\\') {
                    if (c3 == '\\') {
                        this.f = i;
                        G();
                        i2 = this.f;
                        i3 = this.g;
                    } else if (c3 <= '\"') {
                        if (c3 == '\"') {
                            break;
                        }
                        if (c3 < ' ') {
                            this.f = i;
                            c(c3, "string value");
                        }
                    }
                }
                i2 = i;
            }
            this.f = i;
        }
        while (true) {
            if (this.f >= this.g && !B()) {
                E();
                c = 65535;
                break;
            }
            char[] cArr2 = this.J;
            int i4 = this.f;
            this.f = i4 + 1;
            c = cArr2[i4];
            if (c > ' ') {
                if (c != '/') {
                    break;
                }
                P();
            } else if (c != ' ') {
                if (c == '\n') {
                    N();
                } else if (c == '\r') {
                    M();
                } else if (c != '\t') {
                    a((int) c);
                }
            }
        }
        if (c < 0) {
            close();
            this.b = null;
            return null;
        }
        this.k = (this.h + this.f) - 1;
        this.l = this.i;
        this.m = (this.f - this.j) - 1;
        this.t = null;
        if (c == ']') {
            if (!this.n.a()) {
                a((int) c, '}');
            }
            this.n = this.n.i();
            o oVar2 = o.END_ARRAY;
            this.b = oVar2;
            return oVar2;
        }
        if (c == '}') {
            if (!this.n.c()) {
                a((int) c, ']');
            }
            this.n = this.n.i();
            o oVar3 = o.END_OBJECT;
            this.b = oVar3;
            return oVar3;
        }
        int i5 = c;
        if (this.n.j()) {
            if (c != ',') {
                b(c, "was expecting comma to separate " + this.n.d() + " entries");
            }
            i5 = O();
        }
        boolean c4 = this.n.c();
        int i6 = i5;
        if (c4) {
            this.n.a(d(i5));
            this.b = o.FIELD_NAME;
            int O = O();
            if (O != 58) {
                b(O, "was expecting a colon to separate field name and value");
            }
            i6 = O();
        }
        switch (i6) {
            case 34:
                this.M = true;
                c2 = o.VALUE_STRING;
                break;
            case 45:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                c2 = c(i6);
                break;
            case 91:
                if (!c4) {
                    this.n = this.n.a(this.l, this.m);
                }
                c2 = o.START_ARRAY;
                break;
            case 93:
            case 125:
                b(i6, "expected a value");
                a("true", 1);
                c2 = o.VALUE_TRUE;
                break;
            case VEasing.Circ.easeInOut /* 102 */:
                a("false", 1);
                c2 = o.VALUE_FALSE;
                break;
            case 110:
                a("null", 1);
                c2 = o.VALUE_NULL;
                break;
            case 116:
                a("true", 1);
                c2 = o.VALUE_TRUE;
                break;
            case 123:
                if (!c4) {
                    this.n = this.n.b(this.l, this.m);
                }
                c2 = o.START_OBJECT;
                break;
            default:
                switch (i6) {
                    case 39:
                        if (a(k.ALLOW_SINGLE_QUOTES)) {
                            c2 = K();
                            break;
                        }
                        b(i6, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
                        c2 = null;
                        break;
                    case 43:
                        if (this.f >= this.g && !B()) {
                            I();
                        }
                        char[] cArr3 = this.J;
                        int i7 = this.f;
                        this.f = i7 + 1;
                        c2 = a((int) cArr3[i7], false);
                        break;
                    case 78:
                        a("NaN", 1);
                        if (!a(k.ALLOW_NON_NUMERIC_NUMBERS)) {
                            d("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
                            b(i6, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
                            c2 = null;
                            break;
                        } else {
                            c2 = a("NaN", Double.NaN);
                            break;
                        }
                    default:
                        b(i6, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
                        c2 = null;
                        break;
                }
        }
        if (c4) {
            this.o = c2;
            return this.b;
        }
        this.b = c2;
        return c2;
    }

    @Override // com.flurry.a.b.a.b.c, com.flurry.a.b.a.j, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.L.b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r12v0 ??, r12v1 ??, r12v2 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    private com.flurry.a.b.a.o c(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r12v0 ??, r12v1 ??, r12v2 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        */

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ??, r9v1 ??, r9v2 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    private com.flurry.a.b.a.o a(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ??, r9v1 ??, r9v2 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        */

    /* JADX WARN: Removed duplicated region for block: B:63:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0122 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String d(int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (i != 34) {
            if (i == 39 && a(k.ALLOW_SINGLE_QUOTES)) {
                int i6 = this.f;
                int i7 = this.g;
                if (i6 < i7) {
                    int[] a = com.flurry.a.b.a.h.e.a();
                    int length = a.length;
                    do {
                        char c = this.J[i6];
                        if (c != '\'') {
                            if (c < length && a[c] != 0) {
                                break;
                            }
                            i5 = (i5 * 31) + c;
                            i6++;
                        } else {
                            int i8 = this.f;
                            this.f = i6 + 1;
                            return this.L.a(this.J, i8, i6 - i8, i5);
                        }
                    } while (i6 < i7);
                }
                int i9 = this.f;
                this.f = i6;
                return a(i9, i5, 39);
            }
            if (!a(k.ALLOW_UNQUOTED_FIELD_NAMES)) {
                b(i, "was expecting double-quote to start field name");
            }
            int[] b = com.flurry.a.b.a.h.e.b();
            int length2 = b.length;
            if (!(i < length2 ? b[i] == 0 && (i < 48 || i > 57) : Character.isJavaIdentifierPart((char) i))) {
                b(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
            }
            int i10 = this.f;
            int i11 = this.g;
            if (i10 < i11) {
                i2 = i10;
                i3 = 0;
                do {
                    char c2 = this.J[i2];
                    if (c2 < length2) {
                        if (b[c2] != 0) {
                            int i12 = this.f - 1;
                            this.f = i2;
                            return this.L.a(this.J, i12, i2 - i12, i3);
                        }
                    } else if (!Character.isJavaIdentifierPart(c2)) {
                        int i13 = this.f - 1;
                        this.f = i2;
                        return this.L.a(this.J, i13, i2 - i13, i3);
                    }
                    i3 = (i3 * 31) + c2;
                    i2++;
                } while (i2 < i11);
            } else {
                i2 = i10;
                i3 = 0;
            }
            int i14 = this.f - 1;
            this.f = i2;
            this.p.a(this.J, i14, this.f - i14);
            char[] i15 = this.p.i();
            int k = this.p.k();
            int length3 = b.length;
            char[] cArr = i15;
            int i16 = i3;
            int i17 = k;
            while (true) {
                if (this.f >= this.g && !B()) {
                    break;
                }
                char c3 = this.J[this.f];
                if (c3 <= length3) {
                    if (b[c3] != 0) {
                        break;
                    }
                    this.f++;
                    i16 = (i16 * 31) + c3;
                    i4 = i17 + 1;
                    cArr[i17] = c3;
                    if (i4 < cArr.length) {
                        cArr = this.p.l();
                        i17 = 0;
                    } else {
                        i17 = i4;
                    }
                } else {
                    if (!Character.isJavaIdentifierPart(c3)) {
                        break;
                    }
                    this.f++;
                    i16 = (i16 * 31) + c3;
                    i4 = i17 + 1;
                    cArr[i17] = c3;
                    if (i4 < cArr.length) {
                    }
                }
            }
            this.p.a(i17);
            l lVar = this.p;
            return this.L.a(lVar.d(), lVar.c(), lVar.b(), i16);
        }
        int i18 = this.f;
        int i19 = this.g;
        if (i18 < i19) {
            int[] a2 = com.flurry.a.b.a.h.e.a();
            int length4 = a2.length;
            while (true) {
                char c4 = this.J[i18];
                if (c4 < length4 && a2[c4] != 0) {
                    if (c4 == '\"') {
                        int i20 = this.f;
                        this.f = i18 + 1;
                        return this.L.a(this.J, i20, i18 - i20, i5);
                    }
                } else {
                    i5 = (i5 * 31) + c4;
                    i18++;
                    if (i18 >= i19) {
                        break;
                    }
                }
            }
        }
        int i21 = this.f;
        this.f = i18;
        return a(i21, i5, 34);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String a(int i, int i2, int i3) {
        char c;
        int i4;
        this.p.a(this.J, i, this.f - i);
        char[] i5 = this.p.i();
        int k = this.p.k();
        while (true) {
            if (this.f >= this.g && !B()) {
                c(": was expecting closing '" + ((char) i3) + "' for name");
            }
            char[] cArr = this.J;
            int i6 = this.f;
            this.f = i6 + 1;
            char c2 = cArr[i6];
            if (c2 <= '\\') {
                if (c2 == '\\') {
                    c = G();
                    i2 = (i2 * 31) + c2;
                    i4 = k + 1;
                    i5[k] = c;
                    if (i4 < i5.length) {
                        i5 = this.p.l();
                        k = 0;
                    } else {
                        k = i4;
                    }
                } else if (c2 <= i3) {
                    if (c2 != i3) {
                        if (c2 < ' ') {
                            c(c2, "name");
                        }
                    } else {
                        this.p.a(k);
                        l lVar = this.p;
                        return this.L.a(lVar.d(), lVar.c(), lVar.b(), i2);
                    }
                }
            }
            c = c2;
            i2 = (i2 * 31) + c2;
            i4 = k + 1;
            i5[k] = c;
            if (i4 < i5.length) {
            }
        }
    }

    private o K() {
        char[] j = this.p.j();
        int k = this.p.k();
        while (true) {
            if (this.f >= this.g && !B()) {
                c(": was expecting closing quote for a string value");
            }
            char[] cArr = this.J;
            int i = this.f;
            this.f = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    c = G();
                } else if (c <= '\'') {
                    if (c != '\'') {
                        if (c < ' ') {
                            c(c, "string value");
                        }
                    } else {
                        this.p.a(k);
                        return o.VALUE_STRING;
                    }
                }
            }
            if (k >= j.length) {
                j = this.p.l();
                k = 0;
            }
            int i2 = k;
            k = i2 + 1;
            j[i2] = c;
        }
    }

    private void L() {
        int i = this.f;
        int i2 = this.g;
        if (i < i2) {
            int[] a = com.flurry.a.b.a.h.e.a();
            int length = a.length;
            while (true) {
                char c = this.J[i];
                if (c < length && a[c] != 0) {
                    if (c == '\"') {
                        this.p.a(this.J, this.f, i - this.f);
                        this.f = i + 1;
                        return;
                    }
                } else {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                }
            }
        }
        this.p.b(this.J, this.f, i - this.f);
        this.f = i;
        char[] i3 = this.p.i();
        int k = this.p.k();
        while (true) {
            if (this.f >= this.g && !B()) {
                c(": was expecting closing quote for a string value");
            }
            char[] cArr = this.J;
            int i4 = this.f;
            this.f = i4 + 1;
            char c2 = cArr[i4];
            if (c2 <= '\\') {
                if (c2 == '\\') {
                    c2 = G();
                } else if (c2 <= '\"') {
                    if (c2 == '\"') {
                        this.p.a(k);
                        return;
                    } else if (c2 < ' ') {
                        c(c2, "string value");
                    }
                }
            }
            if (k >= i3.length) {
                i3 = this.p.l();
                k = 0;
            }
            int i5 = k;
            k = i5 + 1;
            i3[i5] = c2;
        }
    }

    private void M() {
        if ((this.f < this.g || B()) && this.J[this.f] == '\n') {
            this.f++;
        }
        this.i++;
        this.j = this.f;
    }

    private void N() {
        this.i++;
        this.j = this.f;
    }

    private final int O() {
        while (true) {
            if (this.f < this.g || B()) {
                char[] cArr = this.J;
                int i = this.f;
                this.f = i + 1;
                char c = cArr[i];
                if (c > ' ') {
                    if (c != '/') {
                        return c;
                    }
                    P();
                } else if (c != ' ') {
                    if (c == '\n') {
                        N();
                    } else if (c == '\r') {
                        M();
                    } else if (c != '\t') {
                        a((int) c);
                    }
                }
            } else {
                throw a("Unexpected end-of-input within/between " + this.n.d() + " entries");
            }
        }
    }

    private final void P() {
        if (!a(k.ALLOW_COMMENTS)) {
            b(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.f >= this.g && !B()) {
            c(" in a comment");
        }
        char[] cArr = this.J;
        int i = this.f;
        this.f = i + 1;
        char c = cArr[i];
        if (c != '/') {
            if (c != '*') {
                b(c, "was expecting either '*' or '/' for a comment");
                return;
            }
            while (true) {
                if (this.f >= this.g && !B()) {
                    break;
                }
                char[] cArr2 = this.J;
                int i2 = this.f;
                this.f = i2 + 1;
                char c2 = cArr2[i2];
                if (c2 <= '*') {
                    if (c2 == '*') {
                        if (this.f >= this.g && !B()) {
                            break;
                        } else if (this.J[this.f] == '/') {
                            this.f++;
                            return;
                        }
                    } else if (c2 < ' ') {
                        if (c2 == '\n') {
                            N();
                        } else if (c2 == '\r') {
                            M();
                        } else if (c2 != '\t') {
                            a((int) c2);
                        }
                    }
                }
            }
            c(" in a comment");
            return;
        }
        while (true) {
            if (this.f >= this.g && !B()) {
                return;
            }
            char[] cArr3 = this.J;
            int i3 = this.f;
            this.f = i3 + 1;
            char c3 = cArr3[i3];
            if (c3 < ' ') {
                if (c3 != '\n') {
                    if (c3 == '\r') {
                        M();
                        return;
                    } else if (c3 != '\t') {
                        a((int) c3);
                    }
                } else {
                    N();
                    return;
                }
            }
        }
    }

    @Override // com.flurry.a.b.a.b.c
    protected final char G() {
        int i = 0;
        if (this.f >= this.g && !B()) {
            c(" in character escape sequence");
        }
        char[] cArr = this.J;
        int i2 = this.f;
        this.f = i2 + 1;
        char c = cArr[i2];
        switch (c) {
            case '\"':
            case '/':
            case '\\':
                return c;
            case 'b':
                return '\b';
            case VEasing.Circ.easeInOut /* 102 */:
                return '\f';
            case 'n':
                return '\n';
            case 'r':
                return '\r';
            case 't':
                return '\t';
            case 'u':
                for (int i3 = 0; i3 < 4; i3++) {
                    if (this.f >= this.g && !B()) {
                        c(" in character escape sequence");
                    }
                    char[] cArr2 = this.J;
                    int i4 = this.f;
                    this.f = i4 + 1;
                    char c2 = cArr2[i4];
                    int a = com.flurry.a.b.a.h.e.a(c2);
                    if (a < 0) {
                        b(c2, "expected a hex-digit for character escape sequence");
                    }
                    i = (i << 4) | a;
                }
                return (char) i;
            default:
                return a(c);
        }
    }

    private void a(String str, int i) {
        char c;
        int length = str.length();
        do {
            if (this.f >= this.g && !B()) {
                I();
            }
            if (this.J[this.f] != str.charAt(i)) {
                f(str.substring(0, i));
            }
            this.f++;
            i++;
        } while (i < length);
        if ((this.f < this.g || B()) && (c = this.J[this.f]) >= '0' && c != ']' && c != '}' && Character.isJavaIdentifierPart(c)) {
            this.f++;
            f(str.substring(0, i));
        }
    }

    private byte[] b(com.flurry.a.b.a.a aVar) {
        com.flurry.a.b.a.h.d F = F();
        while (true) {
            if (this.f >= this.g) {
                A();
            }
            char[] cArr = this.J;
            int i = this.f;
            this.f = i + 1;
            char c = cArr[i];
            if (c > ' ') {
                int b = aVar.b(c);
                if (b < 0) {
                    if (c == '\"') {
                        return F.b();
                    }
                    b = a(aVar, c, 0);
                    if (b < 0) {
                        continue;
                    }
                }
                if (this.f >= this.g) {
                    A();
                }
                char[] cArr2 = this.J;
                int i2 = this.f;
                this.f = i2 + 1;
                char c2 = cArr2[i2];
                int b2 = aVar.b(c2);
                if (b2 < 0) {
                    b2 = a(aVar, c2, 1);
                }
                int i3 = b2 | (b << 6);
                if (this.f >= this.g) {
                    A();
                }
                char[] cArr3 = this.J;
                int i4 = this.f;
                this.f = i4 + 1;
                char c3 = cArr3[i4];
                int b3 = aVar.b(c3);
                if (b3 < 0) {
                    if (b3 != -2) {
                        if (c3 == '\"' && !aVar.a()) {
                            F.a(i3 >> 4);
                            return F.b();
                        }
                        b3 = a(aVar, c3, 2);
                    }
                    if (b3 == -2) {
                        if (this.f >= this.g) {
                            A();
                        }
                        char[] cArr4 = this.J;
                        int i5 = this.f;
                        this.f = i5 + 1;
                        char c4 = cArr4[i5];
                        if (!aVar.a(c4)) {
                            throw a(aVar, (int) c4, 3, "expected padding character '" + aVar.b() + "'");
                        }
                        F.a(i3 >> 4);
                    }
                }
                int i6 = (i3 << 6) | b3;
                if (this.f >= this.g) {
                    A();
                }
                char[] cArr5 = this.J;
                int i7 = this.f;
                this.f = i7 + 1;
                char c5 = cArr5[i7];
                int b4 = aVar.b(c5);
                if (b4 < 0) {
                    if (b4 != -2) {
                        if (c5 == '\"' && !aVar.a()) {
                            F.b(i6 >> 2);
                            return F.b();
                        }
                        b4 = a(aVar, c5, 3);
                    }
                    if (b4 == -2) {
                        F.b(i6 >> 2);
                    }
                }
                F.c(b4 | (i6 << 6));
            }
        }
    }

    private void f(String str) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.f >= this.g && !B()) {
                break;
            }
            char c = this.J[this.f];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            this.f++;
            sb.append(c);
        }
        d("Unrecognized token '" + sb.toString() + "': was expecting ");
    }
}
