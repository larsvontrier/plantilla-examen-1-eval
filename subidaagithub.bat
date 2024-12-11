@echo off
setlocal

REM Pedir el nombre del estudiante
set /p STUDENT_NAME="Introduce tu nombre: "

REM Configuración
set REPO_URL=https://github.com/larsvontrier/entrega-examen-1-eval.git
set BRANCH_NAME=%STUDENT_NAME%
set TOKEN=tu-token-de-acceso-personal

REM Clonar el repositorio
git clone %REPO_URL%
cd tu-repositorio

REM Crear una nueva rama para el alumno
git checkout -b %BRANCH_NAME%

REM Copiar los archivos del proyecto al repositorio
xcopy /E /I /Y "ruta\al\proyecto\*" .

REM Añadir, hacer commit y push de los cambios
git add .
git commit -m "Subiendo proyecto de %BRANCH_NAME%"
git push https://%TOKEN%@github.com/tu-usuario/tu-repositorio.git %BRANCH_NAME%

echo Proyecto subido exitosamente.
pause

