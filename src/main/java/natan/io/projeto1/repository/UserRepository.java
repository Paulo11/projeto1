package natan.io.projeto1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import natan.io.projeto1.entity.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	User findByEmail(String email);
	
	User findByNameIgnoreCase(String name);
	
	
}
