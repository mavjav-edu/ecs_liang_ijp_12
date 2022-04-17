**NetBeans Tutorial**

**For Introduction to Java Programming\
By Y. Daniel Liang**

This tutorial applies to NetBeans 6, 7, or a higher version.

This supplement covers the following topics:

-   Getting Started with NetBeans (§1)

-   Creating a Project (§2)

-   Creating a Class (§3)

-   Compiling a Class (§4)

-   Running a Java Application (§5)

-   Running Book Examples (§6)

-   Getting Help in NetBeans (§7)

-   Forcing a Program to Terminate (§8)

-   Using Packages (§9)

-   Run Java Applications from the Command Line (§10)

-   Debugging in NetBeans (§11)  
>NOTE: To use this supplement with the text, you may cover Sections 1 -
> 9 in this supplement after Chapter 1 in the text, cover Sections 10­11
> in this supplement after Chapter 2 in the text, and cover Section 12
> along with Chapter 17.

**0 Introduction**

This tutorial is for students who are currently taking a Java course
using NetBeans with Introduction to Java Programming.

You can use the JDK command line utility to write Java programs. The JDK
command line utility consists of a set of separate programs, such as
compiler and interpreter, each of which is invoked from a command line.
Besides the JDK command line utility, there are more than a dozen Java
development tools on the market today, including NetBeans, JBuilder, and
Eclipse. These tools support an *integrated development environment*
(IDE) for rapidly developing Java programs. Editing, compiling,
building, debugging, and online help are integrated in one graphical
user interface. Using these tools effectively will greatly increase your
programming productivity.

This brief tutorial will help you to become familiar with NetBeans.
Specifically, you will learn how to create projects, create programs,
compile, run, and debug programs.  
> NOTE: NetBeans can run on any platform with a Java Virtual Machine.
> The screen shots in the tutorial are taken from Windows using NetBeans
> 6.1. It works same for a higher version of NetBeans.

**1 Getting Started with NetBeans**

Assume that you have successfully installed NetBeans on your machine.
Start NetBeans from Windows, Linux, Mac OS X, or Solaris. The NetBeans
main window appears, as shown in Figure 1.

![](media/image1.jpeg){width="4.320138888888889in"
height="2.066666666666667in"}

**Figure 1**

*The NetBeans main window is the command center for the IDE.*

The NetBeans main window contains menus, toolbars, project pane, files
pane, runtime pane, navigator pane, and other panes.

1.  *The Main Menu*

The main menu is similar to that of other Windows applications and
provides most of the commands you need to use NetBeans, including those
for creating, editing, compiling, running, and debugging programs. The
menu items are enabled and disabled in response to the current context.

2.  *The Toolbar*

The toolbar provides buttons for several frequently used commands on the
menu bar. The toolbars are enabled and disabled in response to the
current context. Clicking a toolbar is faster than using the menu bar.
For many\
commands, you also can use function keys or keyboard shortcuts. For
example, you can save a file in three ways:

-   Select File, Save from the menu bar.

-   Use the keyboard shortcut Ctrl+S.  
TIP: You can display a label known as *ToolTip* for a toolbar button
> by pointing the mouse to the button without clicking.

1.  *Workspaces*

A workspace is a collection of windows that are pertinent to performing
certain types of operations, such as editing, execution, output, or
debugging. The workspace windows can be displayed from the Window menu.

2.  **Creating a Project**

A project contains information about programs and their dependent files,
and it also stores and maintains the properties of the IDE. To create
and run a program, you have to first create a project.

Here are the steps to create a demo project:

1.  Choose *File*, *New Project* to display the New Project dialog box,  
as shown in Figure 2.

2.  Select General in the Categories section and Java Application in the  
Projects section and click *Next* to display the New Java  
Application dialog box, as shown in Figure 3.

3.  Type `demo` in the Project Name field and  
`c:\\michael` in Project Location field.

4.  (Optional) You can create classes after a project is created.  
Optionally you may also create the first class when creating a new  
project. To do so, check the *Create Main Class* box and type a  
class name, say `First`, as the Main Class name.

5.  Click *Finish* to create the project. The new project is displayed,  
as shown in Figure 4.

![](media/image2.jpeg){width="4.166666666666667in"
height="2.279861111111111in"}

**Figure 2**

*The New Project dialog box enables you to specify a project type.*

![](media/image3.jpeg){width="4.333333333333333in"
height="2.2736111111111112in"}

![](media/image4.jpeg){width="4.466666666666667in"
height="2.879861111111111in"}

**Figure 4**

*A new demo project is created.*

3.  **Creating a Class**

You can create any number of classes in a project. Here are the steps to
create Welcome.java in Listing 1.1 from Chapter 1 of the text in the
demo project.

1.  Right-click the top demo node in the project pane to display a  
context menu, as shown in Figure 5. Choose *New*, *Java Class* to  
display the New Java Class dialog box, as shown in Figure 6.

2.  Type `Welcome` in the Class Name field and select the  
Source Packages in the Location field. Leave the Package field  
blank. This will create a class in the default package. (Note that  
it is not recommended to use the default package, but it is fine  
to use the default package to match the code in the book. Using  
default package is appropriate for new Java students. Section 10,  
"Using Packages," will introduce how to create a class in a  
non-default package.)

3.  Click *Finish* to create the Welcome class, as shown in Figure 7.  
The source code file Welcome.java is placed under the \<default  
package\> node, because you did not specify a package name for the  
class in Figure 6.

4.  Modify the code in the `Welcome` class to match Listing  
1.1, as shown in Figure 8.

![](media/image5.jpeg){width="4.513194444444444in"
height="3.540277777777778in"}

**Figure 5**

*You can create a new class in a project.*

![](media/image6.jpeg){width="4.246527777777778in"
height="1.8798611111111112in"}

**Figure 6**

*The New Java Class dialog box enables you to specify a class name,
location, and package name to create a new class.*

![](media/image7.jpeg){width="4.326388888888889in"
height="2.379861111111111in"}

**Figure 7**

*A new Java class is created in the project.*

![](media/image8.jpeg){width="3.953472222222222in"
height="2.3666666666666667in"}

**Figure 8**

*The source code for Welcome.java is entered.*

TIP  
You can show line numbers in the Source Editor by choosing *View*,
> *Show Line Numbers* from the main menu.

NOTE  
The source file Welcome.java is stored in c:\\michael\\demo\\src.

4.  **Compiling a Class**

To compile **Welcome.java**, right-click Welcome.java to display a
context menu and choose *Compile File*, or simply press F9, as shown in
Figure 9.

The compilation status is displayed in the Output pane, as shown in
Figure 10. If there are no syntax errors, the *compiler* generates a
file named **Welcome.class**, which is stored in
c:\\michael\\demo\\build\\classes.

![](media/image9.jpeg){width="3.926388888888889in"
height="3.6069444444444443in"}

**Figure 9**

*The Compile File command in the context menu compiles a source file.*

![](media/image10.jpeg){width="4.386805555555555in"
height="3.2736111111111112in"}

**Figure 10**

*The compilation status is shown in the output pane.*  
> NOTE: When you compile the file, it will be automatically saved.

> NOTE: The icon for Java source code is . A Java source code may have
> an additional icon , which indicates that the file is not compiled. If
> the class has a main method, the icon is after the class is compiled.

> TIP: You can get descriptions of the node icons from NetBeans Help.
> Choose *Help*, *Help Contents* from the main window, and type Node
> Icons under the Search tab to display the descriptions for the icons,
> as shown in Figure 11.

![](media/image11.jpeg){width="4.6930555555555555in"
height="2.873611111111111in"}

**Figure 11**

*You can get descriptions of the node icons in the project pane from
NetBeans Help.*

5.  **Running a Java Application**

To run **Welcome.java**, right-click Welcome.java to display a context
menu and choose *Run File*, or simply press Shift + F6, as shown in
Figure 12. The output is displayed in the Output pane, as shown in
Figure 13.

![](media/image12.jpeg){width="4.220138888888889in"
height="3.8534722222222224in"}

**Figure 12**

*The Run File command in the context menu runs a Java program.*

![](media/image13.jpeg){width="4.233333333333333in"
height="2.933333333333333in"}

**Figure 13**

*The execution result is shown in the Output pane.*  
NOTE: The *Run File* command invokes the *Compile File* command if the
> program is not compiled or was modified after the last compilation.

6.  **Running Book Examples**

All the examples in the text can be downloaded from the book's Web site.
To run them, copy the source code files into c:\\michael\\demo\\src. You
will see the Java source code files appearing under the \<default
package\> node, as shown in Figure 14. For example, to run
ComputeLoan.java in Chapter 2, select ComputeLoan.java in the project
pane and press Shift + F6.

![](media/image14.jpeg){width="4.879861111111111in"
height="3.826388888888889in"}

**Figure 14**

*You can run the examples in the text from the demo project.*

If the program (e.g., ShowImage.java in Listing 14.9 in Chapter 14 uses
resources (e.g., image), you have to set the project working directory
to the resource directories.

Suppose you place the image files under
c:\\michael\\demo\\build\\classes, here are the steps to set the working
directory:

1.  Right-click the demo project node to display a context menu and  
choose Properties, as shown in Figure 15.

2.  Select Running Project in the left section of the project properties  
dialog box, as shown in Figure 16. Enter C:\\michae  
l\\demo\\buildAcl asses in the Working

Directory field.

3.  Copy the image and audio folders to

c:\\michael\\demo\\build\\classes. Run ShowImage.java.

![](media/image15.jpeg){width="6.0in" height="4.2in"}

**Figure 15**

*You can display Project Properties from the context menu of the project
node.*

![](media/image16.jpeg){width="4.146527777777778in"
height="2.7736111111111112in"}

**Figure 16**

*You can set properties for the project in the project properties dialog
box.*

7.  **NetBeans\'s Online Help**

NetBeans provides a large number of documents online, giving you a great
deal of information on a variety of topics pertaining to the use of
NetBeans.

To access online help, choose *Help*, *Help Contents* to display
NetBeans Help, as shown in Figure 17.

![](media/image17.jpeg){width="4.813194444444444in"
height="3.5868055555555554in"}

**Figure 17**

*All help documents are displayed in NetBeans Help.*

NetBeans Help behaves like a Web browser and contains the toolbar
buttons, navigation window, and content window. The toolbar buttons
contain four buttons: *Previous*, *Next*, *Print*, and *Print Setup*.
The Previous and Next buttons let you go to the previous and next topics
in the history list. The Print button prints the document in the content
window. The Print Setup button enables you to set up the print layout.

The navigation window contains three tabs: **Contents**, **Index,** and
**Search**. The Contents tab displays available documents. The table of
contents of the document is displayed in a tree-like list in the
navigation window. To view a given topic, select the node in the tree
associated with the topic. NetBeans Help displays the document for the
topic in the content window.

The Index tab shows the index entries for the current document. The
Search tab shows the combined index entries for all the available
documents in NetBeans.

8.  **Forcing a Program to Terminate**

If a program does not terminate due to a logic error, you can force it
to terminate by clicking the Stop icon, as shown in Figure 18.

![](media/image18.jpeg){width="4.279861111111111in"
height="3.379861111111111in"}

**Figure 18**

*You can force a program to terminate from the runtime pane.*

9.  **Using Packages (Optional)**

The `Welcome` class created in Section 3, "Creating a
Class," does not have the `package` statement. If you want
to create classes with the `package` statement, you need to
enter a package name in the New Java Class wizard. Here are the steps to
create a new class Welcome in the package named chapter1:

1.  In the context menu of the demo project, choose *New*, *Java Class*  
to display the New Java Class wizard, as shown in Figure 19.

2.  Type chapter! in the Package field and click *Finish* to create the  
template for the Welcome class, as shown in Figure 20.

3.  Welcome.java is created under package chapter1. The

first statement in the source code is

`package chapterl;`  
Modify Welcome.java to match the code in Listing 1.1, as shown in
> Figure 21.

4.  Choose *Run File* from the context menu of Welcome.java in the  
project pane to run the program.

![](media/image19.jpeg){width="4.079861111111111in"
height="2.826388888888889in"}

**Figure 19**

*You can enter a package name to create a class.*

![](media/image20.jpeg){width="4.093055555555556in" height="2.1in"}

**Figure 20**

*The new Welcome class is created under package chapter1.*

![](media/image21.jpeg){width="4.593055555555556in"
height="2.1534722222222222in"}

**Figure 21**

*The modified Welcome.java is shown in the Source Editor.*  
NOTE: The package in Java corresponds to the directory in the file
> system. **chapter1** is also a directory. Welcome.java is stored in
> c:\\michael\\demo\\src\\chapter1 and `Welcome.class` is
> stored in `c:\\michael\\demo\\build\\classes\\chapter1`.

10. **Run Java Applications from the Command Line**

So far you have run programs in the NetBeans IDE. You can also run
program standalone directly from the operating system. Here are the
steps in running the **Welcome** application with the default package
created in Section 3 from the DOS prompt.

1.  Start a DOS window by clicking the Windows Start button, Programs,  
MS-DOS Prompt in Windows.

2.  Type the following commands to set up the proper environment  
variables for running Java programs in the DOS environment in  
Windows:  
**set path=%path%;c:\\Program Files\\java\\jdk1.6.0\\bin set
> classpath=.;%classpath%**

3.  Type **cd c:\\michael\\demo\\build\\classes** to change the  
directory to **c:\\michael\\demo\\build\\classes**

4.  Type **java Welcome** to run the program. A sample run of the output  
is shown in Figure 22.

![](media/image22.jpeg){width="3.220138888888889in"
height="0.7201388888888889in"}

**Figure 22**

*You can run the Java program from java command.*  
![](media/image23.jpeg){width="3.859722222222222in"
> height="1.0333333333333334in"}NOTE: To run `Welcome` in
> the `chapterl` package created in Section 11, type **java
> chapter1.Welcome** from the **c:\\michael\\demo\\build\\classes**
> directory, as shown in Figure 23.

**Figure 23**

*If a class has the package statement, you have to specify its full
path, including the package name.*

11. **Debugging in NetBeans**

The debugger utility is integrated in NetBeans. You can pinpoint bugs in
your program with the help of the NetBeans debugger without leaving the
IDE. The NetBeans debugger enables you to set breakpoints and execute
programs line by line. As your program executes, you can watch the
values stored in variables, observe which methods are being called, and
know what events have occurred in the program.

The debugger is an indispensable, powerful tool that boosts your
programming productivity. It is also a valuable tool for learning Java.
It helps you understand how a program is executed.

1.  *Setting Breakpoints*

You can execute a program line by line to trace it, but this is
time-consuming if you are debugging a large program. Often, you know
that some parts of the program work fine. It makes no sense to trace
these parts when you only need to trace the lines of code that are
likely to have bugs. In cases of this kind, you can use breakpoints.

A *breakpoint* is a stop sign placed on a line of source code that tells
the debugger to pause when this line is encountered. The debugger
executes every line until it encounters a breakpoint. You can then trace
the part of the program at the breakpoint, quickly moving over the
sections that work correctly and concentrating on those causing

problems.

There are several ways to set a breakpoint. One quick way is to click
the cutter of the line on which you want to put a breakpoint. You will
see the line highlighted. You also can set breakpoints by choosing
*Run*, *New Breakpoint*. To remove a breakpoint, simply click the cutter
of the line.

When debugging a program, you can set as many breakpoints as you want,
and can remove breakpoints at any time during debugging. The project
retains the breakpoints when you exit the project. They are restored
when you reopen it.

2.  *Starting the Debugger*

Let us use Listing 2.7, ShowCurrentTime.java, to demonstrate debugging.
Create a new class named ShowCurrentTime in the default package in the
demo project, as shown in Figure 24.

![](media/image24.jpeg){width="3.953472222222222in"
height="2.0868055555555554in"}

**Figure 24**

*ShowCurrentTime.java is created in the project.*

There are several ways to start the debugger. A simple way is as
follows:

1.  Activate ShowCurrentTime.java in the editor pane.

2.  Set a breakpoint at where you want your program to pause, say  
Line 6. A breakpoint can be set by clicking the cutter of the  
line, as shown in Figure 25. You can remove it by clicking on the  
cutter of line again.

3.  In the context menu of ShowCurrentTime.java in the project pane,  
choose *Debug File*. If the program compiles properly, an output  
pane and debug pane will be displayed, as shown in Figure 26. If  
the debug\  
pane is not shown, choose *Window*, *Debugging*, *Local Variables*  
to display it.

![](media/image25.jpeg){width="4.420138888888889in"
height="2.326388888888889in"}

**Figure 25**

*Clicking the line number sets/removes a breakpoint at the line in the
source code.*

![](media/image26.jpeg){width="5.179861111111111in"
height="2.6465277777777776in"}

*The debugger starts to run ShowCurrentTime.java.*

1.  *Controlling Program Execution*

The program pauses at the breakpoint. The paused line is highlighted in
green. This line is also called the *current execution point*, which
points to next statement to be executed by the debugger.

When the program pauses, you can issue debugging commands to control the
execution of the program. You also can inspect or modify the values of
variables in the program.

When NetBeans is in the debugging mode, the toolbar buttons for
debugging are displayed, as shown in Figure 26. The toolbar button
commands also appear in the Run menu (see Figure 27). Here are the
commands for controlling program execution:

-   ***Start*** begins to debug the current program.

-   ***Finish*** ends the current debugging session.

-   ***Attach*** opens a dialog box in which you can connect the  
debugger to an application on another virtual machine. This is  
useful for remote debugging in distributed systems.

-   ***Pause*** temporarily stops execution of a program.

-   ***Run to Cursor*** runs the program, starting from the current  
execution point, and pauses and places the execution point either  
on the line of code containing the cursor or at a breakpoint.

-   ***Step Over*** executes a single statement. If the statement  
contains a call to a method, the entire method is executed without  
stepping through it.

-   ***Step Into*** executes a single statement or steps into a method.

-   ***Step Out*** executes all the statements in the current method and  
returns to its caller.

**• *Continue* resumes the execution of a paused program.**

![](media/image27.jpeg){width="4.966666666666667in"
height="2.526388888888889in"}

**Figure 27**

*The debugging commands appear under the Run menu.*

1.  *The Debugger Window*

The Debugger window has tabbed panes for Local Variables, Watches, and
Call Stack, as shown in Figure 26. Other tabbed such as Breakpoints,
Sessions, and Threads can be added by choosing Window, Debugging from
the main menu. These panes can be selected or deselected. The *Sessions
pane* lists the current debug sessions. The *Breakpoints pane* lists all
the breakpoints you have set. The *Threads pane* lists threads and
thread groups in the current debugging process. The *Call Stack pane*
lists the method calls that the process has made since it began running.
The *Watches pane* lists the variables and expressions that are under
continuous watch. The *Local Variables pane* shows all the variables
before the current execution point in a local method. The *Classes pane*
lists all the classes that have been loaded by the process being
debugged.

2.  *Examining and Modifying Data Values*

Among the most powerful features of an integrated debugger is its
capability to reveal current data values and enable programmers to
modify values during debugging. You can examine the values of variables,
array items, and objects, or the values of the parameters passed in a
method call. You also can modify a variable value if you want to try a
new value to continue debugging without restarting the program.

The Local Variables pane lists all variables accessible at the current
execution point. The Watches pane lists the selected variables.

1.  *The Add Watch Command*

NetBeans provides the Add Watch command to enable you to add variables
to the Watches pane in the Debugger window. To add the variable
`totalMilliseconds` to the Watch view, perform the following
steps:

1.  Suppose the execution point is currently at the first line in the  
`main` method. Highlight  
`totalMilliseconds` in the Source Editor and  
right-click the mouse to reveal a context menu.

2.  Choose *New Watch* in the context menu to bring up a dialog box, as  
shown in Figure 28. Click *OK* to add  
`totalMilliseconds` to the Watch list.

3.  Choose the Watches tab in the Debugger window. The  
![](media/image28.jpeg){width="2.533333333333333in"
> height="0.7201388888888889in"}Choose *Debug*, *Step Over* to observe
> the changing value of `totalMilliseconds` in the Watches
> pane.

**Figure 28**

*The New Watch dialog box enables you to add a variable or an expression
to the Watch view.*

![](media/image29.jpeg){width="4.186805555555556in"
height="2.1333333333333333in"}

**Figure 29**

*The variable `totalMilliseconds` was added to the Watches
tab.*

NOTE:  
You can also add expressions such as `i \> 0` to the
> Watches tab from the Add New Watch dialog box.

*11.5.2 Modifying Variables*

You can modify variables from the Watches pane or the Variables pane.
For instance, to change the value for `totalMilliseconds`,
enter a new value, say 1000, in the value field for the variable and
press the Enter key (See Figure 30).

![](media/image30.jpeg){width="4.166666666666667in"
height="2.126388888888889in"}

*The value for variable `totalMilliseconds` is changed to
1000.*
