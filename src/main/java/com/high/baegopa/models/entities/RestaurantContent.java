package com.high.baegopa.models.entities;

import lombok.Data;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by high on 2017. 7. 3..
 */
@Data
@Entity
@Table(name = "restaurant_contents")
public class RestaurantContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "restaurant_id")
    private Long restaurantId;

    @Column
    private Integer order;
    @Column
    private String type;
    @Column
    private String useYn;

    @Column(name = "image_url")
    private String imageUrl;
    @Column
    private String contents;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;
}
