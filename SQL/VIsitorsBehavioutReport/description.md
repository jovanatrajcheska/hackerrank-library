# Visitors Behavior Report

You are working on developing visitor tracking software and need to get the total number of purchase events in May 2022. A purchase event has "buy" in the type field.

 

The result should have the following columns: **purchases**.

- *purchases* - the total number of events of the "buy" type
 

**Note:**

- Only events of the type "buy" should be included in the report.
- Only events that occurred in May 2022 should be included in the report.


## Schema
### EVENTS
<table>
    <tr>
        <td>name</td>
        <td>type</td>
        <td>description</td>
    </tr>
    <tr>
        <td>dt</td>
        <td>VARCHAR(19)	</td>
        <td>Event timestamp</td>
    </tr>
    <tr>
        <td>type</td>
        <td>VARCHAR(64)	</td>
        <td>Event type</td>
    </tr>
</table>

## Sample Input

### EVENTS

<table>
    <tr>
        <td>dt</td>
        <td>type</td>
    </tr>
    <tr>
        <td>2022-04-04 03:36:00</td>	
        <td>buy</td>
    </tr>
    <tr>
        <td>2022-04-21 07:05:09</td>	
        <td>buy</td>
    </tr>
    <tr>
        <td>2022-04-02 11:34:24</td>	
        <td>sell</td>
    </tr>
    <tr>
        <td>2022-05-27 16:12:50</td>	
        <td>buy</td>
    </tr>
    <tr>
        <td>2022-05-20 09:09:07</td>	
        <td>buy</td>
    </tr>
    <tr>
        <td>2022-05-22 09:06:37</td>	
        <td>buy</td>
    </tr>
    <tr>
        <td>2022-05-31 07:49:36</td>	
        <td>buy</td>
    </tr>
    <tr>
        <td>2022-05-14 22:29:10</td>	
        <td>buy</td>
    </tr>
    <tr>
        <td>2022-05-13 15:00:54</td>	
        <td>sell</td>
    </tr>
    <tr>
        <td>2022-05-24 15:40:54</td>	
        <td>sell</td>
    </tr>
    <tr>
        <td>2022-05-13 01:20:05</td>	
        <td>sell</td>
    </tr>
    <tr>
        <td>2022-05-16 07:07:44</td>	
        <td>sell</td>
    </tr>
    <tr>
        <td>2022-05-01 16:57:00</td>	
        <td>sell</td>
    </tr>
    <tr>
        <td>2022-06-02 09:42:02</td>	
        <td>buy</td>
    </tr>
    <tr>
        <td>2022-06-01 06:34:59</td>	
        <td>buy</td>
    </tr>
    <tr>
        <td>2022-06-06 17:14:47</td>	
        <td>buy</td>
    </tr>
    <tr>
        <td>2022-06-05 13:37:23</td>	
        <td>buy</td>
    </tr>
    <tr>
        <td>2022-06-17 19:10:13</td>	
        <td>buy</td>
    </tr>
    <tr>
        <td>2022-06-15 21:40:13</td>	
        <td>sell</td>
    </tr>
    <tr>
        <td>2022-06-11 12:26:43</td>	
        <td>sell</td>
    </tr>
</table>

## Sample output

<table>
    <tr>
        <td>purchases</td>
    </tr>
    <tr>
        <td>5</td>
    </tr>
</table>