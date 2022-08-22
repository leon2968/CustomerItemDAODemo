package com.zheng.CustomerAndItemDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ItemDAO extends AbsConnectionDB implements ItemDAOI {

	private Item item;
	private List<Item> itemList;
	/*
	 * Constructor creates a new Item object
	 * Constructor Injection 
	 */
	public ItemDAO() {
		this.item = new Item();
		this.itemList = new ArrayList<>();
	}
	
	@Override
	public List<Item> getAllItems() {
		try {
			connectDB();
			ps = conn.prepareStatement(ItemSQL.GET_ALL_ITEMS.getQuery());
			rs = ps.executeQuery();
			itemList.clear();
			while(rs.next()) {
				Item tempItem = new Item();
				tempItem.setId(rs.getInt(1));
				tempItem.setName(rs.getString(2));
				tempItem.setPrice(rs.getDouble(3));
				itemList.add(tempItem);
			}
			System.out.println(rs.getRow() + " items are found in the database.");
			closeConnection();
			return itemList;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addItem(Item item) {
		try {
			connectDB();
			ps = conn.prepareStatement(ItemSQL.ADD_ITEM.getQuery());
			ps.setInt(1, item.getId());
			ps.setString(2, item.getName());
			ps.setDouble(3, item.getPrice());
			ps.executeUpdate();
			System.out.println (item + " is added to the database.");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println ("Adding " + item + " failed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Item removeItemById(int id) {
		try {
			connectDB();
			ps = conn.prepareStatement(ItemSQL.REMOVE_ITEM_BY_ID.getQuery());
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				item.setId(rs.getInt(1));
				item.setName(rs.getString(2));
				item.setPrice(rs.getDouble(3));

				System.out.println("The following item is deleted from the databse: \n" + item.toString());
			}
			return item;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
