package com.javaspringbootrestapi.jsbra.repository;

import com.javaspringbootrestapi.jsbra.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
