package com.high.baegopa.models.entities;

import lombok.Data;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by high on 2017. 7. 3..
 */
@Data
@Entity
@Table(name = "user_historys")
public class UserHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "restaurant_id")
    private Long restaurantId;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "weather_id")
    private Long weatherId;

    @Column(name = "created_at")
    private DateTime createdAt;

    @Column
    private Integer rank;

    public UserHistory(){}

    public UserHistory(Long restaurantId, Long userId, Long weatherId, Integer rank){
        this.restaurantId = restaurantId;
        this.userId = userId;
        this.weatherId = weatherId;
        this.rank = rank;
        this.createdAt = DateTime.now();
    }
}
