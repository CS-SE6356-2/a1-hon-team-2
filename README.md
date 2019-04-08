To install JDK:
1. Check to see if java is installed by opening command line and typing "java -version"
2. If not, download and install JDK from https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
    - Change 'Path' environment variable to include "C:\Program Files\Java\jdk1.8.x_xxx\bin" <- path may be different depending on where Java was installed

To download JUnit:
1. Go to https://github.com/junit-team/junit4/wiki/Download-and-Install and download junit.jar and hamcrest-core.jar and move to a folder
    - Jar file names may be different depending on version downloaded

Instructions to compile and run in eclipse:

1. Download zip file and unzip in workspace
2. Open eclipse and select File -> Import
3. Select General -> Existing Projects into Workspace
4. Browse root directory and select the a1-hon-team-2-master folder above src
5. Click Finish
6. Right click on src/framework/TestRunner.java -> Run as -> Java Application
7. If there is an error:
    - Right click root folder -> Build Path -> Configure Build Path
    - If JUnit is not already included
       - Click Add External JARs
       - Select junit.jar and hamcrest-core.jar <- may be different depending on version downloaded
Instructions to compile and run tests on command line:

1. Make sure JDK is installed
2. If not already set, open command line and type "set path=%PATH%;"C:\Program Files\Java\jdk1.8.x_xxx\bin" <- this may be different depending on where you choose to install the JDK
3. Download JUnit
4. Type "set classpath=%CLASSPATH%;\<Path to junit.jar>\junit.jar;\<Path to hamcrest-core.jar>\hamcrest-core.jar" <- the jar names may be different depending on the version downloaded
4. Change directory to location of TestRunner.java
5. Compile with "javac *.java"
6. Run with "java -cp %CLASSPATH%; TestRunner"
7. If you get a "NoClassDefFoundError":
    - Check classpath using "echo %CLASSPATH%"
    - Verify classpath files are seprated by semicolons and the path includes the actual .jar files
8. To view environment variables type "echo %\<variable name>%" in the command line
9. To clear environment variables type "set \<variable name>=" in the command line
10. The environment variables set and deleted in the command line will be reset after exiting the command line. To set or delete them permanently, edit the system environment variables through Windows Control Panel.
