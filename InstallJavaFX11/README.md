![](media/image1.jpeg){width="0.27361111111111114in"
height="0.2798611111111111in"}

**Supplement II.F: Installing/Compiling/Running JavaFX 11 with JDK 11 or
Higher**

**For Introduction to Java Programming\
By Y. Daniel Liang**

Install and configure JDK 11 as described in Supplement I.B. Make sure
your JDK 11 is configured corrected.

JavaFX is now a separate module in JDK 11. To use it, first download it
from
[https://gluonhq.com/products/javafx/,](https://gluonhq.com/products/javafx/)
as shown in Figure 1. Download JavaFX Windows SDK from this page. This
is a .zip file. Unzip it into a directory called javafx-sdk-11.0.1. You
can place this directory anywhere. For convenience, I place it under
c:\\Program Files\\java.

`Pl` Getting Started with JavaFX \<: X © JavaFX - Gluon

![](media/image2.jpeg){width="0.23333333333333334in"
height="0.23333333333333334in"}ft <https://gluonhq.com/products/ja>.. Q
☆

Home » Products » JavaFX

JavaFX

The JavaFX 11 runtime is available as a platform-specific SDK, as a
number of jmods, and as a set of artifacts in maven central.

The OpenJFX page at openjfx.io is a great starting place to learn more
about JavaFX 11.

The Release Notes for JavaFX 11 are available in the OpenJFX GitHub
repository: Release Notes.

**Figure 1**

*Download JavaFX Windows SDK.*

Now you can compile your JavaFX program MyJavaFX.java in Section 14.2
using the following command:

c:\\book\>javac \--module-path \"c:\\Program
Files\\Java\\javafx-sdk-11.0.1\\lib\" \-- add-modules=javafx.controls
MyJavaFX.java

Note that my javafx-sdk-11.0.1 is placed under c:\\Program Files\\java.

Use the following command to run MyJavaFX, as shown in Figure 2:

c:\\book\>java \--module-path \"c:\\Program
Files\\Java\\javafx-sdk-11.0.1\\lib\" \--add- modules=javafx.controls
MyJavaFX

**M Command Prompt java module path \"c:\\Program Files\\Java\\javafx
sdk 11.0.1 \\lib\" add modules=javafx.controls MyJavaFX --- □ X**

**c:\\book\>javac \--module-path "c:\\Program
Files\\Java\\javafx-sdk-11.0.1\\lib^-^ \--add-modules-javafx.controls
MyJavaFX.java c:\\book\>java \--module-path \"c:\\Program
Files\\Java\\javafx-sdk-ll.0.l\\lib\" \--add-modules=javafx.controls
MyJavaFX**

**Figure 2**

*Compile and run JavaFX program in JDK 11.*

The only program that uses JavaFX before Chapter 14 is Listing 9.5 in
Section

9.6.3. This program uses the Point2D class which is in the
javafx.geometry

package in the JavaFX module. To compile this program, use

c:\\book\>javac \--module-path \"c:\\Program
Files\\Java\\javafx-sdk-11.0.1\\lib\" \--

add-modules=javafx.controls TestPoint2D.java

To run this program, use

c:\\book\>java \--module-path \"c:\\Program
Files\\Java\\javafx-sdk-11.0.1\\lib\" \--add-

modules=javafx.controls TestPoint2D
