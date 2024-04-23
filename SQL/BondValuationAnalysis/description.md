# Bond Valuation Analysis

A financial services company wants to analyze customer bond holdings. There is a database with a snapshot of the market values of bonds in customer portfolios. **For each investor, determine the minimum, maximum, and average valuation of bonds in their portfolios.**

 

The result should have the following columns: *email | investments | min_valuation | max_valuation | avg_valuation.*

- *email* - investor email
- *investments* - total number of investments by a specific investor
- *min_valuation* - minimum bond valuation of investments for a specific investor
- *max_valuation* - maximum bond valuation of investments for a specific investor
- *avg_valuation* - average bond valuation of investments for a specific investor, rounded to two decimal places

Sort the result in *ascending order by email*.

 

**Note:**

- Only investors with an average bond valuation greater than 100,000 should be included in the result.
- All min_valuation, max_valuation, and avg_valuation amounts should have two places after the decimal, e.g., 10 is shown as 10.00.


## Schema
### investors
<table class="database-table">
	<tbody>
		<tr>
			<th align="left">name</th>
			<th align="left">type</th>
			<th align="left">constraint</th>
			<th align="left">description</th>
		</tr>
		<tr>
			<td align="left">id</td>
			<td align="left">INT</td>
			<td align="left">PRIMARY KEY</td>
			<td align="left">Investor ID</td>
		</tr>
		<tr>
			<td align="left">email</td>
			<td align="left">VARCHAR(255)</td>
			<td align="left">UNIQUE</td>
			<td align="left">Email address</td>
		</tr>
	</tbody>
</table>

### investments
<table>
	<tbody>
		<tr>
			<th align="left">name</th>
			<th align="left">type</th>
			<th align="left">constraint</th>
			<th align="left">description</th>
		</tr>
		<tr>
			<td align="left">investor_id</td>
			<td align="left">INT</td>
			<td align="left">FOREIGN KEY(investor_id =&gt; investors.id)</td>
			<td align="left">Reference to the investor</td>
		</tr>
		<tr>
			<td align="left">valuation</td>
			<td align="left">DECIMAL(8,2)</td>
			<td align="left">&nbsp;</td>
			<td align="left">Bond's market value</td>
		</tr>
	</tbody>
</table>


## Sample input

### investors

<table>
	<tbody>
		<tr>
			<th align="left">id</th>
			<th align="left">email</th>
		</tr>
		<tr>
			<td align="left">1</td>
			<td align="left"><a href="mailto:gcordel0@t.co">gcordel0@t.co</a></td>
		</tr>
		<tr>
			<td align="left">3</td>
			<td align="left"><a href="mailto:mpolycote2@is.gd">mpolycote2@is.gd</a></td>
		</tr>
		<tr>
			<td align="left">2</td>
			<td align="left"><a href="mailto:tdye1@edublogs.org">tdye1@edublogs.org</a></td>
		</tr>
	</tbody>
</table>

### investments

<table class="database-table" style="font-size:16px;">
	<tbody>
		<tr>
			<th align="left">investor_id</th>
			<th align="left">valuation</th>
		</tr>
		<tr>
			<td align="left">1</td>
			<td align="left">136397.66</td>
		</tr>
		<tr>
			<td align="left">1</td>
			<td align="left">100088.28</td>
		</tr>
		<tr>
			<td align="left">1</td>
			<td align="left">71534.17</td>
		</tr>
		<tr>
			<td align="left">1</td>
			<td align="left">117418.73</td>
		</tr>
		<tr>
			<td align="left">1</td>
			<td align="left">30466.29</td>
		</tr>
		<tr>
			<td align="left">1</td>
			<td align="left">164102.40</td>
		</tr>
		<tr>
			<td align="left">2</td>
			<td align="left">112209.07</td>
		</tr>
		<tr>
			<td align="left">2</td>
			<td align="left">57327.83</td>
		</tr>
		<tr>
			<td align="left">2</td>
			<td align="left">89859.84</td>
		</tr>
		<tr>
			<td align="left">2</td>
			<td align="left">45081.15</td>
		</tr>
		<tr>
			<td align="left">3</td>
			<td align="left">66453.81</td>
		</tr>
		<tr>
			<td align="left">3</td>
			<td align="left">64627.86</td>
		</tr>
		<tr>
			<td align="left">3</td>
			<td align="left">156862.58</td>
		</tr>
		<tr>
			<td align="left">3</td>
			<td align="left">175030.76</td>
		</tr>
		<tr>
			<td align="left">3</td>
			<td align="left">61761.07</td>
		</tr>
		<tr>
			<td align="left">3</td>
			<td align="left">31505.41</td>
		</tr>
		<tr>
			<td align="left">3</td>
			<td align="left">150005.29</td>
		</tr>
		<tr>
			<td align="left">3</td>
			<td align="left">126345.36</td>
		</tr>
		<tr>
			<td align="left">3</td>
			<td align="left">151254.58</td>
		</tr>
		<tr>
			<td align="left">3</td>
			<td align="left">153121.53</td>
		</tr>
	</tbody>
</table>

## Sample output

<table class="database-table">
	<tbody>
		<tr>
			<th align="left">email</th>
			<th align="left">investments</th>
			<th align="left">min_valuation</th>
			<th align="left">max_valuation</th>
			<th align="left">avg_valuation</th>
		</tr>
		<tr>
			<td align="left"><a href="mailto:gcordel0@t.co">gcordel0@t.co</a></td>
			<td align="left">6</td>
			<td align="left">30466.29</td>
			<td align="left">164102.40</td>
			<td align="left">103334.59</td>
		</tr>
		<tr>
			<td align="left"><a href="mailto:mpolycote2@is.gd">mpolycote2@is.gd</a></td>
			<td align="left">10</td>
			<td align="left">31505.41</td>
			<td align="left">175030.76</td>
			<td align="left">113696.83</td>
		</tr>
	</tbody>
</table>

