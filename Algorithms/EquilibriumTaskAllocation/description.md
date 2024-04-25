# Equilibrium Task Allocation


An array ``duration`` represents the execuction times of a set of ``n`` tasks performed within a computer system. duration[i] represents the execution time of the **i<sup>th</sup>** task **(0 ≤ i < n)**.

 

An operation may be performed on these tasks:

1. Select a specific task.
2. Reduce the execution time of the selected task by one time unit. If the task's duration reaches zero, it is removed from the list of tasks.
 

**The goal is to achieve an equilibrium state where all the tasks in the list have equal duration in the minimum number of operations. Return the number of operations.**
 

###  Example

    n = 4

    duration = [1, 2, 6, 3].

 

**One of the optimal strategies is to remove tasks 0, 1, and 3 in 1, 2, and 3 operations, respectively. Hence, a minimum of 6 operations is required.**

 
### Function Description

Complete the function ``getMinimumOperations`` in the editor below.

 

``getMinimumOperations`` has the following parameter(s):

    int duration[n]:  the execution times of a tasks performed within a computer system

 

### Returns

    long: minimum number of operations required to achieve an equilibrium

 

### Constraints

- 1 ≤ n ≤ 10<sup>5</sup>
- 1 ≤ duration[i] ≤ 10<sup>9</sup>