package com.high.baegopa.repositories;

import com.high.baegopa.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by high on 2017. 7. 3..
 */
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM user u WHERE u.id = :id AND u.useYn = 'Y'")
    User findById(@Param("id")Long id);
}
