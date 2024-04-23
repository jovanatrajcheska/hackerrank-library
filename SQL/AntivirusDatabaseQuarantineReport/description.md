# Antivirus Database Quarantine Report

A prominent cyber-security company aims to generate a report detailing quarantined URLs. This report should list URL domains, their associated threat types, the total number of times they have been quarantined, and the total number of users affected by each threat from a domain.

 

The result should have the following columns: ***domain_name | threat_type | total_occurrences | total_users_affected***.

- **domain_name** - the website's domain (e.g., example.com)
- **threat_type** - the type of threat identified (e.g., Malware, Phishing)
- **total_occurrences** - the number of times this domain was quarantined for the specific threat
- **total_users_affected** - the number of users affected by each threat from the domain
 

The result should be sorted in ***descending order by total_users_affected***, then in ***ascending order by domain_name***.

**Note:**

- Only URLs with a status of "Quarantined" should be included in the report.

## Schema

### threat_types

<table>
    <tr>
        <td>name</td>
        <td>type</td>
        <td>constraint</td>
        <td>description</td>
    </tr>
    <tr>
        <td>id			</td>
        <td>INT</td>
        <td>PRIMARY KEY</td>
        <td>Threat type ID</td>
    </tr>
    <tr>
        <td>threat_type</td>
        <td>VARCHAR(255)</td>
        <td></td>
        <td>Type of threat (e.g., Malware, Phishing)</td>
    </tr>
</table>

### quarantine_urls
<table>
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
			<td align="left">URL ID</td>
		</tr>
		<tr>
			<td align="left">threat_id</td>
			<td align="left">INT</td>
			<td align="left">FOREIGN KEY(threat_id =&gt; threat_types.id)</td>
			<td align="left">Reference to the type of threat</td>
		</tr>
		<tr>
			<td align="left">domain_name</td>
			<td align="left">VARCHAR(255)</td>
			<td align="left">&nbsp;</td>
			<td align="left">Domain name of the quarantined URL</td>
		</tr>
		<tr>
			<td align="left">status</td>
			<td align="left">ENUM('Quarantined','Safe','Deleted')</td>
			<td align="left">&nbsp;</td>
			<td align="left">URL status in the system</td>
		</tr>
		<tr>
			<td align="left">users_affected</td>
			<td align="left">INT</td>
			<td align="left">&nbsp;</td>
			<td align="left">Number of users affected by the quarantined URL</td>
		</tr>
	</tbody>
</table>

## Sample input
### threat_types
<table class="database-table" style="font-size:16px;">
	<tbody>
		<tr>
			<th align="left">id</th>
			<th align="left">threat_type</th>
		</tr>
		<tr>
			<td align="left">1</td>
			<td align="left">Phishing</td>
		</tr>
		<tr>
			<td align="left">2</td>
			<td align="left">Rootkit</td>
		</tr>
		<tr>
			<td align="left">3</td>
			<td align="left">Malware</td>
		</tr>
	</tbody>
</table>


### quarantine_urls
<table class="database-table" style="font-size:16px;">
	<tbody>
		<tr>
			<th align="left">id</th>
			<th align="left">threat_id</th>
			<th align="left">domain_name</th>
			<th align="left">status</th>
			<th align="left">users_affected</th>
		</tr>
		<tr>
			<td align="left">17</td>
			<td align="left">1</td>
			<td align="left">amazon.com</td>
			<td align="left">Quarantined</td>
			<td align="left">862</td>
		</tr>
		<tr>
			<td align="left">16</td>
			<td align="left">1</td>
			<td align="left">google.com</td>
			<td align="left">Quarantined</td>
			<td align="left">63</td>
		</tr>
		<tr>
			<td align="left">9</td>
			<td align="left">1</td>
			<td align="left">amazon.com</td>
			<td align="left">Quarantined</td>
			<td align="left">41</td>
		</tr>
		<tr>
			<td align="left">18</td>
			<td align="left">2</td>
			<td align="left">amazon.com</td>
			<td align="left">Quarantined</td>
			<td align="left">149</td>
		</tr>
		<tr>
			<td align="left">12</td>
			<td align="left">2</td>
			<td align="left">yahoo.com</td>
			<td align="left">Quarantined</td>
			<td align="left">967</td>
		</tr>
		<tr>
			<td align="left">4</td>
			<td align="left">3</td>
			<td align="left">amazon.com</td>
			<td align="left">Quarantined</td>
			<td align="left">377</td>
		</tr>
		<tr>
			<td align="left">10</td>
			<td align="left">3</td>
			<td align="left">yahoo.com</td>
			<td align="left">Quarantined</td>
			<td align="left">721</td>
		</tr>
		<tr>
			<td align="left">11</td>
			<td align="left">1</td>
			<td align="left">yahoo.com</td>
			<td align="left">Deleted</td>
			<td align="left">551</td>
		</tr>
		<tr>
			<td align="left">20</td>
			<td align="left">1</td>
			<td align="left">amazon.com</td>
			<td align="left">Safe</td>
			<td align="left">407</td>
		</tr>
		<tr>
			<td align="left">19</td>
			<td align="left">1</td>
			<td align="left">amazon.com</td>
			<td align="left">Deleted</td>
			<td align="left">665</td>
		</tr>
		<tr>
			<td align="left">15</td>
			<td align="left">1</td>
			<td align="left">facebook.com</td>
			<td align="left">Safe</td>
			<td align="left">52</td>
		</tr>
		<tr>
			<td align="left">2</td>
			<td align="left">1</td>
			<td align="left">google.com</td>
			<td align="left">Safe</td>
			<td align="left">309</td>
		</tr>
		<tr>
			<td align="left">1</td>
			<td align="left">2</td>
			<td align="left">twitter.com</td>
			<td align="left">Safe</td>
			<td align="left">562</td>
		</tr>
		<tr>
			<td align="left">13</td>
			<td align="left">2</td>
			<td align="left">facebook.com</td>
			<td align="left">Safe</td>
			<td align="left">208</td>
		</tr>
		<tr>
			<td align="left">14</td>
			<td align="left">2</td>
			<td align="left">google.com</td>
			<td align="left">Deleted</td>
			<td align="left">731</td>
		</tr>
		<tr>
			<td align="left">8</td>
			<td align="left">2</td>
			<td align="left">twitter.com</td>
			<td align="left">Safe</td>
			<td align="left">924</td>
		</tr>
		<tr>
			<td align="left">7</td>
			<td align="left">2</td>
			<td align="left">twitter.com</td>
			<td align="left">Safe</td>
			<td align="left">982</td>
		</tr>
		<tr>
			<td align="left">6</td>
			<td align="left">2</td>
			<td align="left">google.com</td>
			<td align="left">Deleted</td>
			<td align="left">864</td>
		</tr>
		<tr>
			<td align="left">3</td>
			<td align="left">2</td>
			<td align="left">facebook.com</td>
			<td align="left">Safe</td>
			<td align="left">136</td>
		</tr>
		<tr>
			<td align="left">5</td>
			<td align="left">3</td>
			<td align="left">yahoo.com</td>
			<td align="left">Safe</td>
			<td align="left">949</td>
		</tr>
	</tbody>
</table>

## Sample output

<table class="database-table">
	<tbody>
		<tr>
			<th align="left">domain_name</th>
			<th align="left">threat_type</th>
			<th align="left">total_occurrences</th>
			<th align="left">total_users_affected</th>
		</tr>
		<tr>
			<td align="left">yahoo.com</td>
			<td align="left">Rootkit</td>
			<td align="left">1</td>
			<td align="left">967</td>
		</tr>
		<tr>
			<td align="left">amazon.com</td>
			<td align="left">Phishing</td>
			<td align="left">2</td>
			<td align="left">903</td>
		</tr>
		<tr>
			<td align="left">yahoo.com</td>
			<td align="left">Malware</td>
			<td align="left">1</td>
			<td align="left">721</td>
		</tr>
		<tr>
			<td align="left">amazon.com</td>
			<td align="left">Malware</td>
			<td align="left">1</td>
			<td align="left">377</td>
		</tr>
		<tr>
			<td align="left">amazon.com</td>
			<td align="left">Rootkit</td>
			<td align="left">1</td>
			<td align="left">149</td>
		</tr>
		<tr>
			<td align="left">google.com</td>
			<td align="left">Phishing</td>
			<td align="left">1</td>
			<td align="left">63</td>
		</tr>
	</tbody>
</table>


