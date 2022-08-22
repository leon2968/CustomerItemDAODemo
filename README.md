# CustomerItemDAODemo
A DAO demo to show how to apply Obeject Oriented Programming in Java regarding to CRUD operations in a relational Database

### Techstack and Tools
- Java, JDBC API, SQL 
- IntelliJ Idea/Spring Tool Suite, MariaDB

### Create Database Tables:
Customer - id(int), email(varchar2), fname(varchar2), lname(varchar2).

Item - id(int), name(varchar2), price(Number(4,2)).

### Create models for each table.
Customer.java

Item.java

### Create DAOs with the following methods:
CustomerDAO:

getCustomerById(int id) - Returns the customer object for the given id.

addCustomer(Customer c) - Adds a customer with given information.

removeCustomerById(int id) - Removes a customer with the given id.

ItemDAO :

getAllItems() - Returns a list of all item objects in the database.

addItem(Item i) - Adds an item with given information.

removeItemById(int id) - Removes an item with the given id.

### Notes
1. This is for learning purpose only. Feel free to use and test it, but please do not submite the codes as your own work. 
2. There is no interaction between customer and user at this stage. I may or may not implement more features in this program.
