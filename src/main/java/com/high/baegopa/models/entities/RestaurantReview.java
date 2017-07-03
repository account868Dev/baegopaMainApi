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
@Table(name = "restaurant_reviews")
public class RestaurantReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "restaurant_id")
    private Long restaurantId;
    @Column(name = "user_id")
    private Long userId;

    @Column
    private Integer grade;
    @Column
    private String contents;

    @Column(name = "use_yn")
    private String useYn;

    @Column(name = "created_at")
    private DateTime createdAt;
    @Column(name = "updated_at")
    private DateTime updatedAt;

    public RestaurantReview() {}

    public RestaurantReview(Long restaurantId, Long userId, Integer grade, String contents) {
        this.restaurantId = restaurantId;
        this.userId = userId;
        this.grade = grade;
        this.contents = contents;
        this.useYn = "Y";
        this.createdAt = DateTime.now();
    }

}