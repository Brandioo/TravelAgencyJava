package com.travelagency.tirana.repository;

import com.travelagency.tirana.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
