# Cut Them All

An automated cutting machine is used to cut rods into segments. The cutting machine can only hold a rod of minLength or more. A rod is marked with the necessary cuts and their lengths are given as an array in the order they are marked. Determine if it is possible to plan the cuts so the last cut is from a rod at least minLength units long.

 

### Example

    n = 3

    lengths = [4, 3, 2]

    minLength = 7

The rod is initially sum(lengths) = 4 + 3 + 2 = 9 units long. First cut off the segment of length 4 + 3 = 7 leaving a rod 9 - 7 = 2.  Then check that the length 7 rod can be cut into segments of lengths 4 and 3. Since 7 is greater than or equal to minLength = 7, the final cut can be made. Return "Possible".

### Example

    n = 3

    lengths = [4, 2, 3]

    minLength = 7


The rod is initially sum(lengths) = 4 + 2 + 3 = 9 units long. In this case, the initial cut can be of length 4 or 4 + 2 = 6.  Regardless of the length of the first cut, the remaining piece will be shorter than minLength. Because n - 1 = 2 cuts cannot be made, the answer is "Impossible."

 
### Function Description

Complete the function cutThemAll in the editor below.

``cutThemAll`` has the following parameter(s):

    int lengths[n]:  the lengths of the segments, in order

    int minLength: the minimum length the machine can accept

 

### Returns

    string: "Possible" if all n-1 cuts can be made. Otherwise, return the string "Impossible"

 

### Constraints

- 2 ≤ n ≤ 10<sup>5</sup>
- 1 ≤ t ≤ 10<sup>9</sup>
- 1 ≤ lengths[i] ≤ 109<sup>9</sup>
- The sum of the elements of lengths equals the uncut rod length.


### Sample input 0

    STDIN     Function 
    -----     -------- 
    4     →   lengths[] size n = 4
    3     →   lengths[] =  [3, 5, 4, 3]
    5
    4
    3
    9     →   minLength= 9

### Sample output 0
    Possible

### Explanation

The uncut rod is 3 + 5 + 4 + 3 = 15 units long. Cut the rod into lengths of 3 + 5 + 4 = 12 and 3. Then cut the 12 unit piece into lengths 3 and 5 + 4 = 9. The remaining segment is 5 + 4 = 9 units and that is long enough to make the final cut.


### Sample input 1

    STDIN     Function 
    -----     -------- 
    3     →   lengths[] size n = 3
    5     →   lengths[] =  [5, 6, 2]
    6
    2
    12    →   minLength= 12

### Sample output 1

    Impossible