
# Crypto Portfolio Tracker

## Overview

This is a simple Android application that tracks the value of various cryptocurrencies. The app displays a list of cryptocurrencies along with their current value and percentage change. The interface is user-friendly, inspired by common crypto tracking apps, with a focus on clarity and simplicity.

![screenshot](/screenshot3.png)



## Features

- **Display a list of cryptocurrencies** with their name, current value, and percentage change.
- **Simple and clean user interface** that can be easily customized.
- **Modular architecture** making it easy to extend or modify functionality.

## Project Structure

```
CryptoPortfolioApp/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   ├── com/
│   │   │   │   │   ├── example/
│   │   │   │   │   │   ├── cryptotracker/
│   │   │   │   │   │   │   ├── MainActivity.java
│   │   │   │   │   │   │   ├── Crypto.java
│   │   │   │   │   │   │   ├── CryptoAdapter.java
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   │   ├── crypto_item.xml
│   │   │   │   ├── values/
│   │   │   │   │   ├── colors.xml
│   │   │   │   │   ├── styles.xml
│   │   ├── AndroidManifest.xml
│   ├── build.gradle
└── settings.gradle
```

## Installation

### Prerequisites

- **Android Studio** installed on your machine.
- **Java Development Kit (JDK)** 8 or later.

### Steps

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/CryptoPortfolioApp.git
    ```

2. **Open Android Studio**.

3. **Select `Open an existing Android Studio project`**.

4. **Navigate to the cloned repository folder** and select it.

5. **Let Android Studio build the project**. This may take a few minutes.

6. **Sync the project with Gradle files** by clicking on `Sync Now` when prompted.

## Running the App

1. **Ensure you have an Android device or an emulator running**.

2. **Click the `Run` button** (green triangle) in Android Studio.

3. **Select your device or emulator**.

4. The app should now install and run on the selected device.

## Customization

- **To customize the list of cryptocurrencies**, modify the `MainActivity.java` file where the crypto list is populated.
- **To add new icons for different cryptocurrencies**, place them in the `res/drawable` folder and reference them in the `Crypto.java` model.
- **To change the theme or colors**, modify the `colors.xml` and `styles.xml` files in the `res/values` directory.

## Troubleshooting

- **Gradle Sync Issues**: Ensure that your Gradle version is compatible with the Android Gradle Plugin used in the project.
- **Emulator Performance**: If the emulator is slow, try enabling hardware acceleration in your BIOS or use a physical device for testing.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.
