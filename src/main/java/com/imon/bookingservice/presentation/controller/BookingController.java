package com.imon.bookingservice.presentation.controller;

import com.imon.bookingservice.application.usecase.CreateBookingUseCase;
import com.imon.bookingservice.domain.model.Booking;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private final CreateBookingUseCase createBookingUseCase;

    public BookingController(CreateBookingUseCase createBookingUseCase) {
        this.createBookingUseCase = createBookingUseCase;
    }

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return createBookingUseCase.execute(booking);
    }
}