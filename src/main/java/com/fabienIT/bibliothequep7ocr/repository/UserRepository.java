package com.fabienIT.bibliothequep7ocr.repository;

import com.fabienIT.bibliothequep7ocr.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

	Page<User> findByNameContains(String keyword, Pageable pageable);
}