$sourceRoot = "C:\Users\Jaja\AndroidStudioProjects\TSF20\sources\sources"

# Find all files where class/interface name clashes with a subpackage
$clashes = @()
Get-ChildItem -Path $sourceRoot -Recurse -Filter "*.java" | ForEach-Object {
    $file = $_
    $baseName = [System.IO.Path]::GetFileNameWithoutExtension($file.Name)
    if ($baseName.Length -eq 1 -and $baseName -cmatch "^[a-z]$") {
        $subDir = Join-Path $file.Directory.FullName $baseName
        if (Test-Path $subDir -PathType Container) {
            $clashes += @{
                File = $file.FullName
                Dir = $file.Directory.FullName
                OldName = $baseName
                NewName = $baseName.ToUpper()
            }
        }
    }
}
Write-Host "Found $($clashes.Count) conflicting files"

# Step 2: Rename class/interface declarations + rename files
$renameCount = 0
foreach ($c in $clashes) {
    $oldPath = $c.File
    $newPath = Join-Path $c.Dir "$($c.NewName).java"
    $content = Get-Content $oldPath -Raw
    $oldName = $c.OldName
    $newName = $c.NewName
    
    # Replace class/interface declarations (case-sensitive regex)
    $pattern = "(?m)^(\s*(public\s+)?(abstract\s+)?(class|interface)\s+)$oldName(\s+|<|\{|$)"
    $replacement = "`$1$newName`$5"
    $newContent = $content -replace $pattern, $replacement
    
    # Check if content actually changed (case-sensitive)
    if ($newContent -cne $content) {
        Set-Content -Path $oldPath -Value $newContent -NoNewline
        Rename-Item -Path $oldPath -NewName "$newName.java" -Force -ErrorAction Continue
        $renameCount++
    }
}
Write-Host "Renamed $renameCount files"

# Step 3: Update import references in all Java files
Write-Host "Updating import references..."
$allJavaFiles = Get-ChildItem -Path $sourceRoot -Recurse -Filter "*.java"
$importFixCount = 0

foreach ($c in $clashes) {
    $oldName = $c.OldName
    $newName = $c.NewName
    
    foreach ($file in $allJavaFiles) {
        $content = Get-Content $file.FullName -Raw
        $modified = $false
        
        # Fix: import com.example.a; -> import com.example.A;
        $newContent = $content -replace "(?m)^(import\s+\S+)\.$oldName(;\r?)$", "`$1.$newName`$2"
        if ($newContent -cne $content) {
            $content = $newContent
            $modified = $true
        }
        
        if ($modified) {
            Set-Content -Path $file.FullName -Value $content -NoNewline
            $importFixCount++
        }
    }
}
Write-Host "Updated $importFixCount files"
