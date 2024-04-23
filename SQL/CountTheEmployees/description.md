# Count the Employees

The data for the number employed at several famous IT companies is maintained in the COMPANY table. Write a query to print the IDs of the companies that have more than 10000 employees, in ascending order of ID.

 
## Input Format

### COMPANY

<table>
	<tbody>
		<tr>
			<th>Name</th>
			<th>Type</th>
			<th>Description</th>
		</tr>
		<tr>
			<td>ID</td>
			<td>Integer</td>
			<td>A company ID in the inclusive range <em>[1, 1000]</em>. This is the primary key.</td>
		</tr>
		<tr>
			<td>NAME</td>
			<td>String</td>
			<td>A company name. This field contains between <em>1</em> and <em>100</em> characters (inclusive).</td>
		</tr>
		<tr>
			<td>EMPLOYEES</td>
			<td>Integer</td>
			<td>The total number of employees in the company.</td>
		</tr>
	</tbody>
</table>

## Output Format

The result should contain the IDs of all the companies that have more than 10000 employees, in ascending order in the following format:

    COMPANY.ID

## Sample Input

### COMPANY

<table>
	<tbody>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>EMPLOYEES</th>
		</tr>
		<tr>
			<td>1</td>
			<td>Adobe</td>
			<td>28085</td>
		</tr>
		<tr>
			<td>2</td>
			<td>Flipkart</td>
			<td>35543</td>
		</tr>
		<tr>
			<td>3</td>
			<td>Amazon</td>
			<td>1089</td>
		</tr>
		<tr>
			<td>4</td>
			<td>Paytm</td>
			<td>9982</td>
		</tr>
		<tr>
			<td>5</td>
			<td>BookMyShow</td>
			<td>5589</td>
		</tr>
		<tr>
			<td>6</td>
			<td>Oracle</td>
			<td>4003</td>
		</tr>
		<tr>
			<td>7</td>
			<td>NIIT</td>
			<td>57782</td>
		</tr>
		<tr>
			<td>8</td>
			<td>Samsung</td>
			<td>2000</td>
		</tr>
		<tr>
			<td>9</td>
			<td>TCS</td>
			<td>10046</td>
		</tr>
		<tr>
			<td>10</td>
			<td>Wipro</td>
			<td>3500</td>
		</tr>
	</tbody>
</table>

## Sample output
    1
    2
    7
    9

### Explanation

Adobe, Flipkart, NIIT, and TCS have greater than 10000 employees, so their IDs are printed.