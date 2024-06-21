package com.riwi.WorkShop_01.mapper;

import com.riwi.WorkShop_01.api.dto.BookDto;
import com.riwi.WorkShop_01.api.dto.ReservationDto;
import com.riwi.WorkShop_01.domain.entities.Book;
import com.riwi.WorkShop_01.domain.entities.Reservation;
import org.mapstruct.factory.Mappers;

public interface ReservationMapper {
    ReservationMapper INSTANCE = Mappers.getMapper(ReservationMapper.class);
    ReservationDto reservationToReservationDto(Reservation reservation);
    Reservation reservationDtoToReservation(ReservationDto reservationDto);
}
