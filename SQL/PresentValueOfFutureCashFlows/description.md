# Present Value of Future Cash Flows

A financial services company needs to price a number of zero-coupon bonds based on a 5% yield. A zero-coupon bond accrues interest until maturity, then the principal and interest are paid at once. Create a query that computes the present value of expected cash flows for each investor using a constant discount rate of 5% per period.

The required output should list all investors with their total number of investments, the sum of the present values of their expected cash flows at maturity, and the average of the present values of the expected cash flows at maturity.

The result should have the following columns: ***email | investment_count | total_present_value | avg_present_value***.

- *email* - investor email
- *investment_count* - total number of investments held by a specific investor
- *total_present_value* - sum of the present values of expected cash flows for a specific investor, rounded to two decimal places
- *avg_present_value* - an average of the present values of the expected cash flows for a specific investor, rounded to two decimal places
 

The results should be sorted in ***ascending order by email***.


**Note:**

- To calculate the present value use the formula: <math xmlns="http://www.w3.org/1998/Math/MathML"> <mrow> <mi>present_value</mi> <mo> = </mo> <mo>(</mo> <mfrac> <mi>expected_flow</mi> <mrow> <msup> <mrow> <mo>(</mo> <mn>1</mn> <mo>+</mo> <mi>discount_rate</mi> <mo>)</mo> </mrow> <mi>periods</mi> </msup> </mrow> </mfrac> <mo>)</mo> </mrow></math>. For example, the expected cash flow is 105 after 1 period. The present value is <math xmlns="http://www.w3.org/1998/Math/MathML"> <mrow> <mi>present_value</mi> <mo> = </mo> <mo>(</mo> <mfrac> <mi>105</mi> <mrow> <msup> <mrow> <mo>(</mo> <mn>1</mn> <mo>+</mo> <mi>0.05</mi> <mo>)</mo> </mrow> <mi>1</mi> </msup> </mrow> </mfrac> <mo>)</mo> </mrow> <mo>=</mo> <mn>100.</mn> </math>

- Use a ``discount_rate`` of 0.05 and assume each cash flow has a different period ranging from 1 to the number of cash flows per investor.
- Trailing zeros after the decimal should be omitted.
- Only investors who have a sum of present values greater than 1,000,000 should be included in the result.

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


### cash_flows
<table class="database-table">
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
			<td align="left">expected_flow</td>
			<td align="left">DECIMAL(8,2)</td>
			<td align="left">&nbsp;</td>
			<td align="left">Expected cash flow amount</td>
		</tr>
		<tr>
			<td align="left">cash_flow_period</td>
			<td align="left">INT</td>
			<td align="left">&nbsp;</td>
			<td align="left">The period of the cash flow</td>
		</tr>
	</tbody>
</table>


## Sample input
### investors
<table class="database-table" style="font-size:16px;">
	<tbody>
		<tr>
			<th align="left">id</th>
			<th align="left">email</th>
		</tr>
		<tr>
			<td align="left">1</td>
			<td align="left"><a href="mailto:bdunkerley0@ustream.tv">bdunkerley0@ustream.tv</a></td>
		</tr>
		<tr>
			<td align="left">2</td>
			<td align="left"><a href="mailto:amaclaine1@oracle.com">amaclaine1@oracle.com</a></td>
		</tr>
		<tr>
			<td align="left">3</td>
			<td align="left"><a href="mailto:mhenstone2@csmonitor.com">mhenstone2@csmonitor.com</a></td>
		</tr>
	</tbody>
</table>

### cash_flows
<table class="database-table" style="font-size:16px;">
	<tbody>
		<tr>
			<th align="left">investor_id</th>
			<th align="left">expected_flow</th>
			<th align="left">cash_flow_period</th>
		</tr>
		<tr>
			<td align="left">1</td>
			<td align="left">467424.93</td>
			<td align="left">4</td>
		</tr>
		<tr>
			<td align="left">1</td>
			<td align="left">473197.72</td>
			<td align="left">2</td>
		</tr>
		<tr>
			<td align="left">1</td>
			<td align="left">325032.12</td>
			<td align="left">3</td>
		</tr>
		<tr>
			<td align="left">1</td>
			<td align="left">384188.89</td>
			<td align="left">1</td>
		</tr>
		<tr>
			<td align="left">1</td>
			<td align="left">89190.85</td>
			<td align="left">3</td>
		</tr>
		<tr>
			<td align="left">1</td>
			<td align="left">306760.94</td>
			<td align="left">2</td>
		</tr>
		<tr>
			<td align="left">1</td>
			<td align="left">96429.87</td>
			<td align="left">4</td>
		</tr>
		<tr>
			<td align="left">1</td>
			<td align="left">67530.35</td>
			<td align="left">5</td>
		</tr>
		<tr>
			<td align="left">1</td>
			<td align="left">173542.87</td>
			<td align="left">4</td>
		</tr>
		<tr>
			<td align="left">1</td>
			<td align="left">230858.63</td>
			<td align="left">2</td>
		</tr>
		<tr>
			<td align="left">2</td>
			<td align="left">225836.56</td>
			<td align="left">5</td>
		</tr>
		<tr>
			<td align="left">2</td>
			<td align="left">492465.14</td>
			<td align="left">3</td>
		</tr>
		<tr>
			<td align="left">2</td>
			<td align="left">242523.52</td>
			<td align="left">2</td>
		</tr>
		<tr>
			<td align="left">2</td>
			<td align="left">75880.55</td>
			<td align="left">2</td>
		</tr>
		<tr>
			<td align="left">2</td>
			<td align="left">436683.99</td>
			<td align="left">4</td>
		</tr>
		<tr>
			<td align="left">3</td>
			<td align="left">120612.96</td>
			<td align="left">4</td>
		</tr>
		<tr>
			<td align="left">3</td>
			<td align="left">249090.59</td>
			<td align="left">3</td>
		</tr>
		<tr>
			<td align="left">3</td>
			<td align="left">163647.03</td>
			<td align="left">1</td>
		</tr>
		<tr>
			<td align="left">3</td>
			<td align="left">69478.04</td>
			<td align="left">5</td>
		</tr>
		<tr>
			<td align="left">3</td>
			<td align="left">419617.32</td>
			<td align="left">2</td>
		</tr>
	</tbody>
</table>

## Sample output

<table class="database-table">
	<tbody>
		<tr>
			<th align="left">email</th>
			<th align="left">investment_count</th>
			<th align="left">total_present_value</th>
			<th align="left">avg_present_value</th>
		</tr>
		<tr>
			<td align="left"><a href="mailto:amaclaine1@oracle.com">amaclaine1@oracle.com</a></td>
			<td align="left">5</td>
			<td align="left">1250421.63</td>
			<td align="left">250084.33</td>
		</tr>
		<tr>
			<td align="left"><a href="mailto:bdunkerley0@ustream.tv">bdunkerley0@ustream.tv</a></td>
			<td align="left">10</td>
			<td align="left">2300127.32</td>
			<td align="left">230012.73</td>
		</tr>
	</tbody>
</table>