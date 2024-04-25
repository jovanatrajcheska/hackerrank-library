# Calculator Classes

Before computers were common, accountants used a mechanical adding machine for their calculations. It did just that: it added signed numbers. If they wanted to multiply, they had to add that many times. For example, to multiply ``3 by 3``, they pressed ``3 <add> 3 <add> 3 <add> <total>`` and got ``3 3 3 T9`` on their printout, **resetting the sum to 0 at <total>**. Luckily there was a subtotal so they could print out a value and carry it forward.

 

Alex wants to build **two calculators** as described below:

- The ``Adder`` calculator that returns the **sum of two integers**.
- The ``Multiplier`` calculator that returns the **product of two integers via addition**.
 

In this challenge, help Alex build the calculators by writing the complete implementations of the following two classes:

1. The Adder class should implement the method int add(int a, int b) to return the sum of two integers, a and b. It should also print Adding integers: a b each time it is called.
2. The Multiplier class should implement the method int multiply(int a, int b, Calculator calculator) to return the result of a x b by repeated addition using the Adderclass. 
 

The locked stub code in the editor consists of the following:

- An abstract class Calculator that contains an abstract method, int add(int a, int b).
- A solution class that tests the implementation of the Adder and the Multiplier classes by
    - creating an object of the Adder class. 
    - reading the inputs and passes them along with the Adder class object in the method int multiply(int a, int b, Calculator calculator) of the Multiplier class.

- Adds headers and footers
    - Testing Addition, Sum =
    - Testing Multiplication, Product =
 

### Constraints

- 1 ≤ a, b ≤ 10<sup>3</sup>

### Sample input
    7
    4

### Sample output

    Testing Addition
    Adding integers: 7 4
    Sum = 11

    Testing Multiplication
    Adding integers: 7 7
    Adding integers: 14 7
    Adding integers: 21 7
    Product = 28

### Explanation

Multiplying 7 by 4 is the same as adding 7 to itself 4 times.

- 7 + 7 = 14.
- 14 + 7 = 21.
- 21 + 7 = 28.