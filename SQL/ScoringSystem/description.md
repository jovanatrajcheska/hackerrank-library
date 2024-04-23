# Scoring System


The math scores of each student have been stored in the STUDENT table. Write a query to print the ID and the NAME of each of the three highest scoring students. Print the NAMEs in descending order by SCORE, then ***ascending order by ID*** for matching SCOREs.

### Input format

### STUDENT

<table>
    <tr>
        <td>Name</td>
        <td>Type</td>
        <td>Description</td>
    </tr>
    <tr>
        <td>ID</td>
        <td>Integer</td>
        <td>A student ID in the inclusive range [1, 1000]. This field is the primary key.</td>
    </tr>
    <tr>
        <td>NAME</td>
        <td>String</td>
        <td>A student name. This field contains between 1 and 100 characters (inclusive).</td>
    </tr>
    <tr>
        <td>Score</td>
        <td>Float</td>
        <td>The Math score of the student.</td>
    </tr>
</table>


### Output format
The result should contain the IDs and the NAMEs of the three highest scoring students. Print the records in descending order by SCORE, then ascending order by ID for matching SCOREs.


    STUDENT.ID STUDENT.NAME


## Sample input

<table>
    <tr>
        <td>ID</td>
        <td>NAME</td>
        <td>SCORE</td>
    </tr>
    <tr>
        <td>1</td>
        <td>Bob</td>
        <td>50</td>
    </tr>
    <tr>
        <td>2</td>
        <td>John</td>
        <td>65.5</td>
    </tr>
    <tr>
        <td>3</td>
        <td>Harry</td>
        <td>45</td>
    </tr>
     <tr>
        <td>4</td>
        <td>Dick</td>
        <td>85</td>
    </tr>
    <tr>
        <td>5</td>
        <td>Dev</td>
        <td>25</td>
    </tr>
    <tr>
        <td>6</td>
        <td>Sid</td>
        <td>98</td>
    </tr>
    <tr>
        <td>7</td>
        <td>Tom</td>
        <td>90</td>
    </tr>
    <tr>
        <td>8</td>
        <td>Julia</td>
        <td>70.5</td>
    </tr>
    <tr>
        <td>9</td>
        <td>Erica</td>
        <td>81</td>
    </tr>
    <tr>
        <td>10</td>
        <td>Jerry</td>
        <td>85</td>
    </tr>
</table>

## Sample output

    6 Sid
    7 Tom
    4 Dick

### Explanation

The students are arranged in the descending order of their math scores, followed by the ascending order of their ids, as shown below:

 

    Sid > Tom > Dick > Jerry > Erica > Julia > John > Bob > Harry > Dev

 

Dick's and Jerry's scores were the same, so they are shown in ID order.