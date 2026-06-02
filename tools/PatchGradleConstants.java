import java.io.*;
import java.nio.file.*;
import java.util.jar.*;

public class PatchGradleConstants {
    
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("Usage: PatchGradleConstants <jar-path> <output-dir>");
            System.exit(1);
        }
        
        String jarPath = args[0];
        String outputDir = args[1];
        
        // The class name inside the JAR
        String className = "org/gradle/internal/compiler/java/listeners/constants/ConstantsTreeVisitor.class";
        
        // Read the original class bytes
        try (JarFile jar = new JarFile(jarPath)) {
            JarEntry entry = jar.getJarEntry(className);
            if (entry == null) {
                System.err.println("Class not found in JAR: " + className);
                System.exit(1);
            }
            byte[] classBytes;
            try (InputStream is = jar.getInputStream(entry)) {
                classBytes = is.readAllBytes();
            }
            
            // Now we need to patch the bytecode
            // The getBinaryClassName method is at some offset
            // We need to:
            // 1. Find the "getBinaryClassName" method in the constant pool
            // 2. Add a null check at the beginning of getBinaryClassName
            
            // Since we can't easily parse the class file here,
            // let's write a simple ASM-based patcher
            System.out.println("Class size: " + classBytes.length + " bytes");
            
            // Save for inspection
            Path outPath = Paths.get(outputDir, "ConstantsTreeVisitor.class");
            Files.write(outPath, classBytes);
            System.out.println("Saved to: " + outPath);
        }
    }
}
