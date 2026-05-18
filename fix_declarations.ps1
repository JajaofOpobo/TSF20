$sourceRoot = "C:\Users\Jaja\AndroidStudioProjects\TSF20\sources\sources"

# Find all renamed files (uppercase single-letter names)
$renamedFiles = Get-ChildItem -Path $sourceRoot -Recurse -Filter "*.java" | Where-Object {
    $b = $_.BaseName
    $b.Length -eq 1 -and $b -cmatch "^[A-Z]$"
}

$fixCount = 0

foreach ($file in $renamedFiles) {
    $newName = $file.BaseName  # uppercase
    $oldName = $newName.ToLower()  # lowercase
    if ($oldName -ceq $newName) { continue }

    $content = Get-Content $file.FullName -Raw
    $origContent = $content

    # 1. Fix class/interface declaration:
    #    public class c<E> {  ->  public class C<E> {
    #    public interface a {  ->  public interface A {
    #    abstract class c {   ->  abstract class C {
    #    class f {            ->  class F {
    $pattern = "(?m)^(\s*(public\s+)?(abstract\s+)?(class|interface)\s+)$oldName(\s*<|\s*\{|\s+|\s*$)"
    $content = $content -replace $pattern, "`$1$newName`$5"

    # 2. Fix constructors:  public a(...)  ->  public A(...)
    #    This only applies if the class was renamed and the method matches the OLD class name
    $content = $content -replace "(?m)^(\s*(public|private|protected)\s+)$oldName(\s*\()", "`$1$newName`$3"
    # Also package-private constructors: a(  at start of expression
    # But be careful not to match method calls: a(...) 
    # Match only when preceded by class body context (before any method body)
    # Actually, we need to distinguish: a( could be a constructor call or a method call.
    # For now, only handle the access-modifier case (public a() etc)
    # The remaining package-private constructors we'll handle based on what javac reports

    if ($content -cne $origContent) {
        Set-Content -Path $file.FullName -Value $content -NoNewline
        $fixCount++
    }
}

Write-Host "Fixed $fixCount files with class declarations"

# Step 2: Delete leftover original files (where both a.java and A.java exist)
$lowercaseFiles = Get-ChildItem -Path $sourceRoot -Recurse -Filter "*.java" | Where-Object {
    $b = $_.BaseName
    $b.Length -eq 1 -and $b -cmatch "^[a-z]$"
}

$deletedCount = 0
foreach ($file in $lowercaseFiles) {
    $upperPath = Join-Path $file.Directory.FullName "$($file.BaseName.ToUpper()).java"
    if (Test-Path $upperPath) {
        # Both exist - the lowercase is leftover, delete it
        Remove-Item -Path $file.FullName -Force
        Write-Host "Deleted leftover: $($file.FullName)"
        $deletedCount++
    }
}
Write-Host "Deleted $deletedCount leftover original files"
