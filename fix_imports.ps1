$sourceRoot = "C:\Users\Jaja\AndroidStudioProjects\TSF20\sources\sources"

# Find all CONFLICTING files (where a.java clashes with a/ subdirectory)
$renamedFiles = Get-ChildItem -Path $sourceRoot -Recurse -Filter "*.java" | Where-Object {
    $baseName = [System.IO.Path]::GetFileNameWithoutExtension($_.Name)
    $baseName.Length -eq 1 -and $baseName -cmatch "^[A-Z]$"  # Already renamed to uppercase
}

Write-Host "Found $($renamedFiles.Count) renamed files"

# For each renamed file, determine its old FQN import and fix references
$fixCount = 0
foreach ($file in $renamedFiles) {
    # Get the package from the file path, relative to sourceRoot
    $relPath = $file.FullName.Substring($sourceRoot.Length + 1)
    $pkgPath = [System.IO.Path]::GetDirectoryName($relPath) -replace "\\", "."
    $oldClassName = $file.BaseName.ToLower()
    $newClassName = $file.BaseName  # Already uppercase
    
    if ($oldClassName -eq $newClassName) { continue }  # Skip non-renamed
    
    $oldImport = "import $pkgPath.$oldClassName;"
    $newImport = "import $pkgPath.$newClassName;"
    
    # Find all files that import this class
    $matchingFiles = Get-ChildItem -Path $sourceRoot -Recurse -Filter "*.java" | Where-Object {
        $content = Get-Content $_.FullName -Raw
        $content -cmatch [regex]::Escape($oldImport)
    }
    
    foreach ($mf in $matchingFiles) {
        $content = Get-Content $mf.FullName -Raw
        $newContent = $content -replace [regex]::Escape($oldImport), $newImport
        if ($newContent -cne $content) {
            Set-Content -Path $mf.FullName -Value $newContent -NoNewline
            $fixCount++
        }
    }
}
Write-Host "Fixed $fixCount import references"
