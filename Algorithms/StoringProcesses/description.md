# Storing Processes

Developers have ceated a new storage system. There are ``n`` processes that need to be stored, where the ith process is divided into ``num_segments[i]`` number of segments. The memory is divided into ``m`` storage spaces. The segments of processes are stored in the memory spaces in the following way:

- Each segment is stored in exactly one of the memory spaces.
- Each memory space contains at least one process segment.
- A memory space cannot contain segments of different processes.
 

The storage efficiency of the system is defined as the minimum number of segments in a single memory space of all the ``m`` storage spaces. The developers want to distribute the segments of processes in such a way that the storage efficiency of the storage system is maximized. **Find the maximum storage efficiency.**

 

### Example

    n = 2

    num_segments = [7, 10]

    m = 4

 

One of the optimal ways to store the processes is:

- Store 3 segments of process 1 in storage space 1.
- Store 4 segments of process 1 in storage space 2.
- Store 5 segments of process 2 in storage space 3.
- Store 5 segments of process 2 in storage space 4. 


**The minimum segments in any storage space is 3 in storage space 1. Hence, the maximum possible storage efficiency is 3.**

 
### Function Description

Complete the function ``getMaximumStorageEfficiency`` in the editor below.

``getMaximumStorageEfficiency`` has the following parameter(s):

    int num_segments[n]:  the number of segments a process is divided into

    long m: the number of storage spaces

 

### Returns

    int: the maximum storage efficiency

 

### Constraints

- 1 ≤ n ≤ 2 * 10<sup>5</sup>
- 1 ≤ num_segments[i] ≤ 10<sup>9</sup>
- n ≤ m ≤ Σ num_segments[i]