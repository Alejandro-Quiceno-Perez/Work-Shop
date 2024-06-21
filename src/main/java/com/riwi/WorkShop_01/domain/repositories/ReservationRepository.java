package com.riwi.WorkShop_01.domain.repositories;

import com.riwi.WorkShop_01.domain.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
