package application;



import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerdao = DaoFactory.createSellerdao();
		
		System.out.println("==== TEST 1: seller findById ====");
		Seller seller = sellerdao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n==== TEST 2: seller findByDepartment ====");
		
		Department department = new Department(2, null);
		List<Seller> obj = sellerdao.findByDepartment(department);
		for(Seller list : obj) {
			System.out.println(list);
		}
		
		System.out.println("\n==== TEST 3: seller findAll ====");
		List<Seller> lista = sellerdao.findAll();		
		for(Seller lits : lista) {
			System.out.println(lits);
		}
		
		/*System.out.println("\n==== TEST 4: seller insert ====");	
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000, department);
		sellerdao.insert(newSeller);
		System.out.println("Insert! id = " + newSeller.getId());*/
		
		/*System.out.println("\n==== TEST 5: seller update ====");
		seller = sellerdao.findById(1);
		seller.setName("Martha Waine");
		sellerdao.update(seller);*/
		
		/*System.out.println("\n==== TEST 6: seller Delete ====");
		sellerdao.deleteById(9);*/
		
		
	}

}
