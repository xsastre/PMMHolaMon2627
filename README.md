# PMMHolaMon2627 📱

Aplicació inicial d'exemple per a l'assignatura de **Programació de Dispositius Mòbils (PMM)** del cicle formatiu de grau superior en Desenvolupament d'Aplicacions Multiplataforma (DAM).

## 📝 Descripció

**PMMHolaMon2627** és una aplicació bàsica per a Android desenvolupada en **Java** que mostra l'estructura fundamental d'un projecte Android, la manipulació de la interfície d'usuari mitjançant XML (`ConstraintLayout`) i la gestió d'esdeveniments d'interacció bàsics (`OnClickListener`).

---

## ✨ Característiques

- **Interfície d'usuari reactiva**: Mostra un text de benvinguda i un botó d'acció.
- **Gestió d'esdeveniments**: En prémer el botó, el text es modifica dinàmicament.
- **Disseny Edge-to-Edge**: Adaptat a les noves guies de disseny d'Android amb suport de paquets d'insets del sistema.
- **Suport per a Mode Clar i Fosc**: Disseny basat en Material 3 (`DayNight`).

---

## 🛠️ Tecnologies i Eines Utilitzades

- **Llenguatge**: Java
- **Plataforma**: Android SDK (minSdk: 24, compileSdk: 36)
- **UI & Disseny**: AndroidX AppCompat, Material Components, ConstraintLayout
- **Sistema de construcció**: Gradle (Catalogs de versions: `libs.versions.toml`)
- **IDE recomanat**: Android Studio (Ladybug / Jellyfish o posterior)

---

## 📂 Estructura del Projecte

```text
PMMHolaMon2627/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/docencia/xaviersastre/dam/pmm/holamon/
│   │   │   │   └── MainActivity.java          # Activitat principal i lògica d'esdeveniments
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   └── activity_main.xml      # Disseny visual amb ConstraintLayout
│   │   │   │   ├── values/                    # Recursos de text, colors i temes
│   │   │   │   └── values-night/              # Tema fosc
│   │   │   └── AndroidManifest.xml            # Configuració i declaració de l'aplicació
│   └── build.gradle                           # Configuració del mòdul app
├── gradle/                                    # Configuració i opcions del Gradle Wrapper
├── build.gradle                               # Configuració Gradle arrel
├── settings.gradle                            # Nom del projecte i definició de mòduls
└── README.md                                  # Documentació del projecte
```

---

## 🚀 Com executar el projecte

1. **Clonar el repositori**:
   ```bash
   git clone https://github.com/<el-teu-usuari>/PMMHolaMon2627.git
   cd PMMHolaMon2627
   ```

2. **Obrir a Android Studio**:
   - Obre Android Studio.
   - Selecciona **Open** i tria la carpeta del projecte `PMMHolaMon2627`.
   - Espera que Gradle sincronitzi les dependències.

3. **Executar l'aplicació**:
   - Connecta un dispositiu Android físic amb la depuració USB activada o inicia un emulador (AVD).
   - Prem el botó **Run 'app'** (`Shift + F10` o la icona del triangle verd ▶️).

---

## 📜 Llicència

Aquest projecte té finalitats educatives i docents.
