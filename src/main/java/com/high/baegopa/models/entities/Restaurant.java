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
 * Created by high on 2017. 7. 2..
 */
@Data
@Entity
@Table(name = "restaurants")
public class Restaurant {

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

    public Restaurant(){}

    public Restaurant(String name, String address, String address2, String zipCode
            , String phoneNumber, Integer locationCode, Double latitude, Double longtitude) {
        this.name = name;
        this.address = address;
        this.address2 = address2;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.locationCode = locationCode;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.useYn = "Y";
        this.createdAt = DateTime.now();
    }
}
