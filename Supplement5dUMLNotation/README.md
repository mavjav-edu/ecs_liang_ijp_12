Appendix

**[UML Graphical]{.smallcaps}**

**[Notations]{.smallcaps}**

This appendix summarizes the UML notations used in this book.

**Classes and Objects**

![](media/image1.jpeg){width="0.31319444444444444in"
height="0.6263888888888889in"}A class is described using a rectangle box
with three sections.

  --------------------------------- -------------------------------------
  Circle                            \< Class name

  radius                            \< Properties

  *findArea*                        \< Methods
  --------------------------------- -------------------------------------

The top section gives the class name, the middle section describes the
fields, and the bottom section describes the methods. The middle and
bottom sections are optional, but the top section is required.

An object is described using a rectangle box with two sections.

The top section is required. It gives the object's name and its defining
class. The second section is optional; it indicates the object's field
values.

**A-7**

**A-8 Appendix E** UML Graphical Notations

***The Modifiers public, private, protected, and static***  
The symbols +, ---, and \# are used to denote, respectively, *public*,
> *private*, and *protected* modifiers in the UML. The static fields and
> methods are underlined.

+-------------------------------+------+------+------------------------+
| **Circle**                    |      |      |                        |
+-------------------------------+------+------+------------------------+
| *-radius: double*             |      | **-  | Private properties     |
|                               |      | \<** |                        |
| *[-numOfObjects:              |      |      |                        |
| int]{.underline}*             |      |      |                        |
+-------------------------------+------+------+------------------------+
| *+Circle()*                   |      | **-  | Constructors           |
|                               |      | \*** |                        |
| *+Circle(radius: double)*     |      |      |                        |
+-------------------------------+------+------+------------------------+
| *+getRadius(): double*        | *v   | **-  | Public methods         |
|                               | oid* | \<** |                        |
| *+setRadius(radius: double):* |      |      |                        |
|                               |      |      |                        |
| *+findArea(): double*         |      |      |                        |
+-------------------------------+------+------+------------------------+
| *#aMethod(): void*            |      | **   | Protected methods      |
|                               |      | \<** |                        |
+-------------------------------+------+------+------------------------+
| *[+getNumOfObjects():         |      | **-  | Static methods         |
| int]{.underline}*             |      | \<** |                        |
+-------------------------------+------+------+------------------------+  
**Class Relationships**
>
> The relationships of the classes are association, aggregation, and
> inheritance.
>
> An *association* is illustrated using a solid line between the two
> classes with an optional label that describes their relationship.

![](media/image2.jpeg){width="3.8069444444444445in"
height="0.30694444444444446in"}  
Each class involved in an association may specify a multiplicity. A
> multiplicity is a number or an interval that specifies the number of
> objects of the class that are involved in the relationship. The
> character \* means that the number of objects is unlimited, and an
> interval *1..u* means that the number of objects should be between *1*
> and *u*, inclusive.
>
> A filled diamond is attached to the composed class to denote the
> composition relationship, and a hollow diamond is attached to the
> aggregated class to denote the *aggregation* relationship, as shown
> below.

. 1 \* Owned by ► 1 \* Employed by ◄ \*\
`Magazine \|` `Publisher Q` [1
Consultant]{.underline}  
*Inheritance* models the is-a relationship between two classes, as
> shown below. An open triangle

![](media/image3.jpeg){width="4.866666666666666in"
height="1.2131944444444445in"}  
**Appendix E** UML Graphical Notations **A-9**

**Abstract Classes and Interfaces**

Abstract class names, interface names, and abstract methods are
italicized. Dashed lines are used to link to the interface, as shown
below:

Abstract class

![](media/image4.jpeg){width="3.859722222222222in"
height="1.020138888888889in"}

**Sequence Diagrams**

Sequence diagrams describe interactions among objects by depicting the
time ordering of method invocations. The sequence diagram shown below
consists of the following elements:

-   Class role represents the role an object plays. The objects at the  
top of the diagram repre­sent class roles.

-   Lifeline represents the existence of an object over a period of  
time. A vertical dashed line extending from the object is used to  
denote a lifeline.

-   Activation represents the time during which an object is performing  
an operation. Thin rectangles placed on lifelines are used to  
denote activations.

-   Method invocation represents communications between objects.  
Horizontal arrows la­beled with method calls are used to denote  
method invocations.

![](media/image5.jpeg){width="4.246527777777778in"
height="1.4930555555555556in"}

**Statechart Diagrams**

Statechart diagrams describe the flow of control of an object. The
statechart diagram shown below contains the following elements:

**A-10 Appendix E** UML Graphical Notations

-   State represents a situation during the life of an object in which  
it satisfies some condi­tion, performs some action, or waits for  
some event to occur. Every state has a name. Rec­tangles with  
rounded corners are used to represent states. The small filled  
circle is used to denote the initial state.

-   Transition represents the relationship between two states,  
indicating that an object will perform some action to transfer  
from one state to the other. A solid arrow with appropri­ate method  
invocation is used to denote a transition.

Indicate

Initial State

![](media/image6.jpeg){width="1.2069444444444444in"
height="1.2597222222222222in"}
