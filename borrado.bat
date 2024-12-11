@echo off
setlocal

REM Función para preguntar si se desea borrar un directorio o archivo
:ask_delete
set /p choice="¿Deseas borrar %1? (s/n): "
if /i "%choice%"=="s" (
    if exist %1 (
        if exist %1\* (
            rmdir /s /q %1
        ) else (
            del /q %1
        )
        echo %1 borrado.
    ) else (
        echo %1 no existe.
    )
) else (
    echo %1 no borrado.
)
goto :eof

REM Preguntar y borrar el directorio build en la raíz del proyecto
call :ask_delete build

REM Preguntar y borrar el directorio build dentro de la carpeta app
call :ask_delete app\build

REM Preguntar y borrar archivos .iml
for %%f in (*.iml) do call :ask_delete %%f

REM Preguntar y borrar el directorio .idea
call :ask_delete .idea

REM Preguntar y borrar el archivo local.properties
call :ask_delete local.properties

echo Limpieza completada.
pause

