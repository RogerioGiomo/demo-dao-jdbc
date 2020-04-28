package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao  sellerDao =  DaoFactory.createSellerDao();
		System.out.println("=== Test 1: Seller FindById");
//		Department obj = new Department(1, "Rogerio");
		
		Seller seller = sellerDao.findById(3);
//		Seller seller = new Seller(21,"Rogerio","wgiomo@gmail.com", new Date(), 3000.0, obj);
		System.out.println(seller);

		System.out.println("=== Test 2: Seller FindByIdDepartment");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== Test 3: Seller Find all");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("=== Test 4: Seller Insert ");
		Seller newSeller = new Seller(null,"Greg","greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserido Id " + newSeller.getId());
		
	}

}
