package com.high.baegopa.repositories;

import com.high.baegopa.models.entities.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by high on 2017. 7. 3..
 */
public interface WeatherRepository extends JpaRepository<Weather, Long> {
}
