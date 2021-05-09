package com.travelagency.tirana.repository;

import com.travelagency.tirana.model.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DestinationRepository extends JpaRepository<Destination, Long> {
    @Query(value = "SELECT * FROM Destination WHERE id = :id", nativeQuery = true)
    Destination findOne(Long id);
}
