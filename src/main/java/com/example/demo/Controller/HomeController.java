package com.example.demo.Controller;
/* Author Name                    Module Name                               Changes Date   
 * Ravindra k              Add Product details in Database                 31-Mar-2021
 * Deshraj T               Delete logic form table                         01-Nov-2020
 * Mahesh D                Update Logic                                    12-Oct-2019
 * Vaibhav D               Store data in list wise                         20-Sep-2018
 * Sangram P               fetching all product in database.               19-Oct-2015
 */


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;




@RestController
public class HomeController {

	@Autowired
	private ProductService service;

	//Add Product details in Database
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product) {

		return service.saveProduct(product);

	}
    
	//Store data in list wise
	@PostMapping("/addproducts")
	public List<Product> addProducts(@RequestBody List<Product> products) {

		return service.saveProducts(products);

	}
   
	//fetching all product in database.
	@GetMapping("/getproducts")
	public List<Product> findAllProducts() {

		return service.getProducts();

	}
   
	//fetching particular product as per role Id.
	@GetMapping("/productid/{id}")
	public Product findProductbyId(@PathVariable int id) {

		return service.getProductsById(id);
	}
 
	//Update Logic
	@PutMapping("/updateproduct")
	public Product updateproduct(@RequestBody Product product) {

		return service.updateProduct(product);

	}
    
	//Delete logic form table
	@DeleteMapping("/deleteproduct/{id}")
	public String deleteproduct(@PathVariable int id) {

		return service.deleteProduct(id);
	}
}

// end class