package bookingdemo.bookingdemo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HotelBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String hotelName;
    private double pricePerNight;
    private int numOfNights;

    public HotelBooking(){}

    public HotelBooking(String hotelName, double pricePerNight, int numOfNights){
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.numOfNights = numOfNights;
    }

    public String getHotelName(){
        return hotelName;
    }

    public double getPricePerNight(){
        return pricePerNight;
    }

    public int getNumOfNights(){
        return numOfNights;
    }
    public double getTotalPrice(){
        return pricePerNight * numOfNights;
    }

    public long getId(){
        return id;
    }


}
