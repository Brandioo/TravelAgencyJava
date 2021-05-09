package com.travelagency.tirana.service.Impl.TourImpl;

import com.travelagency.tirana.model.TravelType;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
public class SaveTourRequest {

    private long id;
    private String title;
    private int days;
    private int maxPeople;
    private int minPeople;
    private String description;
    private String departure;
    private String photo;
    private boolean featured;
    @Enumerated(EnumType.STRING)
    private TravelType travelType;
    private int price;
    private int quantity;

}
