**Supplement: Extended Discussion on Immutable Objects\
For Introduction to Java Programming\
By Y. Daniel Liang**

Assume class A is immutable. You define a mutable subclass B that
extends class A. An instance b of class B is mutable. Since an instance
of class B is also an instance of class A. Now an instance b of class A
is mutable. This contradicts to the spirits of immutability of class A.
It should not be allowed. To prevent this from happening, you should
define A as a final class using the final modifier, which will be
introduced in Chapter 11.

So to define an immutable class, you need to do the following:

-   Make all data fields private;

-   Provide no mutator methods for data fields;

-   Provide no accessor method that returns a reference to a data field  
that is mutable.

-   Define the class as a final class.

© Copyright Y. Daniel Liang, 2005
