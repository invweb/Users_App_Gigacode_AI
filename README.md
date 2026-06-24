# Users App

Приложение для просмотра списка пользователей с детальной информацией.

## Установка Java

Для сборки проекта требуется Java 17 или выше. Установите JDK:

```bash
brew install openjdk@17
```

Затем создайте символическую ссылку:

```bash
sudo ln -sfn /opt/homebrew/opt/openjdk@17/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-17.jdk
```

## Сборка проекта

```bash
./gradlew assembleDebug
```

## Языки поддержки

- English
- Deutsch (German)
- 中文 (Chinese)
- Русский (Russian)

## Структура проекта

- `Constants.kt` - константы для API и Intent
- `User.kt` - модели данных
- `ApiClient.kt` - Retrofit клиент
- `ApiService.kt` - API интерфейс
- `MainActivity.kt` - экран списка пользователей
- `DetailActivity.kt` - экран детальной информации
- `strings.xml` - строки для всех языков
