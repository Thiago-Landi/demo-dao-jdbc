package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);// vai consultar no banco de dados um objeto com esse id e caso tenha vai retorna-lo e caso nao tenha retorna null
	List<Seller> findAll(); //vai retorna todo mundo
	List<Seller> findByDepartment(Department department);
	
	
}
