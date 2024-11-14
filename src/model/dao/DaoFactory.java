package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerdao() { // isso permite que a implementação não fique exposta
		return new SellerDaoJDBC(DB.getConnection());
	}
	
}
