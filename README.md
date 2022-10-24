# java-foreign-function-interface-example
Java Foreign Function Interface Example

## Description
This is an example of Java's Foreign Function Interface (FFI) working with C and C++ implementation.  I was only 
able to get jextract working with `struct`.  jextract was not working with `class` at the time of this writing. 

In addition, I am developing using IntelliJ IDEA on Windows 11, but using Windows Subsystem for Linux (WSL) with Ubuntu. 
So Java, jExtract, and gcc is installed on Ubuntu.

The following needs to be installed:
```bash
sudo apt install aclocal autoconf autogen automake gcc libtool libtool-bin
```

So I am compiling the native code using Linux.  Then running the Java app and tests, using IntelliJ IDEA's 
`WSL - Ubuntu as a target`.  IDEA's run configuration needs to have the following:
```
--enable-preview
--enable-native-access=ALL-UNNAMED
-Djava.library.path=<your-path>/java-foreign-function-interface-example/ffi-c-native/src/.libs
```
or
```
--enable-preview
--enable-native-access=ALL-UNNAMED
-Djava.library.path=<your-path>/java-foreign-function-interface-example/ffi-cpp-native/src/.libs
```

This is using Java 19's preview of FFI, so the packages are javax.lang.foreign.  Unfortunately, Gradle 7.5.1 
(current at the time of this writing) does not support Java 19. So I'm using their nightly build of 7.6.

## References
- https://learn.microsoft.com/en-us/windows/wsl/install
- https://www.jetbrains.com/help/idea/how-to-use-wsl-development-environment-in-product.html
- https://gradle.org/release-nightly/