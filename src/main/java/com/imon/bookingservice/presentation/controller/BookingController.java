package com.imon.bookingservice.presentation.controller;

import com.imon.bookingservice.application.dto.CreateBookingRequest;
import com.imon.bookingservice.application.usecase.CreateBookingUseCase;
import com.imon.bookingservice.domain.model.Booking;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private final CreateBookingUseCase createBookingUseCase;

    public BookingController(CreateBookingUseCase createBookingUseCase) {
        this.createBookingUseCase = createBookingUseCase;
    }

    @PostMapping
    public Booking createBooking(@Valid @RequestBody CreateBookingRequest request) {

        Booking booking = new Booking();
        booking.setCustomerName(request.getCustomerName());
        booking.setHotelName(request.getHotelName());
        booking.setRoomNumber(request.getRoomNumber());
        booking.setCheckIn(request.getCheckIn());
        booking.setCheckOut(request.getCheckOut());

        return createBookingUseCase.execute(booking);
    }
}