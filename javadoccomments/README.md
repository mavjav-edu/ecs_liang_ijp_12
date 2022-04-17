**Supplement: javadoc Comments**

**For Introduction to Java Programming\
By Y. Daniel Liang**

1.  **Introduction**

Java supports comments of a special type, referred to as *javadoc
comments.* javadoc comments begin with **/\*\*** and end with **\*/**.
You can use javadoc comments to describe a class, an interface, data
fields, and methods. The javadoc comments can be extracted into an HTML
file using the JDK's **javadoc** command.

2.  **An Example**

Listing 1 gives an example of a program with javadoc comments.

**Listing 1 Loan.java**

/\*\* This class models a loan \*/

public class Loan {

/\*\* Data field: annual interest rate \*/

private double annualInterestRate;

/\*\* Data field: number of years \*/

private int numberOfYears;

/\*\* Data field: loan amount \*/

private double loanAmount;

/\*\* Data field: loan creation date \*/

private java.util.Date loanDate;

/\*\* Default constructor \*/

public Loan() {

this(2.5, 1, 1000);

}

/\*\* Construct a loan with specified annual interest rate,

number of years, and loan amount

\*/  
public Loan(double annualInterestRate, int numberOfYears, double
> loanAmount) {

this.annualInterestRate = annualInterestRate;

this.numberOfYears = numberOfYears;

this.loanAmount = loanAmount;

loanDate = new java.util.Date();

}

/\*\* Return annualInterestRate \*/

public double getAnnualInterestRate() {

return annualInterestRate;

}

/\*\* Set a new annualInterestRate \*/  
public void setAnnualInterestRate(double annualInterestRate) {
> this.annualInterestRate = annualInterestRate;

}

/\*\* Return numberOfYears \*/

public int getNumberOfYears() {

return numberOfYears;

}

/\*\* Set a new numberOfYears \*/  
public void setNumberOfYears(int numberOfYears) { this.numberOfYears =
> numberOfYears;

}

/\*\* Return loanAmount \*/

public double getLoanAmount() {

return loanAmount;

}

/\*\* Set a newloanAmount \*/  
public void setLoanAmount(double loanAmount) { this.loanAmount =
> loanAmount;

}

/\*\* Find monthly payment \*/

public double getMonthlyPayment() {

double monthlyInterestRate = annualInterestRate / 1200;  
double monthlyPayment = loanAmount \* monthlyInterestRate / (1 - (1 /
> Math.pow(1 + monthlyInterestRate, numberOfYears \* 12)));

return monthlyPayment;

}

/\*\* Find total payment \*/

public double getTotalPayment() {  
double totalPayment = getMonthlyPayment() \* numberOfYears \* 12;
> return totalPayment;

}

/\*\* Return loan date \*/  
public java.util.Date getLoanDate() { return loanDate;

}

}

3.  **Generating HTML Document**

You can generate HTML document for the preceding program using the
javadoc comment as follows:

This command processes the source code file Loan.java to generate
Loan.html and its supporting HTML files. You can view Loan.html as shown
in Figure 1.

Figure 1 Loan.html is displayed in a browser.

![](media/image1.jpeg){width="4.740277777777778in" height="7.5in"}

You can use javadoc tags to specify the type of the information
described in the comments. The commonly used tags are the following:

-   \@author \[author name\]: identifies the author(s) of a class or
    interface.

-   \@version \[version\]: gives the version of a class or interface.

-   \@param \[parameter name\] \[parameter description\]: describes the  
parameters in a method or constructor.

-   \@return \[description of return\]: describes a return value from a
    method.

-   \@exception \[exception thrown\] \[exception description\]:  
describes exception thrown from a method or a constructor.

-   \@exception \[exception thrown\] \[exception description\]: same as
    \@exception

Listing 2 gives an example of using these tags.

**Listing 2 Circle.java**

/\*\* This class models a circle

\*

\* \@author Daniel Liang

\* \@version 2.1

\*/

public class Circle {  
/\*\* Data field: the radius of a circle \*/ private double radius;
>
> /\*\* Construct a default circle \*/ public Circle() { }

/\*\* Construct a circle with the specified radius

-   \@param radius the radius of the circle

\*/  
public Circle(double radius) { this.radius = radius;

}

/\*\* Return the radius

-   \@return radius

\*/  
public double getRadius() { return radius;

}

/\*\* Set a new radius

-   \@param radius a new radius

-   \@throws IllegalArgumentException if the radius is negative \*/  
public void setRadius(double radius) { if (radius \< 0)

throw new IllegalArgumentException(\"Radius is negative\");

this.radius = radius;

}

/\*\* Return area

-   \@return the area of the circle

\*/

public double getArea() {

-   eturn radius \* radius \* Math.PI;

}

}

Figure 2 shows the HTML file generated from the javadoc comments in
Circle.java.

![](media/image2.jpeg){width="5.266666666666667in"
height="7.246527777777778in"}

Figure 2 Circle.html is displayed in a browser.
