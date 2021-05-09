package com.travelagency.tirana.service;

import com.travelagency.tirana.model.Reservation;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ReservationService {

    Reservation addReservation(Reservation reservation);

    List<Reservation> getReservation();

    ResponseEntity<?> getReservationById(Long reservationID);

    ResponseEntity<?> updateReservation(Long reservationID, Reservation reservationRequest);

    ResponseEntity<?> deleteReservation(Long reservationID);

}
