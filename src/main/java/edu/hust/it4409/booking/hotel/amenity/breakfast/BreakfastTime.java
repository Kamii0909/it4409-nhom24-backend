package edu.hust.it4409.booking.hotel.amenity.breakfast;

import java.time.LocalDate;

import edu.hust.it4409.common.model.interfaces.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class BreakfastTime implements ValueObject {
    public static final String DAILY_TIME_UNIT = "Daily";
    public static final String WEEKDAYS_TIME_UNIT = "Weekdays";
    public static final String WEEKENDS_TIME_UNIT = "Weekend";
    private String timeUnit;
    private LocalDate start;
    private LocalDate end;
}