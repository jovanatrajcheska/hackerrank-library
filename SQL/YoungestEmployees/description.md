# Youngest Employees

There are two data tables with employee information: EMPLOYEE and EMPLOYEE_UIN. Query the tables to generate a list of all employees who are less than 25 years old first in order of NAME, then of ID, both ascending.  The result should include the UIN followed by the NAME.  

 

**Note:**  While the secondary sort is by ID, the result includes UIN but not ID.

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


### Sample input

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
        <td>Sherrie</td>
        <td>23</td>
        <td>Paris</td>
        <td>74635</td>
    </tr>
    <tr>
        <td>2</td>
        <td>Paul</td>
        <td>30</td>
        <td>Sydney</td>
        <td>72167</td>
    </tr>
    <tr>
        <td>3</td>
        <td>Mary</td>
        <td>24</td>
        <td>Paris</td>
        <td>75299</td>
    </tr>
    <tr>
        <td>4</td>
        <td>Sam</td>
        <td>47</td>
        <td>Sydney</td>
        <td>46681</td>
    </tr>
    <tr>
        <td>5</td>
        <td>Dave</td>
        <td>22</td>
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
    <tr>
        <td>4</td>
        <td>68599-6112</td>
    </tr>
    <tr>
        <td>5</td>
        <td>63868-453</td>
    </tr>
</table>

### Sample output

    63868-453 Dave
    63550-194 Mary
    57520-0440 Sherrie

### Explanation

- Sherrie is 23 years old and has UIN 57520-0440.  This record is printed.
- Paul is 30 years old and has UIN 49638-001.  This record is not printed.
- A similar analysis is done on the remaining records.

None of the three names of people less than 25 years old is repeated, so print them in alphabetical order.  There is no additional sorting by ID in this case.