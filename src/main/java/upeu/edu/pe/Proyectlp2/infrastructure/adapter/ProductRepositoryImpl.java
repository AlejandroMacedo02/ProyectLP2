/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.Proyectlp2.infrastructure.adapter;

import org.springframework.stereotype.Repository;
import upeu.edu.pe.Proyectlp2.app.repository.ProductRepository;
import upeu.edu.pe.Proyectlp2.infrastructure.entity.ProductEntity;
import upeu.edu.pe.Proyectlp2.infrastructure.entity.UserEntity;

/**
 *
 * @author alejandromacedop
 */
@Repository
public class ProductRepositoryImpl implements ProductRepository{
    private final ProductCrudRepository productCrudRepository;
    private final ProductEntity productEntity;
    private final UserEntity userEntity;

    public ProductRepositoryImpl(ProductCrudRepository productCrudRepository, ProductEntity productEntity, UserEntity userEntity) {
        this.productCrudRepository = productCrudRepository;
        this.productEntity = productEntity;
        this.userEntity = userEntity;
    }
    

       
    @Override
    public Iterable<ProductEntity> getProducts() {
        //metodo propio de Spring 
        return productCrudRepository.findAll();
    }

    @Override
    public Iterable<ProductEntity> getProductsByUser(UserEntity user) {
        return productCrudRepository.findByUserEntity(userEntity);
    }

    @Override
    public ProductEntity getProductById(Integer id) {
        return productCrudRepository.findById(id).get();
    }

    @Override
    public ProductEntity saveProduct(ProductEntity product) {
       return productCrudRepository.save(productEntity);
    }

    @Override
    public void deleteProductById(Integer id) {
       productCrudRepository.deleteById(id);
    }
    
}