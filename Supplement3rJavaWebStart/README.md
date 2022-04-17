**Supplement: Java Web Start**

**For Introduction to Java Programming\
By Y. Daniel Liang**

Java Web Start is a helper application that enables an applet to be
downloaded and run standalone outside a Web browser. The applet is
cached on the user's computer. So, it can run off-line without
connecting to the Web server. If the applet has been updated since the
last launch, Java Web Start can automatically download the updates to
ensure that an up-to-date version of the applet is used on the user's
computer.

To use Java Web Start, you need to create two files: a .html file and a
.jnlp file. In the .html file, embed a link that points to the .jnlp
file. JNLP stands for Java Network Launch Protocol. The .jnlp file
provides the information that Java Web Start needs in order to download
and run the applet.

Here is an example of enabling the TicTacToe applet to run from Java Web
Start. TicTacToe is covered in Chapter 18, "Applets and Multimedia."

Step 1: Create a .html named TicTacToe.html as follows:  
\<html\>
>
> \<head\>
>
> \<title\>TicTacToe Java Web Start Demo\</title\> \</head\> \<body\>
>
> \<a href = \"TicTacToe.jnlp\"\>Launch TicTacToe via java Web
> Start\</a\>
>
> \</body\>
>
> \</html\>

Step 2: All the resources for the applet such as the .class files and
supporting audio and image files must be packaged in a .jar file. The
.class files for the TicTacToe applet are TicTacToe.class,
TicTacToe\$Cell.class, and TicTacToe\$Cell\$MyMouseListener.class. Use
the following command to create the TicTacToe.jar file:  
jar cvf TicTacToe.jar TicTacToe.class TicTacToe\$Cell.class
> TicTacToe\$Cell\$MyMouseListener.class

Step 3: Create .jnlp file named TicTacToe.jnlp as follows:  
\<jnlp codebase=\"<file:///C:/book>\" href=\"TicTacToe.jnlp\"\>
> \<resources\>
>
> \<java version = \"1.6+\" /\>
>
> \<jar href=\"TicTacToe.jar\" main=\"true\" /\> \</resources\>
>
> \<information\>
>
> \<title\>TicTacToee\</title\>
>
> \<vendor\>Y. Daniel Liang\</vendor\> \<offline-allowed /\>
>
> \</information\>
>
> \<applet-desc
>
> name=\"TicTacToe\" main-class=\"TicTacToe\" width =\"300\" height
> =\"300\"\> \</applet-desc\> \</jnlp\>

The **jnlp** start tag has two attributes: **codebase** and **href**.
The **codebase** attribute specifies where the .jnlp file and the .jar
file are located. In this case, we placed the .jar file under the
c:\\book folder on the localhost. When you deploy it on a Web server,
change it accordingly. The **href** attribute specifies the .jnlp file.

The **resources** tag has two nested tags. The **\<java\>** tag
specifies the minimum version of Java required to execute the program
and the **\<jar\>** tag specifies the .jar file and whether the .jar
file contains the class that launches the program. There can be multiple
jar files listed here.

The **information** tag provides the information about the program such
as the title, vendor, and whether it can run offline.

The **applet-desc** tag specified the name of the applet, the main
class, and the width and height of the window for displaying the applet.

If the program is not an applet, you can also use the
**application-desc** tag specified the name of an application with the
main class.

Now you can display TicTacToe.html from a Web browser, as shown in
Figure 1 and click the link to launch Java Web Start, as shown in Figure
2. You will see TicTacToe running outside the browser, as shown in
Figure 3.

**Figure 1**

![](media/image1.jpeg){width="4.793055555555555in" height="1.7in"}

*You can click a link to launch Java Web Start.*

![](media/image2.jpeg){width="3.4in" height="2.4069444444444446in"}

*You can open the .jnlp file with Java Web Start.*

![](media/image3.jpeg){width="2.2263888888888888in"
height="2.2263888888888888in"}

*The applet is now running outside the browser.*

Note:

You need an

Internet

connection in order to test Java

Web Start even though the files are on the local host.

Note: Java Web Start can also be launched using the javaws command from
the Command window. For example, you can launch TicTacToe.jnlp using the
following command:  
javaws TicTacToe.jnlp

Note: You can create a desktop icon for the program by dragging the link
from Web page to the desktop.

Note: To deploy it on the server, the server's MIME type must include
JNLP. If not, add it. For example, for the Apache web server you must
add the following line to the .mime.types configuration file:  
application/x-java-jnlp-file JNLP

For more information, see

**<http://download.oracle.com/javase/1,5.0/docs/guide/javaws/de>
velopersguide/faq.html#223**
