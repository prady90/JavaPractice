package Exercism;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    LocalDateTime temp;
  
    
    public Gigasecond(LocalDate moment) {
        temp = moment.atStartOfDay().plusSeconds((long)Math.pow(10, 9));
    }

    public Gigasecond(LocalDateTime moment) {
        temp = moment.plusSeconds((long)Math.pow(10, 9));
    }

    public LocalDateTime getDateTime() {
        return temp;
    }
}
