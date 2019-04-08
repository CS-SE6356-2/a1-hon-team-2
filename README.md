
Instructions to compile and run tests on command line:

  1. Download and install JDK from https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
  2. Open command line and type "set path=%PATH%;"C:\Program Files\Java\jdk1.8.x_xxx\bin" <- this may be different depending on where you choose to install the JDK
  3. Go to https://github.com/junit-team/junit4/wiki/Download-and-Install and download junit.jar and hamcrest-core.jar and move to a folder
  4. Type "set classpath=%CLASSPATH%;\<Path to junit.jar>\junit.jar;\<Path to hamcrest-core.jar>\hamcrest-core.jar" <- the jar names may be different depending on the version downloaded
  4. Change directory to location of TestRunner.java
  5. Compile with "javac *.java"
  6. Run with "java -cp %CLASSPATH%; TestRunner"
  7. The environment variables set in the command line will be reset after exiting the command line. To set them permanently, edit the system environment variables through Windows Control Panel.
  8. To view environment variables type "echo %\<variable name>%" in the command line
  9. To clear environment variables type "set <variable name>=" in the command line
