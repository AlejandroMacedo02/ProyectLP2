package upeu.edu.pe.Proyectlp2.app.service;

import upeu.edu.pe.Proyectlp2.app.repository.UserRepository;
import upeu.edu.pe.Proyectlp2.infrastructure.entity.ProductEntity;
import upeu.edu.pe.Proyectlp2.infrastructure.entity.UserEntity;

/**
 *
 * @author alejandromacedop
 */
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<UserEntity> getUsers() {
        return userRepository.getUsers();
    }
    public Iterable<UserEntity> getUsersByUser(ProductEntity user) {
        return userRepository.getUsersByUser(user);
    }
    public UserEntity getUserById(Integer id){
        return userRepository.getUserById(id);
    }
    public UserEntity saveUser(UserEntity user){
         return userRepository.saveUser(user);
    }
    public void deleteUserById(Integer id){
          userRepository.deleteUserById(id);
    }
    
}
