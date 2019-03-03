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

### 2. Explanation

The design pattern that was chosen to represent this design is **Mediator**. This behavioral design patterns fits well because the **_Notifier_** object acts as a mediator between the customer and the waitlist. At any point, the customer does not have to interact with the waitlist directly or vice versa. This promotes loose coupling and development of strong set of rules that both the customer and waitlist objects can interact with.

##### Roles:

- _ConcreteMediator_: The only job of the **_Notifier_** object is to relay messages therefore its role is a _ConcreteMediator_.

- _Colleagues_: The **_Customer_** and  **_Waitlist_** objects are _Colleagues_ since they only communicate through the **_Notifier_** which is a mediator.
