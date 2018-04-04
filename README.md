# Hyperion-Chuck
[Hyperion](https://github.com/willowtreeapps/Hyperion-Android) Plugin for [Chuck](https://github.com/jgilfelt/chuck)

[![Build Status](https://travis-ci.org/Commit451/Hyperion-Chuck.svg?branch=master)](https://travis-ci.org/Commit451/Hyperion-Chuck) [![](https://jitpack.io/v/Commit451/Hyperion-Chuck.svg)](https://jitpack.io/#Commit451/Hyperion-Chuck)

## Usage
First, follow the README to set up [Chuck](https://github.com/jgilfelt/chuck). Then, follow the README to set up [Hyperion](https://github.com/willowtreeapps/Hyperion-Android). Then, all you need to do is simply add the dependency:

```
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```
and
```
dependencies {
    debugImplementation 'com.github.Commit451:Hyperion-Chuck:latest.version.here'
}
```
Hyperion will then find the plugin and add it to the list when you open the Hyperion drawer.

## Icon
Generated from [AndroidAssetStudio](http://romannurik.github.io/AndroidAssetStudio/icons-generic.html), with color set to #8e8e93, with asset padding set to 0dp and asset size set to 30dp.

## License
Hyperion-Chuck is available under the MIT license. See the LICENSE file for more info.
