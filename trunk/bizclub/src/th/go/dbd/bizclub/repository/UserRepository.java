package th.go.dbd.bizclub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import th.go.dbd.bizclub.domain.User;


//public interface UserRepository extends JpaRepository<User, Long> {
public interface UserRepository extends JpaRepository<User, Long> {
	
	//User findByUsername(String username);
	User findByUsername(String username);
}
