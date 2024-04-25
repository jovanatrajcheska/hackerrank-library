# Prime or not?

Given an integer, if the number is prime, return 1. Otherwise return its smallest divisor greater than 1.

 

### Example

    n = 24 

 

The number 24 is not prime: its divisors are ``[1, 2, 3, 4, 6, 8, 12, 24]``. **The smallest divisor greater than 1 is 2.**

 

### Function Description 

Complete the function isPrime in the editor below.

 

- ``isPrime`` has the following parameter(s): long n:  a long integer to test

### Returns

    int: if the number is prime, return 1; otherwise returns the smallest divisor greater than 1

 

### Constraints

2 ≤ n ≤ 10<sup>12</sup>

### Test cases

<table>
    <tr>
        <th>Input</th>
        <th>Output</th>
    </tr>
    <tr>
        <td>2</td>
        <td>1</td>
    </tr>
    <tr>
        <td>4</td>
        <td>2</td>
    </tr>
    <tr>
        <td>13</td>
        <td>1</td>
    </tr>
    <tr>
        <td>7</td>
        <td>1</td>
    </tr>
    <tr>
        <td>15</td>
        <td>3</td>
    </tr>
    <tr>
        <td>37961921</td>
        <td>4051</td>
    </tr>
    <tr>
        <td>523619</td>
        <td>593</td>
    </tr>
    <tr>
        <td>1072843847</td>
        <td>16141</td>
    </tr>
    <tr>
        <td>1591827647</td>
        <td>28081</td>
    </tr>
    <tr>
        <td>1206516341</td>
        <td>33029</td>
    </tr>
    <tr>
        <td>135583507859</td>
        <td>146093</td>
    </tr>
    <tr>
        <td>14120520373</td>
        <td>112691</td>
    </tr>
    <tr>
        <td>108485931109</td>
        <td>196159</td>
    </tr>
    <tr>
        <td>547790008457</td>
        <td>697819</td>
    </tr>
    <tr>
        <td>10924515817</td>
        <td>103043</td>
    </tr>
</table>