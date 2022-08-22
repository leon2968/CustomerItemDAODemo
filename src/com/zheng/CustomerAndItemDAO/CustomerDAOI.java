package com.zheng.CustomerAndItemDAO;

public interface CustomerDAOI {
	
	enum CustomerSQL {
		GET_CUSTOMER_BY_ID("SELECT * FROM customer WHERE id = ?"),
		ADD_CUSTOMER("INSERT INTO customer "
					+ "VALUES(?,?,?,?)"),
		REMOVE_CUSTOMER_BY_ID("DELETE FROM customer WHERE id = ?");

		private final String query;
		
		CustomerSQL(String query) {
			this.query = query;
		}
		
		public String getQuery() {
			return query;
		}
	}
	
	/*
	 * Returns the customer object for the given id.
	 */
	public Customer getCustomerById(int id);
	
	/*
	 * Adds a customer with given information.
	 */
	public boolean addCustomer(Customer c);
	
	/*
	 * Removes a customer with the given id.
	 */
	public Customer removeCustomerById(int id);

}
