package com.high.baegopa.repositories;

import com.high.baegopa.models.entities.UserHistory;
import com.sun.tools.javac.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by high on 2017. 7. 3..
 */
public interface UserHistoryRepository extends JpaRepository<UserHistory, Long>{
    List<UserHistory> findAllByUserId(Long userId);
}
