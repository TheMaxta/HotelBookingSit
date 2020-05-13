package bookingdemo.bookingdemo;

public class HotelBooking {
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
}
