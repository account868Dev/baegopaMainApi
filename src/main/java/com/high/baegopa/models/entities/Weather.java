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
@Table(name = "weathers")
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "weather_type")
    private String weatherType;

    @Column(name = "created_at")
    private DateTime createdAt;

    public Weather() {}

    public Weather(String weatherType) {
        this.weatherType = weatherType;
        this.createdAt = DateTime.now();
    }
}
