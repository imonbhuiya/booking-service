package com.imon.bookingservice.application.usecase;

import com.imon.bookingservice.domain.model.Booking;
import com.imon.bookingservice.domain.model.BookingStatus;
import com.imon.bookingservice.domain.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CreateBookingUseCase {

    private final BookingRepository bookingRepository;

    public CreateBookingUseCase(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking execute(Booking booking) {

        booking.setStatus(BookingStatus.CREATED);
        booking.setCreatedAt(LocalDateTime.now());

        return bookingRepository.save(booking);
    }
}