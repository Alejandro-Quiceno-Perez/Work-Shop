package com.riwi.WorkShop_01.domain.repositories;

import com.riwi.WorkShop_01.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
