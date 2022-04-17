Solutions for UML Class Diagrams

***Chapter 9***

***Exercise 9.2: Stock***

+--------------------------------+-------------------------------------+
| Stock                          |                                     |
+--------------------------------+-------------------------------------+
| symbol: String                 | The symbol of this stock.           |
|                                |                                     |
| name: String                   | The name of this stock.             |
|                                |                                     |
| previousClosingPrice: double   | The previous closing price of this  |
| currentPrice: double           | stock.                              |
|                                |                                     |
|                                | The current price of this stock.    |
+--------------------------------+-------------------------------------+
| Stock(symbol: String, name:    | Constructs a stock with a specified |
| String) getChangePercent():    | symbol and a name Returns the       |
| double                         | percentage of change of this stock. |
+--------------------------------+-------------------------------------+

***Exercise 9.6: StopWatch***

![](media/image1.png){width="0.9798611111111111in"
height="0.6201388888888889in"}

***Exercise 9.8: Fan***

  ------------------------------ ----------------------------------------
  Fan                            

  +SLOW = 1                      Constant.

  +MEDIUM = 2                    Constant.

  `+FAST = 3`        Constant.

  -speed: int                    The speed of this fan (default 1).

  -on: boolean                   Indicates whether the fan is on (default
                                 false).

  -radius: double                The radius of this fan (default 5).

  -color: String                 The color of this fan (default white).

  +Fan()                         Constructs a fan with default values.

  +getSpeed(): int               Returns the speed of this fan.

  +setSpeed(speed: int): void    Sets a new speed for this fan.

  +isOn(): boolean               Returns true if this fan is on.

  +setOn(on: boolean): void      Sets this fan on to true or false.

  +getRadius(): double           Returns the radius of this fan.

  +setRadius(radius: double):    Sets a new radius for this fan.
  void                           

  +getColor(): String            Returns the color of this fan.

  +setColor(color: String): void Sets a new color for this fan.

  +toString(): String            Returns a string representation for this
                                 fan.
  ------------------------------ ----------------------------------------

***Exercise 9.10:***

***QuadraticEquation***

QuadraticEquation

-a: double

-b: double  
get methods for all data fields are provided and omitted for brevity.

Three coefficients for the equation.

-c: double

+QuadraticEquation(a: double, b: double, c: double)

+getDiscriminat(): double

+getRoot1(): double

+getRoot2(): dou bl e

Constructs a QuadraticEquation with the specified coefficients.

Returns the discriminant of this equation.

Returns the first root of this equation.

Returns the second root of this equation.

***Chapter 10***

***Exercise 10.4: MyPoint***

![](media/image2.png){width="0.6333333333333333in" height="0.3in"}

  ------------------------------- ---------------------------------------
  MyPoint                         

  -x: double                      x-coordinate of this point.

  -y: double                      y-coordinate of this point.

  +MyPoint()                      Constructs a Point object at (0, 0).

  +MyPoint(x: double, y: double)  Constructs an object with specified x
                                  and y values.

  +getX(): double                 Returns x value in this object.

  +getY(): double                 Returns y value in this object.

  +distance(secondPoint:          Returns the distance from this point to
  MyPoint): double                another point.

  \+[distance(p1: Point, p2:      Returns the distance between two
  MyPoint): double]{.underline}   points.
  ------------------------------- ---------------------------------------

***Exercise 10.8: Tax***  
Tax

-filingStatus: int

-brackets: int\[\]\[\]

-rates: double\[\]

-taxableIncome: double

+Tax()

+Tax(filingStatus: int, brackets: int\[\], rates: double\[\],
taxableIncome: double)

+getFilingStatus(): int

+setFilingStatus(filingStatus: int): void

+getBrackets(): int\[\]\[\]

+setBrackets(brackets: int\[\]\[\]): void

+getRates(): double\[\]

+setRates(rates: double\[\]): void

+getTaxableIncom(): double

+setTaxableIncome(taxableIncome: double): void

+getTax(): double

***Exercise 10.12: MyRectangle2D***  
MyRectangle2D

-   x: double

-   y: double

-   width: double

-   height: double

+MyRectangle2D()

+MyRectangle2D(x: double, y: double, width: double, height: double)

+getX(): double

+setX(x: double): void

+getY():double

+setY(y: double): void

+getWidth(): double

+setWidth(width: double): void

+getHeight(): double

+setHeight(height: double): void

+getRadius(): double

+getPerimeter(): double

+getArea(): double

+contains(x: double, y: double): boolean

+contains(r Rectangle2D): boolean

+overlaps(r: Rectangle2D): boolean

***Exercise 10.14: MyDate***

+------------------------+---------------------------------------------+
| MyDate                 | The year for the d ate.                     |
|                        |                                             |
|                        | The month for the date.                     |
|                        |                                             |
|                        | The day for the date.                       |
|                        |                                             |
|                        | Constructs MyDate for the current date.     |
|                        |                                             |
|                        | Constructs MyDate with a specified elapse   |
|                        | time in milliseconds.                       |
|                        |                                             |
|                        | Returns the year for the date.              |
|                        |                                             |
|                        | Returns the month for the date.             |
|                        |                                             |
|                        | Returns the day for the date.               |
|                        |                                             |
|                        | Sets a new date using the elapsed time.     |
+------------------------+---------------------------------------------+
| -year: int             |                                             |
|                        |                                             |
| -month: int            |                                             |
|                        |                                             |
| -day: int              |                                             |
+------------------------+---------------------------------------------+
| +MyDate()              |                                             |
|                        |                                             |
| +MyDate(elapsedTime:   |                                             |
| long)                  |                                             |
|                        |                                             |
| +getYear(): int        |                                             |
|                        |                                             |
| +getMonth(): int       |                                             |
|                        |                                             |
| +getDay(): int         |                                             |
|                        |                                             |
| +setDate(elapsedTime:  |                                             |
| long): void            |                                             |
+------------------------+---------------------------------------------+

***Chapter 11***

***Exercise 11.2: Person, Student, Staff, Employee***

![](media/image3.png){width="2.946527777777778in"
height="1.2534722222222223in"}

Person

-name: String

-address: String

-phone: String

-email: String

+Person()

+Person(name: String, address: String, phone: String, email: String)

+getName(): String +getAddress(): String +getPhone(): String
+getEmail(): String +setName(name: String): void +setAddress(address:
String): void +setPhone(phonee: String): void +setEmail(email: String):
void +toString(): String

Student

-status: String

+Student()

+Student(name: String, address:

String, phone: String, email:

String)

+getStatus(): String

+setStatus(status: String): void

+toString(): String

Employee

-office: String

-salary: int

-dateHired: java.util.Date

+Employee()

+Employee(name: String, address: String, phone: String, email: String)

+getOffice(): String

+getSalary(): int

+getDateHired(): Date

+setOffice(office: String): void

+setSalary(salary: int): void

+setDateHired(dataHired: Date): void +toString(): String

Faculty

-officeHour: String

-rank: String

+Faculty()

+Faculty(name: String, address: String, phone: String, email: String)

+getOfficeHour(): String

+setOfficeHour(officeHour: String): void

+getRank(): String

+setRank(rank: String): void

+toString(): String

MyDate  
-year: int
>
> -month: int
>
> -day: int
>
> +Faculty()
>
> +getYear(): int
>
> +getMonth(): int
>
> +getDay(): int
>
> +setYear(year: int): void +setMonth(month: int): void +setDay(day:
> int): void +toString(): String

***Exercise 11.10: MyStack***

MyArrayList

![](media/image4.png){width="0.19305555555555556in"
height="0.2465277777777778in"}

  ---------------------- ------------------------------------------------
  MyStack                

  +isEmpty(): boolean    Returns true if this stack is empty.

  +getSize(): int        Returns the number of elements in this stack.

  +peek(): Object        Returns the top element in this stack.

  +pop(): Object         Returns and removes the top element in this
                         stack.

  +push(o: Object):      Adds a new element to the top of this stack.
  Object                 

  +search(o: Object):    Returns the position of the first element in the
  int                    stack from the top that matches the specified
                         element.
  ---------------------- ------------------------------------------------

***Chapter 13***

***Exercise 13.6: ComparableCircle***

![](media/image5.jpeg){width="3.533333333333333in"
height="1.3263888888888888in"}

***Exercise 13.10: Rectangle***

![](media/image6.jpeg){width="3.566666666666667in"
height="1.0666666666666667in"}
