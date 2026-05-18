$sourceRoot = "C:\Users\Jaja\AndroidStudioProjects\TSF20\sources\sources"

$renamedFiles = Get-ChildItem -Path $sourceRoot -Recurse -Filter "*.java" | Where-Object {
    $baseName = [System.IO.Path]::GetFileNameWithoutExtension($_.Name)
    $baseName.Length -eq 1 -and $baseName -cmatch "^[A-Z]$"
}

$fixCount = 0
foreach ($file in $renamedFiles) {
    $oldCtorName = $file.BaseName.ToLower()
    $newCtorName = $file.BaseName  # Uppercase
    if ($oldCtorName -ceq $newCtorName) { continue }
    
    $content = Get-Content $file.FullName -Raw
    $modified = $false
    
    # Find constructors named after old class name (public a(...), private a(...), protected a(...), a(...))
    # These are methods named after the old lowercase class name
    $pattern = "(?m)^(\s*(public|private|protected)\s+)$oldCtorName(\s*\()"
    $newContent = $content -replace $pattern, "`$1$newCtorName`$3"
    if ($newContent -cne $content) {
        $content = $newContent
        $modified = $true
    }
    
    # Also handle package-private constructors (just "a(" at the beginning of a line with no access modifier)
    $pattern2 = "(?m)^(\s*)$oldCtorName(\s*\()"
    $newContent = $content -replace $pattern2, "`$1$newCtorName`$2"
    if ($newContent -cne $content) {
        $content = $newContent
        $modified = $true
    }
    
    if ($modified) {
        Set-Content -Path $file.FullName -Value $content -NoNewline
        $fixCount++
    }
}
Write-Host "Fixed $fixCount files"
