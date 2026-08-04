package com.imon.bookingservice.domain.repository;

import com.imon.bookingservice.domain.model.Booking;

public interface BookingRepository {

    Booking save(Booking booking);

}