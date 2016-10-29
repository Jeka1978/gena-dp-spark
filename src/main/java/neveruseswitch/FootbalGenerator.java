package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 29/10/2016.
 */
@Component
public class FootbalGenerator implements MailGenerator {
    public String generateHtml() {
        return "zenit!!!!";
    }

    public int mailCode() {
        return 3;
    }
}
