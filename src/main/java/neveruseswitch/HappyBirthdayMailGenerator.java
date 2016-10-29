package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 29/10/2016.
 */
@Component("2")
public class HappyBirthdayMailGenerator implements MailGenerator {
    public String generateHtml() {
        return "<html>happy birthday</html>";
    }
}
