**Supplement: Obtaining a Formatted Strings\
For Introduction to Java Programming\
By Y. Daniel Liang**

You can print formatted output to the console using the **printf**
method. Can you obtain a formatted string? To accomplish this, use the
**format** method in the **String** class to create a formatted string.
The syntax to invoke this method is

String.format(format, item1, item2, \..., item*k*)

This method is similar to the **printf** method except that the
**format** method *returns* a formatted string, whereas the **printf**
method *displays* a formatted string. For example,

String s = String.format(\"count is %d and amount is %f\", 5, 45.56));

creates a formatted string \"count is 5 and amount is 45.560000\".

© Copyright Y. Daniel Liang, 2005
