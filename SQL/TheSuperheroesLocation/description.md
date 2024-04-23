# The Superheroes Location

The locations of the superheroes have been stored in the SUPERHERO table. Write a query to print the IDs, i.e., SUPERHERO.ID of the superheroes whose latitudes and longitudes both have a value smaller than 50. ***The order of output does not matter.***

## Input format

### SUPERHERO

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
			<td>A superhero ID in the inclusive range <em>[1, 1000]</em>. This&nbsp;field is the primary key.</td>
		</tr>
		<tr>
			<td>NAME</td>
			<td>String</td>
			<td>A superhero name. This field contains between <em>1</em> and <em>100</em> characters (inclusive).</td>
		</tr>
		<tr>
			<td>LATITUDE</td>
			<td>Float</td>
			<td>The latitude of the superhero.</td>
		</tr>
		<tr>
			<td>LONGITUDE</td>
			<td>Float</td>
			<td>The longitude of the superhero.</td>
		</tr>
	</tbody>
</table>


## Output format

The result should contain the IDs of the superheroes whose latitudes and longitudes both have a value smaller than 50.

    SUPERHERO.ID

## Sample input

### SUPERHERO

<table>
	<tbody>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>LATITUDE</th>
			<th>LONGITUDE</th>
		</tr>
		<tr>
			<td>1</td>
			<td>Batman</td>
			<td>50.23</td>
			<td>85.45</td>
		</tr>
		<tr>
			<td>2</td>
			<td>Spiderman</td>
			<td>65.43</td>
			<td>65.66</td>
		</tr>
		<tr>
			<td>3</td>
			<td>Thor</td>
			<td>45.34</td>
			<td>30.89</td>
		</tr>
		<tr>
			<td>4</td>
			<td>Iron Man</td>
			<td>85.34</td>
			<td>80.98</td>
		</tr>
		<tr>
			<td>5</td>
			<td>Deadpool</td>
			<td>25.12</td>
			<td>69.21</td>
		</tr>
		<tr>
			<td>6</td>
			<td>Hulk</td>
			<td>30.34</td>
			<td>20.98</td>
		</tr>
		<tr>
			<td>7</td>
			<td>Doctor Strange</td>
			<td>40.45</td>
			<td>40.56</td>
		</tr>
		<tr>
			<td>8</td>
			<td>Captain America</td>
			<td>70.00</td>
			<td>75.32</td>
		</tr>
		<tr>
			<td>9</td>
			<td>Avengers</td>
			<td>81.32</td>
			<td>90.84</td>
		</tr>
		<tr>
			<td>10</td>
			<td>Superman</td>
			<td>85.32</td>
			<td>45.78</td>
		</tr>
	</tbody>
</table>


## Sample output

    3
    6
    7

### Explanation

- For Batman, latitude = 50.23 and longitude = 85.45. So, neither is less than 50. 
- For Thor, latitude = 45.34 and longitude = 30.89. So, both are less than 50.
- For Deadpool, latitude = 25.12 and longitude = 69.21. So, the latitude is less than 50 but the longitude is greater than 50.
- The remaining records are analyzed similarly.

*Thor, Hulk, and Doctor Strange have latitudes and longitudes less than 50 so, their IDs are printed.*

