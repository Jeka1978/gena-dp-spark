package neznau;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Evegeny on 29/10/2016.
 */
@Data
@AllArgsConstructor
public class Estimate {
    private User user;
    private int rate;
}
