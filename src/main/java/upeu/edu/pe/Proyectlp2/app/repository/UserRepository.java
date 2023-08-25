package upeu.edu.pe.Proyectlp2.app.repository;

import upeu.edu.pe.Proyectlp2.infrastructure.entity.ProductEntity;
import upeu.edu.pe.Proyectlp2.infrastructure.entity.UserEntity;

/**
 *
 * @author alejandromacedop
 */
public interface UserRepository {
     //metodo que trae todos los productos
    Iterable<UserEntity> getUsers();
    Iterable<UserEntity> getUsersByUser(ProductEntity user);
    UserEntity getUserById(Integer id);
    UserEntity saveUser(UserEntity user);
    void deleteUserById(Integer id);
}
