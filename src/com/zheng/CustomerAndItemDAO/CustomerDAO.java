package com.zheng.CustomerAndItemDAO;

import java.sql.SQLException;

public class CustomerDAO extends AbsConnectionDB implements CustomerDAOI{

	private Customer c;
	
	/*
	 * Constructor creates a new Customer object
	 * Constructor Injection 
	 */
	public CustomerDAO() {
		this.c = new Customer();
	}
	
	@Override
	public Customer getCustomerById(int id) {
		try {
			connectDB();
			ps = conn.prepareStatement(CustomerSQL.GET_CUSTOMER_BY_ID.getQuery());
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				c.setId(rs.getInt(1));
				c.setEmail(rs.getString(2));
				c.setFname(rs.getString(3));
				c.setLname(rs.getString(4));
			}
			System.out.println("The following customer is found");
			closeConnection();
			return c;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addCustomer(Customer c) {
		try {
			connectDB();
			ps = conn.prepareStatement(CustomerSQL.ADD_CUSTOMER.getQuery());
			ps.setInt(1, c.getId());
			ps.setString(2, c.getEmail());
			ps.setString(3, c.getFname());
			ps.setString(4, c.getLname());
			ps.executeUpdate();
			System.out.println (c + " is added to the database.");
			closeConnection();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Customer removeCustomerById(int id) {
		try {
			connectDB();
			ps = conn.prepareStatement(CustomerSQL.REMOVE_CUSTOMER_BY_ID.getQuery());
			ps.setInt(1, id);
			rs = ps.executeQuery();
			c = new Customer();
			while(rs.next()) {
				c.setId(rs.getInt(1));
				c.setEmail(rs.getString(2));
				c.setFname(rs.getString(3));
				c.setLname(rs.getString(4));
				System.out.println("The following customer is deleted from the databse: \n" + c.toString());
			}
			closeConnection();
			return c;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
