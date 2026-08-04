package com.imon.bookingservice.infrastructure.persistence;

import com.imon.bookingservice.domain.model.Booking;
import com.imon.bookingservice.domain.repository.BookingRepository;
import org.springframework.stereotype.Repository;

@Repository
public class BookingRepositoryAdapter implements BookingRepository {

    private final BookingJpaRepository bookingJpaRepository;

    public BookingRepositoryAdapter(BookingJpaRepository bookingJpaRepository) {
        this.bookingJpaRepository = bookingJpaRepository;
    }

    @Override
    public Booking save(Booking booking) {
        return bookingJpaRepository.save(booking);
    }
}