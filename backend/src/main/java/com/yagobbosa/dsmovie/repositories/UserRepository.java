package com.yagobbosa.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagobbosa.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
