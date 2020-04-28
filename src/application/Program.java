package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao  sellerDao =  DaoFactory.createSellerDao();
		
//		Department obj = new Department(1, "Rogerio");
		
		Seller seller = sellerDao.findById(3);
		
		//		Seller seller = new Seller(21,"Rogerio","wgiomo@gmail.com", new Date(), 3000.0, obj);
		
		System.out.println(seller);

	}

}
