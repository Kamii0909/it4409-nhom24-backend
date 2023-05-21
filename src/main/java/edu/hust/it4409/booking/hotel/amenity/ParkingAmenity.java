package edu.hust.it4409.booking.hotel.amenity;

public interface ParkingAmenity {
    default boolean hasParking() {
        return hasSelfParking() || hasValetParking();
    }
    
    boolean hasSelfParking();
    
    boolean hasValetParking();
    
    boolean hasLongTermParking();
    
    boolean hasOnSiteParking();

}
