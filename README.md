[![Jitpack Version](https://jitpack.io/v/Boehrsi/DeviceMarketingNames.svg)](https://jitpack.io/#Boehrsi/DeviceMarketingNames)
[![codecov](https://codecov.io/gh/Boehrsi/DeviceMarketingNames/branch/main/graph/badge.svg?token=FDL6MM474N)](https://codecov.io/gh/Boehrsi/DeviceMarketingNames)
[![GitHub Workflow Status](https://img.shields.io/github/workflow/status/boehrsi/devicemarketingnames/Main)](https://github.com/Boehrsi/DeviceMarketingNames/actions)
[![GitHub](https://img.shields.io/github/license/boehrsi/devicemarketingnames)](https://github.com/Boehrsi/devicemarketingnames/blob/main/LICENSE)

# Device Marketing Names

A simple device name lookup package. Map e.g. 'SM-G980F' to 'Galaxy S20'. No internet connection or database required.

## Features

- Lookup Android marketing names
- Get the marketing name(s) of the current device or by an already known Android model
- Uses the `Build.MODEL` information and [device_identifiers](https://github.com/Boehrsi/device_identifiers) which maps those to the marketing names.

## Usage

### Getting Started

Add this to your root `build.gradle` file:

```groovy
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```

Add this to your app `build.gradle` file:

```groovy
dependencies {
  ...
  implementation 'com.github.Boehrsi:DeviceMarketingNames:0.2.2'
}
```

More information on [jitpack.io](https://jitpack.io/#Boehrsi/DeviceMarketingNames/).

### Examples

For full examples please see the [example app](https://github.com/Boehrsi/DeviceMarketingNames/blob/main/app/src/main/java/de/boehrsi/devicemarketingnames/example/MainActivity.kt).

```kotlin
// Get one marketing name of the device.
val deviceName = DeviceMarketingNames.getSingleName()

// Get all marketing names of the device.
val deviceNames = DeviceMarketingNames.getNames()

// Get one marketing name for the given model.
val deviceNameFromModel = DeviceMarketingNames.getSingleNameFromModel("ONEPLUS A5010")

// Get all marketing names for the given model.
val deviceNamesFromModel = DeviceMarketingNames.getNamesFromModel("ONEPLUS A5010");
```

## How to contribute

If you are interested in contributing, please have a look into
the [contribution guide](https://github.com/Boehrsi/devicemarketingnames/blob/main/CONTRIBUTING.md). Every idea, bug report or line of code is heavily
appreciated.
