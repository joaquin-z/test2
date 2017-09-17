@echo off
set workspace=%~dp0..\
cd %workspace%

::call %workspace%/scripts/test.bat
@echo | call %workspace%/scripts/test.bat

echo -------------------------------------------------------------------------------
echo [Fase iniciada] Package - Perfil(Pre-produccion) 
echo -------------------------------------------------------------------------------

call mvn package -Denvironment.type=preproduction --settings settings.xml

echo ----------------
echo [Fase terminada] 
echo ----------------

pause
