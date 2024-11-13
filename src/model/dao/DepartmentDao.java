package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);// vai consultar no banco de dados um objeto com esse id e caso tenha vai retorna-lo e caso nao tenha retorna null
	List<Department> findAll(); //vai retorna todo mundo
	
	
}
