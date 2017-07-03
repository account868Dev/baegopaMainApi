package com.high.baegopa.repositories;

import com.high.baegopa.models.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by high on 2017. 7. 3..
 */
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
