package com.connection;

//import java.sql.*;
import java.util.Scanner;

import com.operation.EditingTable;

public class SampleJdbc extends EditingTable {
	private static Scanner in;

	public static void main(String[] args) {
		String ch;
		in = new Scanner(System.in);
		EditingTable ed = new EditingTable();
		System.out.println("wish to make changes::");
		String n = in.nextLine();
		if (n.equals("yes")) {

			System.out.println("enter the choice");
			ch = in.nextLine();
			switch (ch) {
			case "insert": {
				System.out.println("inserting...");
				ed.addQuery();
				break;
			}
			case "update": {
				ed.updateQuery();
				break;
			}
			case "delete": {
				ed.deleteQuery();
				break;
			}
			case "show": {
				ed.showQuery();
				break;
			}
			default: {
				System.out.println(
						"you have to enter anyone of these options- insert or update or delete or show keywords here");
				break;
			}

			}
		} else {
			System.out.println("you have to enter 'yes' to make changes");
		}
	}
}
