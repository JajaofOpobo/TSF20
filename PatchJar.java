import java.io.*;
import java.nio.file.*;
import java.util.zip.*;
import org.objectweb.asm.*;

public class PatchJar {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("Usage: PatchJar <input.jar> <output.jar>");
            System.exit(1);
        }
        Path inPath = Paths.get(args[0]);
        Path outPath = Paths.get(args[1]);
        
        final String TARGET_CLASS = "org/gradle/internal/compiler/java/listeners/constants/ConstantsTreeVisitor";
        
        byte[] jarBytes = Files.readAllBytes(inPath);
        
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(outPath.toFile()))) {
            try (ZipInputStream zis = new ZipInputStream(new ByteArrayInputStream(jarBytes))) {
                ZipEntry entry;
                byte[] buf = new byte[65536];
                while ((entry = zis.getNextEntry()) != null) {
                    String name = entry.getName();
                    
                    if (name.equals(TARGET_CLASS + ".class")) {
                        ByteArrayOutputStream baos = new ByteArrayOutputStream();
                        int len;
                        while ((len = zis.read(buf)) > 0) {
                            baos.write(buf, 0, len);
                        }
                        byte[] original = baos.toByteArray();
                        
                        ClassReader cr = new ClassReader(original);
                        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
                        cr.accept(new ClassVisitor(Opcodes.ASM9, cw) {
                            @Override
                            public MethodVisitor visitMethod(int access, String name, String desc,
                                    String signature, String[] exceptions) {
                                if ("getBinaryClassName".equals(name) && 
                                    "(Ljavax/lang/model/element/TypeElement;)Ljava/lang/String;".equals(desc)) {
                                    System.out.println("[PatchJar] Skipping original method: " + name + desc);
                                    return new MethodVisitor(Opcodes.ASM9) {};
                                }
                                return super.visitMethod(access, name, desc, signature, exceptions);
                            }
                            
                            @Override
                            public void visitEnd() {
                                System.out.println("[PatchJar] Adding patched getBinaryClassName");
                                MethodVisitor mv = cw.visitMethod(
                                    Opcodes.ACC_PRIVATE,
                                    "getBinaryClassName",
                                    "(Ljavax/lang/model/element/TypeElement;)Ljava/lang/String;",
                                    null, null);
                                mv.visitCode();
                                mv.visitLdcInsn("");
                                mv.visitInsn(Opcodes.ARETURN);
                                mv.visitMaxs(1, 2);
                                mv.visitEnd();
                                
                                super.visitEnd();
                            }
                        }, 0);
                        
                        byte[] patched = cw.toByteArray();
                        System.out.println("[PatchJar] Patched: " + name + " (" + original.length + " -> " + patched.length + " bytes)");
                        
                        ZipEntry newEntry = new ZipEntry(name);
                        zos.putNextEntry(newEntry);
                        zos.write(patched);
                    } else {
                        ZipEntry newEntry = new ZipEntry(name);
                        zos.putNextEntry(newEntry);
                        int len;
                        while ((len = zis.read(buf)) > 0) {
                            zos.write(buf, 0, len);
                        }
                    }
                    zos.closeEntry();
                }
            }
        }
        
        System.out.println("[PatchJar] Done! Wrote " + outPath);
    }
}
