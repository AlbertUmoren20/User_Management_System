package UserMgt.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import UserMgt.demo.Model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
