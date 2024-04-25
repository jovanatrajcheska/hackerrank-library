# How Will You Compare?


Write a ``Comparator`` class with the following ``3 overloaded compare methods``:

 

- boolean compare(int a, int b): Return true if int a = int b, otherwise return false.
- boolean compare(string a, string b): Return true if string a = string b, otherwise return false.
- boolean compare(int[] a, int[] b): Return true if both of the following conditions hold true: Otherwise, return false.
    -  *Arrays a and b are of equal length.*

    -  *For each index i (where 0 ≤ i < |a|, |b|), a[i] = b[i].*
 

**Note:**
- For C++, both parameters are of type Vector<int>.

### Constraints

- For strings, 1 ≤ |a|, |b| ≤ 2000
- For integers, 0 ≤ a, b ≤ 10000000
- For integer arrays, 0 ≤ |a|, |b| ≤ 10