package com.example.Service;

import java.util.List;

import com.example.Model.Product;

public interface ProductService {
	
	public Product saveProduct(Product product);
	
	public List<Product> getAllProducts();
	
	public Product getProductbyId(int id);
	
	public String deleteProduct(int id);

	Product getProductById(int id);
	
	public Product editProduct(Product product, int id);

}
