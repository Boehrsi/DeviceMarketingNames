[![Maven Central Version](https://img.shields.io/maven-central/v/de.boehrsi/devicemarketingnames)](https://central.sonatype.com/artifact/de.boehrsi/devicemarketingnames/)
[![codecov](https://codecov.io/gh/Boehrsi/DeviceMarketingNames/branch/main/graph/badge.svg?token=FDL6MM474N)](https://codecov.io/gh/Boehrsi/DeviceMarketingNames)
[![GitHub Workflow Status](https://img.shields.io/github/actions/workflow/status/Boehrsi/DeviceMarketingNames/main.yml)](https://github.com/Boehrsi/DeviceMarketingNames/actions)
[![GitHub](https://img.shields.io/github/license/boehrsi/devicemarketingnames)](https://github.com/Boehrsi/DeviceMarketingNames/blob/main/LICENSE.txt)
[![Main](https://github.com/Boehrsi/DeviceMarketingNames/actions/workflows/main.yml/badge.svg)](https://github.com/Boehrsi/DeviceMarketingNames/actions/workflows/main.yml)

# Device Marketing Names

A simple device name lookup package. Map e.g. 'SM-G980F' to 'Galaxy S20'. No internet connection or database required.

## Features

- Lookup Android marketing names
- Get the marketing name(s) of the current device or by an already known Android model
- Uses the `Build.MODEL` information and [device_identifiers](https://github.com/Boehrsi/device_identifiers) which maps those to the marketing names.

## Usage

### Getting Started

Add this to your app `build.gradle` file:

```groovy
dependencies {
    ...
    implementation 'de.boehrsi:devicemarketingnames:0.7.0'
}
```

#### Migration 0.3.x to 0.4.0

**Versions prior to 0.4.0** are available via [Jitpack](https://jitpack.io/#Boehrsi/DeviceMarketingNames/) with the package name `com.github.Boehrsi:DeviceMarketingNames`.  
**Starting with version 0.4.0** new versions are deployed via [Maven Central](https://central.sonatype.com/artifact/de.boehrsi/devicemarketingnames/) with the new package name `de.boehrsi:devicemarketingnames`.

To migrate please adjust your current `build.gradle` entry from

```groovy
dependencies {
  ...
  implementation 'com.github.Boehrsi:DeviceMarketingNames:0.3.x'
}
```

to the new package

```groovy
dependencies {
  ... 
  implementation 'de.boehrsi:devicemarketingnames:0.4.0'
}
```

The additional repository definition in your root `build.gradle` file can be removed.

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
