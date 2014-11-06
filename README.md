AndroidAppWithUnitTests
=======================

Example of and Android App with unit tests that run both from Android Studio IDE (with a plugin) and from command line (for CI).

**This project has the minimal code to prove a bug in the Android Studio Unit test plugin, by which the binaries are not generated if any of the modules have a dependency with an Android library module**


### Requirements

This uses the [Android Studio Unit test plugin](https://github.com/evant/android-studio-unit-test-plugin).

To install it, go to:
 * Windows: `Settings -> Plugins -> Browse Repositories...` 
 * Mac OS: `Android Studio -> Preferences -> Plugins -> Browse Repositories...` 

and search for 'Android Studio Unit Test'.

## Running the tests

* From the IDE: Thanks to the plugin, you can run the tests from Android Studio, by simply right clicking on a Test and selecting `Run <name_of_the_test_class>...`. You can always modify the Run configuration of the test to make it Run all tests in the project.
* From command line/ CI. Just run `./gradlew test` from the project's folder (where the `gradlew` executable is)



