package upeu.edu.pe.Proyectlp2.infrastructure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import upeu.edu.pe.Proyectlp2.app.service.ProductService;

/**
 *
 * @author alejandromacedop
 */
@Controller
@RequestMapping("admin/product")
public class ProductController {
    
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }    
        //crear nuevo producto
        
        @GetMapping("/create")
        public String create(){
        return "admin/product/create";
    }
    
    
 }   
    

