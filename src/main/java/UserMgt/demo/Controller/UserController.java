package UserMgt.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import UserMgt.demo.Model.User;
import UserMgt.demo.Service.UserService;

@RestController
public class UserController {
    
    private final UserService userService;

    public UserController(UserService userService){
        this.userService= userService;
    }

    @GetMapping("/")
    public void getPage(){
        System.out.println("Hello World!");
    }

    @PostMapping
    public User createUser(User user){
        return userService.createUser(user);
    }

    @GetMapping("/users")
    public List<User> getUser(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User findByIdUser(@PathVariable Long id){
        return userService.findByIdUser(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user){
        return userService.updateUser(id, user);
    }

    public User deleteUser(Long id){
        return userService.deleteUser(id);
    }
}
