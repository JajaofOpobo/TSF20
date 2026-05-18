$sourceRoot = "C:\Users\Jaja\AndroidStudioProjects\TSF20\sources\sources"

# Find renamed files (uppercase single-letter .java)
$renamedFiles = Get-ChildItem -Path $sourceRoot -Recurse -Filter "*.java" | Where-Object {
    $b = $_.BaseName
    $b.Length -eq 1 -and $b -cmatch "^[A-Z]$"
}

$fixCount = 0
foreach ($file in $renamedFiles) {
    $newName = $file.BaseName  # Uppercase
    $oldName = $newName.ToLower()  # Lowercase
    if ($oldName -ceq $newName) { continue }
    
    $content = Get-Content $file.FullName -Raw
    $origContent = $content
    
    # Fix class/interface declaration: handle final/static modifiers
    $pattern = "(?m)^(\s*(?:(?:public|private|protected)\s+)?(?:(?:abstract|final|static)\s+)?(?:class|interface|@interface)\s+)$oldName(\s+|<|\{|$)"
    $content = $content -replace $pattern, "`$1$newName`$2"
    
    # Fix constructors: public a(...) -> public A(...)
    $content = $content -replace "(?m)^(\s*(?:public|private|protected)\s+)$oldName(\s*\()", "`$1$newName`$2"
    
    # Fix package-private constructors: a(...) at start of line in class body
    # Only fix if the line starts with just whitespace, then a( which looks like a constructor
    # BUT do NOT fix method calls like a(...) inside other methods
    # We handle this by checking: the line is NOT preceded by another statement (no ; before)
    # Actually, we only handle the safe case for now: a( precedes { or ) at end of method body indication
    # This is too risky to automate - let the build tell us if there are package-private constructors
    
    if ($content -cne $origContent) {
        Set-Content -Path $file.FullName -Value $content -NoNewline
        $fixCount++
    }
}
Write-Host "Fixed class declarations in $fixCount files"

# Also fix any leftover lowercase files (where the rename did NOT happen due to the modifer issue)
# These would have been manually handled already
