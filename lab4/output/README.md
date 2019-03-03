# CMPE 202- Lab #4 - Din Tai Fung Design Patterns

### 1. CRC Cards:

#### Customer
| Responsibility        | Collaborator           |
| ------------- |:-------------:|
|Provide name, phone number, party size| Waitlist|
|Receives message about waitlist confirmation |Notifier|
|Responds to message requiring confirmation or intend to leave|  Notifier|


#### Waitlist
| Responsibility        | Collaborator         |
| ------------- |:-------------:|
|Check if a free table is available|  |
|Notify customer that they are on the waitlist| Notifier
|Maintain an ordered list of customers based on the order they signed up|       |
|Find and notify the customer than has signed up the earliest whose party can be accommodated by the table that is open|      Notifier |
|Update the ordered list based on the the customer's response |Notifier|


#### Notifier
| Responsibility        | Collaborator         |
| ------------- |:-------------:|
|Receive customer information to send notification|Waitlist|
|Notify customer regarding entry on to waitlist|      Customer |
|Notify customer regarding available accommodation | Customer |
|Notify waitlist of a customer's if they want to stop, leave, or confirm|Waitlist|
