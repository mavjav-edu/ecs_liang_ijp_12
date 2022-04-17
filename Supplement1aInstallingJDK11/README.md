**Supplement I.A: Installing and Configuring JDK 11**

**For Introduction to Java Programming\
Y. Daniel Liang**

This supplement covers the following topics:

-   Downloading JDK 11 (§1.2)

-   Installing JDK 11 (§1.3)

-   Configuring JDK (§1.3)

-   Verifying Configurations (§1.4)

    1.  **Downloading JDK 11**

You can download the latest JDK 11 from
<http://www.oracle.com/technetwork/java/javase/downloads/index.html>.
Consult with your instructor to download an appropriate version and
update. Note Java downloaded from this Webiste is free for educational
use. If you use it in a commercial product, download it from
`[http://jdk.java.net/11/`.](http://jdk.java.net/11/)

2.  **Installing JDK 11 on Windows**

Download the file named **jdk-11.0.1_windows-x64_bin.exe** (for 64-bit
Windows). Since Java is frequently updated, the file you have downloaded
may be named slightly differently. Follow the steps below to install JDK
11:

1.  Double click **jdk-11.0.1_windows-x64_bin.exe** to run the  
installation program. You will see the JDK 11 Setup dialog  
displayed.

2.  Click *Next* to display the JDK Custom Setup dialog.

3.  You may install JDK in a custom directory. For simplicity, don't  
change the directory. Click *Next* to install JDK.

4.  After installation completed, the Complete dialog is displayed.  
Click *Finish* to close the dialog.

    1.  **Configuring JDK 11 on Windows**

To configure JDK is to make it available in the operating system so that
Windows can find your JDK commands such as **javac**.

To do so, set the environment variables as follows:

1.  Open the System Properties window, as shown in Figure 1. In the  
System properties window, click *Environment Variables* in the  
Advanced tab to display the Environment Variables window, as shown  
in Figure 2.

**Figure 1**

*The System Properties window contains system information.*

![](media/image1.jpeg){width="4.553472222222222in"
height="4.973611111111111in"}

Environment Variables X

User variables for Y. Daniel Liang

  -------------- --------------------------------------------------------
  Variable       Value

  OneDrive       C:\\Users\\Y. Daniel Liang\\OneDrive

  Path           C:\\Users\\Y. Daniel
                 Liang\\AppData\\Local\\Programs\\Python\\Pyth\...

  TEMP           %USERPROFILE%\\AppData\\Local\\Temp

  TMP            %USERPROFILE%\\AppData\\Local\\Temp
  -------------- --------------------------------------------------------  
New\... Edit\... Delete

System variables

Variable Value

JAVA HOME C:\\Program Files\\Java\\jdk-11.0.1  
NUMBER OF PROCESSORS 8 OS Windows_NT

Path C:\\Program Files\\Java\\jdk 11.0.1\\bin;C:\\Program Files
(x86)\\Co\...

PATH_TO_FX C:\\Program Files\\Java\\jdk 11.0.1\\javafx sdk 11.0.1\\lib

PATHEXT .COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC

PROCESSOR-ARCHITECTURE AMD64

PROCESSOR IDENTIFIER Intel64 Family 6 Model 70 Stepping 1, Genuinelntel  
New\... Edit\... Delete

OK Cancel

**Figure 2**

*The Environment Variables window enables you to set user and system
variables.*

2.  You can set or modify user variables or system variables. User  
variables affect the individual users and system variables affect  
all the users in the system. In the Systems variables section,  
select Path and click *Edit* if Path is already a user variable,  
as shown in Figure 3a. Otherwise, click *New* to display the New  
System Variable window as shown in Figure 3b.

![](media/image2.jpeg){width="5.153472222222222in"
height="5.579861111111111in"}

**Figure 3a**

*You can add a new path in the Path variable.*

![](media/image3.jpeg){width="6.006944444444445in"
height="1.7069444444444444in"}

**Figure 3b**

*The New System Variable enables you to set a new user variable and its
value.*

3.  Type `Path` in the Variable field and c:\\Program  
FJes\\Java\\jdk-1L0.1\\bm in the Variable Value field, as shown in  
Figure 3a or Figure 3b. Click *OK*.  
>NOTE: You don't have to reboot the computer, but you have to open a
> new command window to use JDK commands.
>
> NOTE: If you download a new version or an update version, the
> directory name **jdk- 11.0.1** may be slightly different.

1.  **Verifying Configurations**

To verify whether JDK 11 is configured correctly, type **javac
-version** from the command prompt, as shown in Figure 4. The **javac**
command is not found if JDK is not properly configured.

**S3 Command Prompt □ X**

**c:\\book\>javac -version [a]{.smallcaps}**

**javac 11.0.1 c:\\book\>**

**Figure 4**

*The **javac** -version command displays the version for javac.*
