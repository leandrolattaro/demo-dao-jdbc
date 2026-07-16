package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj);
	void update(Seller obb);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	
}
