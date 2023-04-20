package edu.hust.it4409.booking.hotel.room;

import java.util.List;

import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import edu.hust.it4409.booking.hotel.Hotel;
import edu.hust.it4409.common.model.skeleton.AbstractLocalEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

@Entity
public class HotelRoom extends AbstractLocalEntity<Hotel> {
    private int floor;
    private int roomNumber;
    
    private CommonRoomFeature commonRoomFeature;

    @OneToMany(mappedBy = "rooms", fetch = FetchType.LAZY)
    private Hotel hotel;
    
    @Override
    protected void setRoot(Hotel hotel) {
        this.hotel = hotel;
    }
    
    @Override
    public Hotel getAggregateRoot() {
        return hotel;
    }
}
