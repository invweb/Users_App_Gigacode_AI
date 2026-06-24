# Users App

Anwendung zum Anzeigen einer Liste von Benutzern mit detaillierten Informationen.

## Java-Installation

Java 17 oder höher ist erforderlich, um das Projekt zu erstellen. Installieren Sie das JDK:

```bash
brew install openjdk@17
```

Erstellen Sie dann einen symbolischen Link:

```bash
sudo ln -sfn /opt/homebrew/opt/openjdk@17/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-17.jdk
```

## Projekterstellung

```bash
./gradlew assembleDebug
```

## Unterstützte Sprachen

- English
- Deutsch (German)
- 中文 (Chinese)
- Русский (Russian)

## Projektstruktur

- `Constants.kt` - Konstanten für API und Intent
- `User.kt` - Datenmodelle
- `ApiClient.kt` - Retrofit-Client
- `ApiService.kt` - API-Schnittstelle
- `MainActivity.kt` - Benutzerlistenbildschirm
- `DetailActivity.kt` - Detailscreen
- `strings.xml` - Zeichenfolgen für alle Sprachen
