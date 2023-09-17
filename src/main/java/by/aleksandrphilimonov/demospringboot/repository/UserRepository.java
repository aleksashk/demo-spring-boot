package by.aleksandrphilimonov.demospringboot.repository;

import by.aleksandrphilimonov.demospringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
