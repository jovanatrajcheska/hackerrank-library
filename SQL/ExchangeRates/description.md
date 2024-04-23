# Exchange Rates

In exchange for a transaction fee, a stock exchange lets people trade stocks online. For every buy order they charge 0.1% of the order amount, and for every sell order they charge 0.15%. Calculate the fees paid by customers for their orders.

 

**Fetch the name of the customer and their total fees paid. Order the result by customer names and round the fees to 2 decimal places.**

 

To round the data:

In MySQL, Oracle, or DB2, use ROUND(val, 2).

In MS SQL use FORMAT(val, 'N2').

### Schema

### CUSTOMERS

<table>
    <tr>
        <td>Name</td>
        <td>Type</td>
        <td>Description</td>
    </tr>
    <tr>
        <td>id</td>
        <td>int</td>
        <td>Unique id of the customer.</td>
    </tr>
    <tr>
        <td>customer_name</td>
        <td>varchar(30)</td>
        <td>Name of the customer.</td>
    </tr>
</table>

### ORDERS
<table>
    <tr>
        <td>Name</td>
        <td>Type</td>
        <td>Description</td>
    </tr>
    <tr>
        <td>order_id</td>
        <td>int</td>
        <td>Unique id of the order.</td>
    </tr>
    <tr>
        <td>customer_id</td>
        <td>int</td>
        <td>Id of the customer referring to the customers table.</td>
    </tr>
    <tr>
        <td>order_type</td>
        <td>varchar(5)</td>
        <td>Type of order placed (Buy or Sell).</td>
    </tr>
    <tr>
        <td>order_amount</td>
        <td>decimal(18,2)</td>
        <td>Amount of the order.</td>
    </tr>
</table>

### Sample Data Tables

### Customers

<table>
    <tr>
        <td>id</td>
        <td>customer_name</td>
    </tr>
    <tr>
        <td>401</td>
        <td>Hubert Keesler</td>
    </tr>
    <tr>
        <td>402</td>
        <td>Devin Vert</td>
    </tr>
    <tr>
        <td>403</td>
        <td>Lashawna Bowerman</td>
    </tr>
    <tr>
        <td>404</td>
        <td>Brigid Wellborn</td>
    </tr>
    <tr>
        <td>405</td>
        <td>Josefine Perl</td>
    </tr>
</table>

### Orders

<table>
    <tr>
        <td>order_id</td>
        <td>customer_id</td>
        <td>order_type</td>
        <td>order_amount</td>
    </tr>
    <tr>
        <td>4361</td> 			
        <td>401</td>
        <td>Sell</td>
        <td>912.77</td>
    </tr>
    <tr>
        <td>3478</td>			
        <td>405</td>
        <td>Sell</td>
        <td>741.69</td>
    </tr>
    <tr>
        <td>7292</td> 			
        <td>405</td>
        <td>Sell</td>
        <td>436.05</td>
    </tr>
    <tr>
        <td>5833</td>			
        <td>405</td>
        <td>Sell</td>
        <td>231.30</td>
    </tr>
    <tr>
        <td>3472</td> 			
        <td>402</td>
        <td>Buy</td>
        <td>950.92</td>
    </tr>
    <tr>
        <td>4472</td>			
        <td>401</td>
        <td>Sell</td>
        <td>367.70</td>
    </tr>
    <tr>
        <td>2624</td>			
        <td>404</td>
        <td>Buy</td>
        <td>218.15</td>
    </tr>
    <tr>
        <td>7198</td>			
        <td>405</td>
        <td>Buy</td>
        <td>797.29</td>
    </tr>
    <tr>
        <td>7660</td>			
        <td>403</td>
        <td>Buy</td>
        <td>131.18</td>
    </tr>
    <tr>
        <td>5192</td>			
        <td>401</td>
        <td>Buy</td>
        <td>362.44</td>
    </tr>
    <tr>
        <td>5260</td>			
        <td>402</td>
        <td>Buy</td>
        <td>636.26</td>
    </tr>
    <tr>
        <td>2726</td>			
        <td>403</td>
        <td>Sell</td>
        <td>138.15</td>
    </tr>
    <tr>
        <td>6594</td>			
        <td>401</td>
        <td>Buy</td>
        <td>234.51</td>
    </tr>
    <tr>
        <td>4657</td>			
        <td>404</td>
        <td>Buy</td>
        <td>427.30</td>
    </tr>
    <tr>
        <td>9744</td>			
        <td>402</td>
        <td>Sell</td>
        <td>623.36</td>
    </tr>
</table>

### OUTPUT

<table>
    <tr>
        <td>customer_name</td>
        <td>total_fees</td>
    </tr>
     <tr>
        <td>Brigid Wellborn</td>	
        <td>0.65</td>
    </tr>
     <tr>
        <td>Devin Vert</td>	
        <td>2.52</td>
    </tr>
     <tr>
        <td>Hubert Keesler</td>	
        <td>2.52</td>
    </tr>
     <tr>
        <td>Josefine Perl</td>	
        <td>2.91</td>
    </tr>
     <tr>
        <td>Lashawna Bowerman</td>	
        <td>0.34</td>
    </tr>
</table>

### Explanation

For Devin Vert, total amount of buy orders was 1587.18 and total amount of buy orders was 623.36. Fee applied on buy and sell orders will be 1.58718 and 0.93504 with rate of 0.1% and 0.15% respectively. Total fee would be 2.52222 after rounding final fee would be 2.52.