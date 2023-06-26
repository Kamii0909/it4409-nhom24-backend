package edu.hust.it4409.booking.hotel.amenity.pool;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@SuperBuilder
public class PoolAmenity {
    private int outdoorPool;
    private int indoorPool;
    private List<SeasonalPool> seasonalPools;
    private PoolHour poolHour;
    private NearybyPool nearybyPool;
    private UncommonPoolAmenity others;
}
