# Author
Mogale Mapaela

## Pre-requisites
- Install JDK 11+
- Gradle to manage dependencies
- Download and install Appium  https://github.com/appium/appium-desktop/releases
- Download and install Android Studio https://developer.android.com/studio
- - -

## Setup Instructions
- Launch Appium and set the following:
- - Click "Edit Configuration" on the landing page and add your JAVA_HOME and ANDROID_HOME path, then restart Appium
- - Once the application has restarted, click on "Start Server".
- Launch Android Studio >> Click More Actions >> Click Virtual Device Manager
- Add a new Android device(Emulator) and name it "Mogale_Test_Device"
- Launch the emulator 
- Launch IntelliJ and Import the project into IntelliJ by selecting the build.gradle file and click open as project
- Download the Android apk file from: https://github.com/saucelabs/my-demo-app-rn/releases [Please only use version 1.3.0 of Android or iOS application]
- Place the .apk file in the Files directory

## Running the test
- Go to src > test > java > test > Tests > checkoutTest.
- Click the green play icon on next to the @Test annotation.

## To Improve on/ Side note(s)
 - Used (Thread.sleep()) -> Bad practice, tried using 'wait.until(ExpectedConditions)' however came accross some challenges with my elements being of type 'String'
 - Used xpath as element identifier, Bad practice, accessibilty id was not showing up and using id caused failures

## Video Output of the test running
 - URL: https://www.loom.com/share/8e0ec20cd46f4820b518a17651e992c1?sid=62a4cd50-caa8-44ce-9d99-50848ebfa866