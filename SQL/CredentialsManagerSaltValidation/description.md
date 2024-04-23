# Credentials Manager Salt Validation

As part of a credential management platform security audit, find the number of active encryptions where the salt string used in the encryption process is too short.

 

The result should have the following columns: ***mac | salts***.

- mac - account MAC address
- salts - total number of encryption salts that are too short
 

*The result should be sorted in ascending order by mac.*

 

**Note:**

- A salt string is too short if its length is less than 8.
- Only active encryptions should be included in the result.

## Schema

### accounts

<table>
    <tr>
        <td>name</td>
        <td>type</td>
        <td>constraint</td>
        <td>description</td>
    </tr>
    <tr>
        <td>id</td>
        <td>INT</td>
        <td>PRIMARY KEY</td>
        <td>Account ID</td>
    </tr>
    <tr>
        <td>mac</td>
        <td>VARCHAR(255)</td>
        <td></td>
        <td>MAC address</td>
    </tr>
</table>

### encryptions

<table>
    <tr>
        <td>name</td>
        <td>type</td>
        <td>constraint</td>
        <td>description</td>
    </tr>
    <tr>
        <td>account_id</td>
        <td>INT</td>
        <td>FOREIGN KEY (account_id => accounts.id)</td>
        <td>Account ID</td>
    </tr>
    <tr>
        <td>salt</td>
        <td>VARCHAR(255)</td>
        <td></td>
        <td>Salt</td>
    </tr>
    <tr>
        <td>is_active</td>
        <td>BOOLEAN</td>
        <td></td>
        <td>Activity flag</td>
    </tr>
</table>

## Sample input

### accounts
<table>
    <tr>
        <td>id</td>
        <td>mac</td>
    </tr>
     <tr>
        <td>1	</td>
        <td>0C-6B-27-2E-E0-49</td>
    </tr>
     <tr>
        <td>2	</td>
        <td>01-51-06-EC-7C-FB</td>
    </tr>
     <tr>
        <td>3	</td>
        <td>7F-43-FD-22-2E-94</td>
    </tr>
</table>


### encryptions

<table>
    <tr>
        <td>account_id		</td>
        <td>salt</td>
        <td>is_active</td>
    </tr>
    <tr>
        <td>1		</td>
        <td>cc20ad47815</td>
        <td>0</td>
    </tr>
    <tr>
        <td>1		</td>
        <td>eb4a0bb0</td>
        <td>0</td>
    </tr>
    <tr>
        <td>1		</td>
        <td>3be6c4d2a1644b</td>
        <td>0</td>
    </tr>
    <tr>
        <td>1		</td>
        <td>339c8ee8856c28</td>
        <td>0</td>
    </tr>
    <tr>
        <td>1		</td>
        <td>27d2075</td>
        <td>0</td>
    </tr>
    <tr>
        <td>1		</td>
        <td>960c872e5dc</td>
        <td>0</td>
    </tr>
    <tr>
        <td>1		</td>
        <td>531ca7f4d</td>
        <td>1</td>
    </tr>
    <tr>
        <td>1		</td>
        <td>4101965</td>
        <td>1</td>
    </tr>
    <tr>
        <td>1		</td>
        <td>f2707</td>
        <td>1</td>
    </tr>
    <tr>
        <td>1		</td>
        <td>7a1c7adbe686e</td>
        <td>1</td>
    </tr>
    <tr>
        <td>2		</td>
        <td>5d98604bbfb</td>
        <td>0</td>
    </tr>
    <tr>
        <td>2		</td>
        <td>f617f</td>
        <td>0</td>
    </tr>
    <tr>
        <td>2		</td>
        <td>013c49b42bee9</td>
        <td>1</td>
    </tr>
    <tr>
        <td>3	</td>
        <td>599f71b43c9	</td>
        <td>0</td>
    </tr>
    <tr>
        <td>3		</td>
        <td>ea7b576a4b</td>
        <td>0</td>
    </tr>
    <tr>
        <td>3	</td>
        <td>99a57e	</td>
        <td>1</td>
    </tr>
    <tr>
        <td>3		</td>
        <td>be2d70bb850</td>
        <td>1</td>
    </tr>
    <tr>
        <td>3		</td>
        <td>d1b48f27ecdba</td>
        <td>1</td>
    </tr>
    <tr>
        <td>3		</td>
        <td>0fd088f68</td>
        <td>1</td>
    </tr>
    <tr>
        <td>3		</td>
        <td>1bc22ee</td>
        <td>1</td>
    </tr>
</table>

## Sample output

<table>
    <tr>
        <td>mac</td>
        <td>salts</td>
    </tr>
    <tr>
        <td>0C-6B-27-2E-E0-49</td>
        <td>2</td>
    </tr>
    <tr>
        <td>7F-43-FD-22-2E-94	</td>
        <td>2</td>
    </tr>
</table>