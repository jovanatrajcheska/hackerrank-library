# Software Protocols Report

As part of HackerSniff's DPI (Deep Packet Inspection) software analytics, a team needs a list of all the protocols for which incoming traffic is higher than outgoing.

 

The result should be in the following format: ***protocol, traffic_in, traffic_out***.

- Results should be sorted ascending by protocol.


## Input format

<table>
    <tr>
        <td>name</td>
        <td>type</td>
        <td>description</td>
    </tr>
    <tr>
        <td>client</td>
        <td>VARCHAR(17)</td>
        <td>Client MAC address</td>
    </tr>
    <tr>
        <td>protocol</td>
        <td>VARCHAR(64)</td>
        <td>Protocol name</td>
    </tr>
    <tr>
        <td>traffic_in</td>
        <td>INT</td>
        <td>Traffic in</td>
    </tr>
    <tr>
        <td>traffic_out	</td>
        <td>INT</td>
        <td>Traffic out</td>
    </tr>
</table>

## Sample input
<table>
    <tr>
        <td>client</td>
        <td>protocol</td>
        <td>traffic_in</td>
        <td>traffic_out</td>
    </tr>
    <tr>
        <td>02-E1-80-76-EC-4B			</td>
        <td>BGP</td>
        <td>0</td>
        <td>234737</td>
    </tr>
    <tr>
        <td>43-15-AA-26-0F-A4</td>
        <td>BGP</td>
        <td>402860</td>
        <td>606565</td>
    </tr>
    <tr>
        <td>90-E7-B0-14-7E-8C</td>
        <td>BGP</td>
        <td>840772</td>
        <td>988197</td>
    </tr>
    <tr>
        <td>FB-60-23-C1-5E-D6</td>
        <td>DNS</td>
        <td>341155</td>
        <td>356569</td>
    </tr>
    <tr>
        <td>4D-6D-7F-62-F4-00</td>
        <td>FTP</td>
        <td>8346</td>
        <td>413322</td>
    </tr>
    <tr>
        <td>09-89-26-46-C4-21</td>
        <td>FTP</td>
        <td>210656</td>
        <td>470568</td>
    </tr>
    <tr>
        <td>B1-6A-35-2F-1A-C2</td>
        <td>FTP</td>
        <td>897097</td>
        <td>161083</td>
    </tr>
    <tr>
        <td>0C-CA-68-2D-4B-F5</td>
        <td>HTTP</td>
        <td>918793</td>
        <td>550403</td>
    </tr>
    <tr>
        <td>A4-C6-52-10-2E-9C</td>
        <td>HTTPS</td>
        <td>520856</td>
        <td>185387</td>
    </tr>
    <tr>
        <td>95-B8-7D-78-06-42</td>
        <td>POP</td>
        <td>150880</td>
        <td>423073</td>
    </tr>
    <tr>
        <td>B9-C1-1B-32-55-95</td>
        <td>POP</td>
        <td>862946</td>
        <td>979544</td>
    </tr>
    <tr>
        <td>14-FD-21-F6-5E-67</td>
        <td>SMTP</td>
        <td>139389</td>
        <td>280646</td>
    </tr>
    <tr>
        <td>70-E1-2D-B1-B2-9B</td>
        <td>SMTP</td>
        <td>163986</td>
        <td>450401</td>
    </tr>
    <tr>
        <td>C6-F1-59-FF-5D-BE</td>
        <td>SMTP</td>
        <td>271295</td>
        <td>878246</td>
    </tr>
    <tr>
        <td>62-01-CF-AD-32-A7</td>
        <td>SMTP</td>
        <td>388933</td>
        <td>81625</td>
    </tr>
    <tr>
        <td>41-80-FB-86-D1-93</td>
        <td>SMTP</td>
        <td>752842</td>
        <td>253981</td>
    </tr>
    <tr>
        <td>93-3F-01-57-5F-4A</td>
        <td>SSH</td>
        <td>496717</td>
        <td>599280</td>
    </tr>
    <tr>
        <td>52-F2-BF-45-84-74</td>
        <td>SSH</td>
        <td>632534</td>
        <td>128765</td>
    </tr>
    <tr>
        <td>87-66-B5-A5-2F-7B</td>
        <td>SSH</td>
        <td>835441</td>
        <td>354950</td>
    </tr>
    <tr>
        <td>CE-FC-80-F3-95-58</td>
        <td>UDP</td>
        <td>903443</td>
        <td>120298</td>
    </tr>
</table>


## Sample output

<table>
    <tr>
        <td>protocol</td>
        <td>traffic_in</td>
        <td>traffic_out</td>
    </tr>
    <tr>
        <td>FTP</td>
        <td>1116099</td>
        <td>1044973</td>
    </tr>
    <tr>
        <td>HTTP</td>
        <td>918793</td>
        <td>550403</td>
    </tr>
    <tr>
        <td>HTTPS</td>
        <td>520856</td>
        <td>185387</td>
    </tr>
    <tr>
        <td>SSH</td>
        <td>1964692</td>
        <td>1082995</td>
    </tr>
    <tr>
        <td>UDP</td>
        <td>903443</td>
        <td>120298</td>
    </tr>
</table>