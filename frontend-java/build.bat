@echo off
REM Build script for Java frontend

setlocal enabledelayedexpansion

set "SOURCE_DIR=Interface"
set "BIN_DIR=bin"

if not exist "%BIN_DIR%" (
    mkdir "%BIN_DIR%"
    echo Created %BIN_DIR% directory
)

echo Compiling Java files...
javac -d "%BIN_DIR%" "%SOURCE_DIR%\*.java"

if %ERRORLEVEL% EQU 0 (
    echo Compilation successful!
    echo Run with: java -cp bin MainGUI
) else (
    echo Compilation failed!
    exit /b 1
)

endlocal
