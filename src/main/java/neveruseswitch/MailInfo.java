package neveruseswitch;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Evegeny on 29/10/2016.
 */
@Data
@AllArgsConstructor
public class MailInfo {
    private String to;
    private int code;
}
