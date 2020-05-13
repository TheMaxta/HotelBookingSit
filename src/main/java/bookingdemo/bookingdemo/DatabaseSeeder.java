package bookingdemo.bookingdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    //needs reference to repository
    private BookingRepository bookingRepository;

    @Autowired
    public DatabaseSeeder(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        List<HotelBooking> bookings = new ArrayList<>();

        bookings.add(new HotelBooking("Hotel 8",50.00,7));
        bookings.add(new HotelBooking("Marriot",199.99,5));
        bookings.add(new HotelBooking("Renaissance", 140.00,3));
        bookings.add(new HotelBooking("Brown Palace", 300.00,1));
        bookings.add(new HotelBooking("Comfort Inn", 55.00,1));
        bookings.add(new HotelBooking("Best Western", 70.00,2));

        bookingRepository.saveAll(bookings);
    }
}
