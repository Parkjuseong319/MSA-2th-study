package view;

import java.io.IOException;
import java.sql.SQLException;

import controller.GiftController;

public class MainEntry {
	public static void main(String[] args) throws SQLException, IOException {
//		ConnectionHelper.getConection("oracle", "Zoo", "oracle");
//		ConnectionHelper.getConection("oracle");
		GiftController.connect();
		GiftController.menu();
	}
}
