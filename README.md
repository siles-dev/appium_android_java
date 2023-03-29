# appium_android_java
Record and display android automation with Appium using Java.

<H1> Running </H1>

Runs the created test against a custom local app. Dashboard and test classes need to be updated to the particular app being used. 
1. Start Appium server.
2. Set up environment variables. 
   3. DEVICE_ID
   4. ANDROID_VER
   4. APP_PKG
   4. APP_ACTIVITY
3. Have devices connected / emulators started.
4. Run test class or test execution file.

<H1> Procedure </H1>

<H3> Pre-reqs & environment set up </H3>

1. Install JAVA JDK - set JAVA_HOME
2. Install Homebrew
3. Install node
4. Install maven
5. Install Android Studio - set up emulators & ANDROID_HOME
6. Download Appium Desktop
7. Install libimobiledevice
8. Install XCode
9. Install adb - android-platform-tools
10. Install appium inspector - set up device connections(port/path/capabilities)

With all these the coresponding env variables must alse be configured.\
<H3> Programing </H3>

1. Create project structure.
2. Create `pom.xml` file to import required dependency libraries.
3. Create Driver class.
4. Gather and configure capabilities for device connections.
5. Create Driver class
6. Create Base screen class
7. Create particular page class
8. Create test class with assertions
9. Create testNG execution file 
10. Get test report - Check on `Use default reporters` option under `Listeners` in the run configuration which will create test-output folder in your root folder with all reports.

