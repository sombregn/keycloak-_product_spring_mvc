package com.isi.mvc.controller;


import com.isi.mvc.dtos.ProductDTO;
import com.isi.mvc.model.Product;
import com.isi.mvc.service.ProductService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor

public class ProductController {

    private final ProductService service ;

    @PostMapping("/product-create")
    public String addProduct(
           @Valid @ModelAttribute("product") ProductDTO productDTO,
           BindingResult bindingResult,
           Model model
    )
    {
        if (bindingResult.hasErrors()){
            model.addAttribute("product",productDTO);
            return "product-create";
        }
        service.addProduct(productDTO);
        return "redirect:/products";
    }

    @GetMapping("/product-create")
    public String formProduct (Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "product-create" ;
    }

    @GetMapping("/products")
    public String listProducts (Model model) {
        List<ProductDTO> products = service.listProducts();
        model.addAttribute("products", products);
        return "products";
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/product-edit/{id}")
    public String editProductForm(@PathVariable Integer id, Model model) {
        ProductDTO productDTO = service.getProductById(id);
        model.addAttribute("product", productDTO);
        return "product-edit";
    }

    @PostMapping("/product-update/{id}")
    public String updateProduct(
            @PathVariable Integer id,
            @Valid @ModelAttribute("product") ProductDTO productDTO,
            BindingResult bindingResult,
            Model model
    ) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("product", productDTO);
            return "product-edit";
        }
        service.updateProduct(id, productDTO);
        return "redirect:/products";
    }

    @GetMapping("/product-delete/{id}")
    public String deleteProduct(@PathVariable Integer id) {
        service.deleteProduct(id);
        return "redirect:/products";
    }

}
