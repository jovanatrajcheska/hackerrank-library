# Scheduling Errors

Write a query to return a list of professor names and their associated courses for all courses outside of their departments. There should be *no duplicate rows, but they can be in any order*.

The output should contain **two columns**: professor.name, course.name.

## Schema

### PROFESSOR

<table>
    <tr>
        <td>Name</td>
        <td>Type</td>
        <td>Description</td>
    </tr>
    <tr>
        <td>ID</td>
        <td>Integer</td>
        <td>unique id, primary key</td>
    </tr>
    <tr>
        <td>NAME</td>
        <td>String</td>
        <td></td>
    </tr>
    <tr>
        <td>DEPARTMENT_ID</td>
        <td>Integer</td>
        <td>foreign key, department.id</td>
    </tr>
    <tr>
        <td>SALARY</td>
        <td>Integer</td>
        <td></td>
    </tr>
</table>


### DEPARTMENT
<table>
    <tr>
        <td>Name</td>
        <td>Type</td>
        <td>Description</td>
    </tr>
    <tr>
        <td>ID</td>
        <td>Integer</td>
        <td>unique id, primary key</td>
    </tr>
    <tr>
        <td>NAME</td>
        <td>String</td>
        <td></td>
    </tr>
</table>


### COURSE

<table>
    <tr>
        <td>Name</td>
        <td>Type</td>
        <td>Description</td>
    </tr>
    <tr>
        <td>ID</td>
        <td>Integer</td>
        <td>unique id, primary key</td>
    </tr>
    <tr>
        <td>NAME</td>
        <td>String</td>
        <td></td>
    </tr>
    <tr>
        <td>DEPARTMENT_ID</td>
        <td>Integer</td>
        <td>foreign key, department.id</td>
    </tr>
    <tr>
        <td>CREDITS</td>
        <td>Integer</td>
        <td></td>
    </tr>
</table>


### SCHEDULE


<table>
    <tr>
        <td>Name</td>
        <td>Type</td>
        <td>Description</td>
    </tr>
    <tr>
        <td>PROFESSOR_ID</td>
        <td>Integer</td>
        <td>foreign key, professor.id</td>
    </tr>
    <tr>
        <td>COURSE_ID</td>
        <td>Integer</td>
        <td>foreign key, course.id</td>
    </tr>
    <tr>
        <td>SEMESTER</td>
        <td>Integer</td>
        <td></td>
    </tr>
    <tr>
        <td>YEAR</td>
        <td>Integer</td>
        <td></td>
    </tr>
</table>

## Sample Input
### PROFESSOR
<table>
    <tr>
        <td>ID</td>
        <td>NAME</td>
        <td>DEPARTMENT_ID</td>
        <td>SALARY</td>
    </tr>
    <tr>
        <td>1</td>
        <td>Alex Daniels</td>		
        <td>4</td>
        <td>7169</td>
    </tr>
    <tr>
        <td>2</td>			
        <td>Drew Knight</td>
        <td>1</td>
        <td>9793</td>
    </tr>
     <tr>
        <td>3</td>			
        <td>Jordan Myers</td>
        <td>4</td>
        <td>25194</td>
    </tr>
     <tr>
        <td>4</td>			
        <td>Tyler Rodriguez</td>
        <td>3</td>
        <td>9686</td>
    </tr>
     <tr>
        <td>5</td>			
        <td>Blake Gome</td>
        <td>2</td>
        <td>30860</td>
    </tr>
     <tr>
        <td>6</td>			
        <td>Spencer George</td>
        <td>5</td>
        <td>10487</td>
    </tr>
     <tr>
        <td>7</td>			
        <td>Ellis Vasquez</td>
        <td>4</td>
        <td>6353</td>
    </tr>
     <tr>
        <td>8</td>			
        <td>Morgan Flores</td>
        <td>1</td>
        <td>25796</td>
    </tr>
     <tr>
        <td>9</td>			
        <td>Riley Gilbert</td>
        <td>5</td>
        <td>35678</td>
    </tr>
     <tr>
        <td>10</td>			
        <td>Peyton Stevens</td>
        <td>2</td>
        <td>26648</td>
    </tr>
</table>

### DEPARTMENT

<table>
    <tr>
        <td>ID</td>
        <td>NAME</td>
    </tr>
    <tr>
        <td>3</td>	
        <td>Biological Sciences</td>
    </tr>
    <tr>
        <td>5</td>	
        <td>Technology</td>
    </tr>
    <tr>
        <td>6</td>	
        <td>Humanities & Social Sciences</td>
    </tr>
    <tr>
        <td>2</td>	
        <td>Clinical Medicine</td>
    </tr>
    <tr>
        <td>4</td>	
        <td>Arts and Humanities</td>
    </tr>
    <tr>
        <td>1</td>	
        <td>Physical Sciences</td>
    </tr>
</table>

### COURSE

<table>
    <tr>
        <td>ID</td>
        <td>NAME</td>
        <td>DEPARTMENT_ID</td>
        <td>CREDITS</td>
    </tr>
    <tr>
        <td>9</td>			
        <td>Clinical Biochemistry</td>
        <td>2</td>
        <td>3</td>
    </tr>
    <tr>
        <td>4</td>			
        <td>Astronomy</td>
        <td>1</td>
        <td>6</td>
    </tr>
    <tr>
        <td>10</td>	
        <td>Clinical Neuroscience</td>
        <td>2</td>
        <td>5</td>
    </tr>
    <tr>
        <td>1</td>		
        <td>Pure Mathematics and Mathematical Statistics	</td>
        <td>1</td>
        <td>3</td>
    </tr>
    <tr>
        <td>6</td>		
        <td>Geography</td>
        <td>1</td>
        <td>7</td>
    </tr>
    <tr>
        <td>8</td>			
        <td>Chemistry</td>
        <td>1</td>
        <td>1</td>
    </tr>
    <tr>
        <td>5</td>			
        <td>Physics</td>
        <td>1</td>
        <td>8</td>
    </tr>
    <tr>
        <td>3</td>			
        <td>Earth Science</td>
        <td>1</td>
        <td>7</td>
    </tr>
    <tr>
        <td>7</td>			
        <td>Materials Science and Metallurgy</td>
        <td>1</td>
        <td>5</td>
    </tr>
    <tr>
        <td>2</td>			
        <td>Applied Mathematics and Theoretical Physics</td>
        <td>1</td>
        <td>5</td>
    </tr>
</table>

### SCHEDULE

<table>
    <tr>
        <td>PROFESSOR_ID</td>			
        <td>COURSE_ID</td>
        <td>SEMESTER</td>
        <td>YEAR</td>
    </tr>
    <tr>
        <td>4</td>			
        <td>4</td>
        <td>3</td>
        <td>2003</td>
    </tr>
    <tr>
        <td>3</td>			
        <td>3</td>
        <td>1</td>
        <td>2011</td>
    </tr>
    <tr>
        <td>1</td>			
        <td>7</td>
        <td>5</td>
        <td>2011</td>
    </tr>
    <tr>
        <td>7</td>			
        <td>7</td>
        <td>1</td>
        <td>2010</td>
    </tr>
    <tr>
        <td>4</td>			
        <td>6</td>
        <td>1</td>
        <td>2001</td>
    </tr>
    <tr>
        <td>9</td>			
        <td>3</td>
        <td>1</td>
        <td>2012</td>
    </tr>
    <tr>
        <td>10</td>			
        <td>2</td>
        <td>4</td>
        <td>2009</td>
    </tr>
    <tr>
        <td>1</td>			
        <td>1</td>
        <td>3</td>
        <td>2014</td>
    </tr>
    <tr>
        <td>1</td>			
        <td>2</td>
        <td>3</td>
        <td>2008</td>
    </tr>
    <tr>
        <td>1</td>			
        <td>7</td>
        <td>5</td>
        <td>2007</td>
    </tr>
</table>

## Sample output
    Tyler Rodriguez Astronomy
    Jordan Myers Earth Sciences
    Alex Daniels Materials Science and Metallurgy
    Ellis Vasquez Materials Science and Metallurgy
    Tyler Rodriguez Geography
    Riley Gilbert Earth Sciences
    Peyton Stevens Applied Mathematics and Theoretical Physics
    Alex Daniels Pure Mathematics and Mathematical Statistics
    Alex Daniels Applied Mathematics and Theoretical Physics
    Alex Daniels Materials Science and Metallurgy 

### Explanation

**Example logic**

1. Professor Tyler Rodriguez's department_id is 3, but the Astronomy course's department_id is 1.

2. Professor Jordan Myers's department_id is 4, but the Earth Sciences course's department_id is 1