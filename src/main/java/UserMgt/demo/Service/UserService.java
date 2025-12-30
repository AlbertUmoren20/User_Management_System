package UserMgt.demo.Service;

import java.util.List;

import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties.Apiversion.Use;

import UserMgt.demo.Model.User;
import UserMgt.demo.Repository.UserRepository;

public class UserService {
    private final UserRepository userRepository; //Right here is the "attribute"

    //So inorder that I use the service class properly, I will need to create an instance of UserRepository.
    // now before creating the instance I will obviously create a constructor
    //Also because I am a service class and cannot communicate properly to the DB,
    // I need to crreate an instance of UserRepository, whom can communicate with the DB

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    //Now we can do our CRUD operation
    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User findByIdUser(Long id){
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public User deleteUser(Long id){
        userRepository.deleteById(id);
        return null;
    }

    public User updateUser(Long id, User userDetails){
        User user = findByIdUser(id);
        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        return userRepository.save(user);
    }

}
