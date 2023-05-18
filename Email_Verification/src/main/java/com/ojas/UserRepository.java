package com.ojas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository("userRepository")
public interface UserRepository extends JpaRepository<UserEntity, String> {
	UserEntity findByEmailIdIgnoreCase(String emailid);
	

}
