package com.fabienIT.bibliothequep7ocr.repository;

import com.fabienIT.bibliothequep7ocr.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findByUserId(int id);

    Reservation findReservationById(Long id);

    Reservation findReservationByTopoId(long id);

    Reservation findReservationByUserId(int id);

}

