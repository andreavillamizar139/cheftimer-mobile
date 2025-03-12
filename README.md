# CHEFTIMER-MOBILE
Se realizó en Android Studio Kotlin.

#### Integrantes del equipo.
Andrea Villamizar 
Zamir Narro

## Requisitos Previos para la ejecución

- Java Development Kit (JDK) 8 actualizado e instalado en la máquina y variables de entorno de Java configuradas.
- Android Studio instalado y actualizado.
- SDK de Android instalado y actualizado (típicamente se instala de la mano con Android Studio).
- Un dispositivo Android virtual o físico con la depuración por _Android Debug Bridge_ (ADB) habilitada.
## Configuración del Proyecto

### 1. Clonar el Repositorio
```bash
git clone https://github.com/andreavillamizar139/cheftimer-mobile.git
```

### 2. Importar el Proyecto
1. Abrir Android Studio
2. Seleccionar `File > Open`
3. Navegar hasta la carpeta del proyecto
4. Espera a que Gradle sincronice el proyecto

## 3. Conectar el dispositivo

Conectar el dispositivo [físico](https://developer.android.com/studio/run/device) o [virtual](https://developer.android.com/studio/run/managing-avds) siguiendo los pasos correspondientes.

## Ejecución del proyecto en Android Studio

```bash
# Desde Android Studio
1. Abre el archivo del proyecto que deseas ejecutar.
2. Haz clic en el botón "Run" o en el icono verde de "play" en la esquina superior derecha de Android Studio.
```

## Instalación y Ejecución del APK

### 1. Descargar el APK
Descargar el archivo APK denominado `[NOMBRE_APK]`, ubicado en `[RUTA_APK]`.
### 2. Instalar en Dispositivo Físico
1. Habilita el modo desarrollador en el dispositivo:
    - Ir a `Ajustes > Acerca del teléfono`
    - Tocar 7 veces en "Número de compilación"

2. Habilitar la depuración USB:
    - Ir a `Ajustes > Opciones de desarrollador`
    - Activar "Depuración USB"

3. Conectar el dispositivo vía USB:
    - Aceptar el mensaje de autorización en el dispositivo
    - Asegurarse de que el dispositivo aparece en Android Studio

4. Instala el APK:

   ```bash
   adb install ruta/al/archivo.apk
   ```