# Users App

用于查看用户列表及其详细信息的应用程序。

## Java安装

需要Java 17或更高版本才能构建项目。安装JDK：

```bash
brew install openjdk@17
```

然后创建符号链接：

```bash
sudo ln -sfn /opt/homebrew/opt/openjdk@17/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-17.jdk
```

## 项目构建

```bash
./gradlew assembleDebug
```

## 支持的语言

- English
- Deutsch (German)
- 中文 (Chinese)
- Русский (Russian)

## 项目结构

- `Constants.kt` - API和Intent的常量
- `User.kt` - 数据模型
- `ApiClient.kt` - Retrofit客户端
- `ApiService.kt` - API接口
- `MainActivity.kt` - 用户列表屏幕
- `DetailActivity.kt` - 详情屏幕
- `strings.xml` - 所有语言的字符串
