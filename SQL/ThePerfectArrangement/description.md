# The Perfect Arrangement

Write a query to print the id, first_name and last_name. To filter the names, concatenate the first and last names to create a combined name. Return the names of customers whose combined names are less than 12 letters long. Sort the results by their combined name lengths, then alphabetically, case insensitive, by combined name, then by id. ***All sorts are ascending.***



## Input format

### CUSTOMER

<table>
	<tbody>
		<tr>
			<th><strong>Name</strong></th>
			<th><strong>Type</strong></th>
			<th><strong>Description</strong></th>
		</tr>
		<tr>
			<td>ID</td>
			<td>Integer</td>
			<td>unique id, primary key.</td>
		</tr>
		<tr>
			<td>FIRST_NAME</td>
			<td>String</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>LAST_NAME</td>
			<td>String</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>COUNTRY</td>
			<td>String</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>CREDIT_LIMIT</td>
			<td>Float</td>
			<td>&nbsp;</td>
		</tr>
	</tbody>
</table>



## Output format

    CUSTOMER.ID CUSTOMER.FIRST_NAME CUSTOMER.LAST_NAME


## Sample input

### CUSTOMER

<table>
	<tbody>
		<tr>
			<th>ID</th>
			<th>FIRST_NAME</th>
			<th>LAST_NAME</th>
			<th>COUNTRY</th>
			<th>CREDIT_LIMIT</th>
		</tr>
		<tr>
			<td>1</td>
			<td>Alex</td>
			<td>White</td>
			<td>USA</td>
			<td>200350.54</td>
		</tr>
		<tr>
			<td>2</td>
			<td>Tyler</td>
			<td>Hanson</td>
			<td>UK</td>
			<td>15354.23</td>
		</tr>
		<tr>
			<td>3</td>
			<td>Jordan</td>
			<td>Fernandez</td>
			<td>France</td>
			<td>359200.67</td>
		</tr>
		<tr>
			<td>4</td>
			<td>Drew</td>
			<td>Bradley</td>
			<td>Albania</td>
			<td>1060.57</td>
		</tr>
		<tr>
			<td>5</td>
			<td>Blake</td>
			<td>Fuller</td>
			<td>USA</td>
			<td>14789.00</td>
		</tr>
		<tr>
			<td>6</td>
			<td>Spencer</td>
			<td>Johnston</td>
			<td>China</td>
			<td>100243.35</td>
		</tr>
		<tr>
			<td>7</td>
			<td>Ellis</td>
			<td>Gutierrez</td>
			<td>USA</td>
			<td>998999.20</td>
		</tr>
		<tr>
			<td>8</td>
			<td>Morgan</td>
			<td>Thomas</td>
			<td>Canada</td>
			<td>500500.23</td>
		</tr>
		<tr>
			<td>9</td>
			<td>Riley</td>
			<td>Garza</td>
			<td>UK</td>
			<td>18782.44</td>
		</tr>
		<tr>
			<td>10</td>
			<td>Peyton</td>
			<td>Harris</td>
			<td>USA</td>
			<td>158367.00</td>
		</tr>
	</tbody>
</table>

## Sample output

    1	Alex White
    9	Riley Garza
    5	Blake Fuller
    4	Drew Bradley
    2	Tyler Hanson

### Explanation

AlexWhite is 9 letters, so it is included in the results. JordanFernandez is 15 letters, so it is omitted. The last 3 names are the same length, so they are sorted alphabetically ascending.

Names that are excluded and their lengths.

    MorganThomas	12
    PeytonHarris	12
    EllisGutierrez	14
    JordanFernandez	15
    SpencerJohnston	15