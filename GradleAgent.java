import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

public class GradleAgent {
    public static void premain(String args, Instrumentation inst) {
        inst.addTransformer(new ConstantsTreeVisitorFixer());
    }
    
    static class ConstantsTreeVisitorFixer implements ClassFileTransformer {
        @Override
        public byte[] transform(ClassLoader loader, String className,
                Class<?> classBeingRedefined, ProtectionDomain protectionDomain,
                byte[] classfileBuffer) {
            
            if (!"org/gradle/internal/compiler/java/listeners/constants/ConstantsTreeVisitor".equals(className)) {
                return null;
            }
            
            System.out.println("[GradleAgent] Patching ConstantsTreeVisitor...");
            
            try {
                return patchGetBinaryClassName(classfileBuffer);
            } catch (Exception e) {
                System.err.println("[GradleAgent] Failed to patch: " + e.getMessage());
                e.printStackTrace();
                return null;
            }
        }
        
        private static byte[] patchGetBinaryClassName(byte[] classBytes) throws Exception {
            // We need to parse the class file and modify the getBinaryClassName method.
            // The method currently does:
            //   typeElement.getNestingKind().isNested()
            // We need to add:
            //   if (typeElement == null) return "";
            
            // Use Java's built-in class file parser? No, let's just do byte-level patching.
            // Pattern: the getBinaryClassName method starts with:
            //   aload_1 (0x2B)
            //   invokeinterface TypeElement.getNestingKind()
            
            // We want to change it to:
            //   aload_1 (0x2B)
            //   ifnonnull <skip> (0xC7)
            //   ldc "" (0x12 0x00)
            //   areturn (0xB0)
            //   <skip>:
            //   aload_1 (0x2B)
            //   invokeinterface TypeElement.getNestingKind()
            
            // Find the pattern: 0x2B (aload_1) followed by invokeinterface for getNestingKind
            // The invokeinterface for getNestingKind has signature "(Ljavax/lang/model/element/NestingKind;)?"
            // Actually it just has a reference to the interface method.
            
            // Since we can't easily parse class files, let's just do a targeted search
            // for the known byte sequence of getBinaryClassName entry
            
            // Actually, the simplest approach: use the ASM library which Gradle already bundles
            // See if ASM is available
            throw new RuntimeException("Cannot patch without ASM library");
        }
    }
}
