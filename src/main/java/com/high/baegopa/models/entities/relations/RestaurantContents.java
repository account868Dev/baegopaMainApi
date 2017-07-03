package com.high.baegopa.models.entities.relations;

import com.high.baegopa.models.entities.RestaurantContent;
import com.sun.tools.javac.util.List;
import lombok.Data;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

/**
 * Created by high on 2017. 7. 3..
 */
@Data
@Entity
@Table(name = "restaurants")
public class RestaurantContents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private String name;
    @Column(name = "food_type")
    private String foodType;

    @Column(name = "use_yn")
    private String useYn;

    @Column
    private String address;
    @Column
    private String address2;
    @Column(name = "zip_code")
    private String zipCode;
    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "location_code")
    private Integer locationCode;
    @Column
    private Double latitude;
    @Column
    private Double longtitude;

    @Column(name = "created_at")
    private DateTime createdAt;
    @Column(name = "updated_at")
    private DateTime updatedAt;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    private Set<RestaurantContent> restaurantContentList;

}
