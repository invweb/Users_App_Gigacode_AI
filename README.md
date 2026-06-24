| Screenshot |
|-------------|
| ![Main screen Screenshot](1.png) |

# Users App

Application for viewing a list of users with detailed information.

## Java Installation

Java 17 or higher is required to build the project. Install the JDK:

```bash
brew install openjdk@17
```

Then create a symbolic link:

```bash
sudo ln -sfn /opt/homebrew/opt/openjdk@17/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-17.jdk
```

## Project Build

```bash
./gradlew assembleDebug
```

## Supported Languages

- English
- Deutsch (German)
- 中文 (Chinese)
- Русский (Russian)

## Project Structure

- `Constants.kt` - constants for API and Intent
- `User.kt` - data models
- `ApiClient.kt` - Retrofit client
- `ApiService.kt` - API interface
- `MainActivity.kt` - users list screen
- `DetailActivity.kt` - details screen
- `strings.xml` - strings for all languages
