package bookingdemo.bookingdemo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private List<HotelBooking> bookings;


    public BookingController(){
        bookings = new ArrayList<>();

        bookings.add(new HotelBooking("Hotel 8",50.00,7));
        bookings.add(new HotelBooking("Marriot",199.99,5));
        bookings.add(new HotelBooking("Renaissance", 140.00,3));
        bookings.add(new HotelBooking("Brown Palace", 300.00,1));

    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<HotelBooking> getAll(){
        return bookings;    //what is returned is what gets passed to the view? i think
    }


    //fetches only affordable plans for clients
    @RequestMapping(value = "/affordable/{price}", method = RequestMethod.GET)
    public List<HotelBooking> getAffordable(@PathVariable double price){
        return bookings.stream().filter( x -> x.getPricePerNight() <= price).collect(Collectors.toList());

    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<HotelBooking> create(@RequestBody HotelBooking hotelBooking){
        bookings.add(hotelBooking);

        return bookings;
    }

}
