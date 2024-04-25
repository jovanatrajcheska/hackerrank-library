# 4th Bit

A binary number is a combination of 1s and 0s. Its n<sup>th</sup> least significant digit is the the  n<sup>th</sup> digit starting from the right starting with 1. **Given a decimal number, convert it to binary and determine the value of the the  4<sup>th</sup> least significant digit.**

 

### Example

    number = 23

- Convert the decimal number 23 to binary number: 23<sub>10</sub> = 2<sup>4</sup> + 2<sup>2</sup> + 2<sup>1</sup> + 2<sup>0</sup>   = (10111)<sub>2</sub>.
- The value of the *4<sup>th</sup>* index from the right in the binary representation is 0.
 

### Function Description 

Complete the function ``fourthBit`` in the editor below.

 

``fourthBit`` has the following parameter(s):

     int number:  a decimal integer

### Returns:

    int: an integer 0 or 1 matching the 4th least significant digit in the binary representation of number.

 

### Constraints

- 0 ≤ number < 2<sup>31</sup>
 