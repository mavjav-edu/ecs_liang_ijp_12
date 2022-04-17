**Supplement: Editing Environment Variables**

**Y. Daniel Liang**

You may need to configure environment variables on the Windows to enable
the command to be used from the Command window. The command is usually
located in a bin directory. Suppose you want to use the javac command
for compiling Java program. Assume that the javac command is located in
**c:\\Program Files\\Java\\jdk1.8.0\\bin** directory. The following
steps add this path into the environment variable path on Windows. Here
is a list of other commands and their possible paths:

-   cc (compile C programs, cc.exe may be in the path  
**c:\\mingw\\bin**)

-   g++ (compile C++ programs, g++.exe may be in the path  
**c:\\mingw\\bin**)

-   python (run Python programs, python.exe may be in the path  
**c:\\python32**)

-   R (run R commands, R.exe may be in the path **c:\\Program  
Files\\R\\R-2.15.2\\bin**)

1.  **Configuring on Windows**

```{=html}
<!-- -->
```
1.  Right-click the My Computer icon on your desktop to display a  
context menu. Choose Properties from the context menu to open the  
System Properties window, as shown in Figure 4. (This screen shot  
is taken from Windows XP. For Windows 2000, NT, and ME users, the  
System properties window may look slightly different.)

2.  In the System properties window, click *Environment Variables* in  
the Advanced tab to display the Environment Variables window, as  
shown in Figure 5.

**Figure 4**

*The System Properties window contains system information.*

![](media/image1.jpeg){width="4.026388888888889in"
height="4.246527777777778in"}

![](media/image2.jpeg){width="3.779861111111111in"
height="4.386805555555555in"}

**Figure 5**

*The Environment Variables window enables you to set user and system
variables.*

3.  You can set or modify user variables or systems variables. User  
variables affect the individual users and system variables affect  
all the users in the system. In the User variables section, select  
PATH and click *Edit* if PATH is already a user variable.  
Otherwise, click *New* to display the New User Variable window as  
shown in Figure 8.

![](media/image3.jpeg){width="3.6868055555555554in"
height="1.5333333333333334in"}

**Figure 8**

*The New User Variable enables you to set a new user variable and its
value.*

4.  Type `PATH` in the Variable field and  
**`c:\\Program` Files\\Java\\jdk1.8.0\\bin2%path%** in  
the Variable Value field, as shown in Figure 4. Click *OK*.  
>NOTE: You don't have to reboot the computer, but you have to open a
> new command window to use the commands in the path.

**4 Verifying Configurations**

To verify whether the command is configured correctly, type the command
(e.g., **javac -version**) from the command prompt, as shown in Figure
8.

![](media/image4.jpeg){width="3.879861111111111in"
height="0.9868055555555556in"}

**Figure 8**

*The command is not found if the path is not properly configured.*
