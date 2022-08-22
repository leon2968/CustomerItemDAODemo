# CustomerItemDAODemo
A DAO demo

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
