package upeu.edu.pe.Proyectlp2.app.repository;

import upeu.edu.pe.Proyectlp2.infrastructure.entity.ProductEntity;
import upeu.edu.pe.Proyectlp2.infrastructure.entity.UserEntity;

/**
 *
 * @author alejandromacedop
 */
public interface ProductRepository {
    //metodo que trae todos los productos
    Iterable<ProductEntity> getProducts();
    //lista de productos por usuario
    Iterable<ProductEntity> getProductsByUser(UserEntity user);
    ProductEntity getProductById(Integer id);
    ProductEntity saveProduct(ProductEntity product);
    void deleteProductById(Integer id);
    
}

