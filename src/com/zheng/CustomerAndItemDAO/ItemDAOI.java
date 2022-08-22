package com.zheng.CustomerAndItemDAO;

import java.util.List;

public interface ItemDAOI {
	
	enum ItemSQL {
		GET_ALL_ITEMS("SELECT * FROM item"),
		ADD_ITEM("INSERT INTO item "
					+ "VALUES(?,?,?)"),
		REMOVE_ITEM_BY_ID("DELETE FROM item WHERE id = ?");

		private final String query;
		
		ItemSQL(String query) {
			this.query = query;
		}
		
		public String getQuery() {
			return query;
		}
	}
	
	/*
	 * Returns the list of all items.
	 */
	public List<Item> getAllItems();
	
	/*
	 * Adds an item with given information.
	 */
	public boolean addItem(Item item);
	
	/*
	 * Removes an item with the given id.
	 */
	public Item removeItemById(int id);

}