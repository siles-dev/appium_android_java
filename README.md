# appium_android_java
Record and display android automation with Appium using Java.

<H1> Running </H1>

1. Start Appium server.
2. Set up environment variables. Have devices connected / emulators started. Accordingly, update the (AndroidMobileDriver.java) test file with the relevant information about the devices.
3. Run test class.

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

