package com.isi.mvc.service;

import com.isi.mvc.dtos.ProductDTO;
import com.isi.mvc.model.Product;

import java.util.List;

public interface ProductService {
    Product addProduct(ProductDTO productDTO);
    List<ProductDTO> listProducts();
    ProductDTO getProductById(Integer id);
    Product updateProduct(Integer id, ProductDTO productDTO);
    void deleteProduct(Integer id);
}
