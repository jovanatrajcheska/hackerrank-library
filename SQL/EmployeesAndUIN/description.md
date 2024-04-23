# Employees and UIN

A company maintains the data of its employees in two tables: *EMPLOYEE* and *EMPLOYEE_UIN*. Write a **query** to print the **NAME** and **UIN** of employees. If there is NO unique identification number present corresponding to the employee, then print **NULL** instead as the **UIN**. *The order of output does not matter.*

 

### Input Format
### EMPLOYEE
<table> 
    <tr>
        <td>Name</td>
        <td>Type</td>
        <td>Description</td>
    </tr>
    <tr>
        <td>ID</td>
        <td>Integer</td>
        <td>The ID of the employee. This is a primary key.</td>
    </tr>
    <tr>
        <td>NAME</td>
        <td>String</td>
        <td>The name of the employee having [1, 20] characters.</td>
    </tr>
    <tr>
        <td>AGE</td>
        <td>Integer</td>
        <td>The age of the employee.</td>
    </tr>
    <tr>
        <td>ADDRESS</td>
        <td>String</td>
        <td>The address of the employee having [1, 25] characters.</td>
    </tr>
    <tr>
        <td>SALARY</td>
        <td>Integer</td>
        <td>The salary of the employee.</td>
    </tr>
</table>

	
		
		
### EMPLOYEE_UIN
<table>
    <tr>
        <td>Name</td>
        <td>Type</td>
        <td>Description</td>
    </tr>
    <tr>
        <td>ID</td>
        <td>Integer</td>
        <td>The ID of the employee. This is a primary key.</td>
    </tr>
    <tr>
        <td>UIN</td>
        <td>Integer</td>
        <td>The unique identification number of the employee.</td>
    </tr>
</table>

### Output Format

    Each row must contain the NAME followed by the UIN  of each employee.   If the UIN is empty, print NULL in the UIN column.

### Sample Input		

### EMPLOYEE
<table>
    <tr>
        <td>ID</td>
        <td>NAME</td>
        <td>AGE</td>
        <td>ADDRESS</td>
        <td>SALARY</td>
    </tr>
    <tr>
        <td>1</td>
        <td>Ileana</td>
        <td>27</td>
        <td>Paris</td>
        <td>74635</td>
    </tr>
    <tr>
        <td>2</td>
        <td>Bob</td>
        <td>30</td>
        <td>Sydney</td>
        <td>72167</td>
    </tr>
    <tr>
        <td>3</td>
        <td>Julia</td>
        <td>29</td>
        <td>Paris</td>
        <td>75299</td>
    </tr>
    <tr>
        <td>4</td>
        <td>Samantha</td>
        <td>47</td>
        <td>Sydney</td>
        <td>46681</td>
    </tr>
    <tr>
        <td>5</td>
        <td>David</td>
        <td>27</td>
        <td>Texas</td>
        <td>11843</td>
    </tr>
</table>

### EMPLOYEE_UIN

<table>
    <tr>
        <td>ID</td>
        <td>UIN</td>
    </tr>
    <tr>
        <td>1</td>
        <td>57520-0440</td>
    </tr>
    <tr>
        <td>2</td>
        <td>49638-001</td>
    </tr>
    <tr>
        <td>3</td>
        <td>63550-194</td>
    </tr>
</table>

### Sample output

    Samantha NULL
    Ileana 57520-0440
    Bob 49638-001
    Julia 63550-194
    David NULL

### Explanation

- Ileana has UIN 57520-0440.
- Bob has UIN 49638-001.
- Julia has UIN 63550-194.
- Samantha does not have a UIN in the EMPLOYEE_UIN table, so NULL is printed.
- David does not have a UIN in the EMPLOYEE_UIN table, so NULL is printed.