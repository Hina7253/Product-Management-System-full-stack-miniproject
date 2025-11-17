package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Product;
import com.example.Repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(int id) {
        Optional<Product> product = productRepo.findById(id);
        return product.orElse(null);  // safer than .get()
    }

    @Override
    public String deleteProduct(int id) {
        Optional<Product> product = productRepo.findById(id);
        if (product.isPresent()) {
            productRepo.delete(product.get());
            return "Product deleted successfully!";
        }
        return "Product not found!";
    }

	@Override
	public Product getProductbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product editProduct(Product p, int id) {
		Product oldproduct = productRepo.findById(id).get();
		oldproduct.setProductName(p.getProductName());
		oldproduct.setDescription(p.getDescription());
		oldproduct.setPrice(p.getPrice());
		oldproduct.setStatus(p.getStatus());
		return productRepo.save(oldproduct);
	}
	
	
}
