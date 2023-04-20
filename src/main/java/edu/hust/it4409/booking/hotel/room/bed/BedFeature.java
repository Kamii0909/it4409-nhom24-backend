package edu.hust.it4409.booking.hotel.room.bed;

import com.google.common.collect.ImmutableList;

import edu.hust.it4409.booking.hotel.room.RoomFeature;

public interface BedFeature extends RoomFeature {
    /**
     * Amount of core (unchanged) bed in a room.
     */
    ImmutableList<BedUnit> getAllBedTypes();
    
    /**
     * Preferred amount of adults that can share sleep accomodation.
     */
    default int numberOfAdults() {
        return getAllBedTypes()
            .stream()
            .mapToInt(BedUnit::numberOfAdults)
            .sum();
    }
    
    /**
     * Whether this room allows extra beds to be added
     */
    boolean allowExtraBeds();
    
    /**
     * A List of all allowed extra beds
     */
    ImmutableList<BedUnit> allowedExtraBeds();
    
    @Override
    default String getDescription() {
        return "Number of beds, bed sizes, number of preferred adults";
    }
}