package com.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.niit.conn.Connections;

public class EditingTable extends Connections {
	Connection c = null;
	Connections con = new Connections();
	PreparedStatement ps = null;

	public void addQuery() {
		try {
			c = con.con();
			ps = c.prepareStatement("INSERT INTO Stocks(id,item_name,stock) VALUES(2,'chudithar',7)");
			ps.executeUpdate();
			System.out.println("inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateQuery() {
		try {
			c = con.con();
			ps = c.prepareStatement("UPDATE STOCKS SET ITEM_NAME='saree' WHERE ID=1");
			ps.execute();
			System.out.println("updated");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deleteQuery() {
		try {
			c = con.con();
			ps = c.prepareStatement("DELETE FROM STOCKS WHERE ID = 2");
			ps.execute();
			System.out.println("deleted");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void showQuery() {
		try {
			c = con.con();
			ps = c.prepareStatement("SELECT * FROM STOCKS");
			System.out.println("The stock details");

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int sid = rs.getInt("ID");
				String itemname = rs.getString("ITEM_NAME");
				int stocknum = rs.getInt("STOCK");
				System.out.println("product id:   " + sid + "  \t" + "item name: " + itemname + "  \t"
						+ "no of stock:  " + stocknum);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
