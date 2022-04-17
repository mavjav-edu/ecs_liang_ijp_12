> **Supplement II.H: Using JavaFX in Eclipse 4.9 with JDK 11**

**For Introduction to Java Programming\
By Y. Daniel Liang**

Prerequisites: 1. JDK 11 or higher installed and configured correctly
(see Supplement I.B). 2. Eclipse 4.9 or higher installed. (see
Supplement II.D). 3. JavaFX installed. (see Supplement III.G).

Suppose you created a class named MyJavaFX in a test project. After you
pasted the code from Listing 14.1 into Eclipse, you will see errors, as
shown in Figure 1. This is because JavaFX has not been configured for
Eclipse.

O workspaces test/src/MyJavaFX.java Eclipse SDK

File Edit Source Refactor Navigate Search Project Run Window Help

1.  © \^Override // Override the start method in the Application class I
    8 public void start(Stage primarystage) {

```{=html}
<!-- -->
```
9.  // Create a button and place it in the scene

10. 0 Button btOK = new Button(\"OK\");

11. Scene scene = new Scene(btOK, 209, 250);

12. primarystage.setTitle(\"MylavaFX\"); // Set the stage title

13. primarystage.setScene(scene); // Place the scene in the stage

14. primarystage.show(); // Display the stage 16

17© /\*♦

18. \* The main method is only needed for the IDE with limited

19. \* JavaFX support. Not needed for running from the command

20 ♦/

21© public static void main(String\[\] args) {

122 launch(args);

23 }

24 }

25

MyJavaFX.java - test/src

**Figure 1**

*JavaFX program has errors shown in the IDE.*

Here are the steps to configure JavaFX 11 in Eclipse 4.9:

1.  Choose Window, Preferences, Java, Build Path, User Libraries, New to  
create a library named JavaFX11.

2.  Click Add External JARs to add all the jar files from javafx-sdk-  
11.0.1/lib. Note that javafx-sdk-11.0.1 is the folder for JavaFX  
11, as described in Supplement II.G.

Now the JavaFX errors in the editor are gone. To run the code, you need
to add runtime arguments in the Run Configurations. In the project pane,
right-click the pane, choose Run As, Run Configurations to display the
Run Configurations dialog box.

Add the following in the VM arguments section under the arguments tab,
as shown in Figure 2.

\--module-path \"C:\\Program Files\\java\\javafx-sdk-11\\lib\" \--add-
modules=javafx.controls

![](media/image1.jpeg){width="5.873611111111111in"
height="4.406944444444444in"}`type` filter text

**O** Eclipse Application  
**K** Java Applet **v `E`** Java Application
>
> **E** MyJavaFX [e]{.smallcaps} Welcome **E** Welcome (1)

JuJUnit  
**Ju** Jllnit Plug in Test Launch Group OSGi Framework

![](media/image2.jpeg){width="4.253472222222222in"
height="3.073611111111111in"}*You need to add the VM arguments to run a
JavaFX program in Eclipse 4.9.*
