package com.high.baegopa.models.entities;

import lombok.Data;

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
@Table(name = "location_code")
public class LocationCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "parent_id")
    private Long parentId;

    @Column
    private String type;

    @Column(name = "city_name")
    private String cityName;

    public LocationCode(){}

    public LocationCode(Long parentId, String type, String cityName){
        this.parentId = parentId;
        this.type = type;
        this.cityName = cityName;
    }
}
