package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 29/10/2016.
 */
@Component
public class HappyBirthdayMailGenerator implements MailGenerator {
    public String generateHtml() {
        return "<html>happy birthday</html>";
    }

    public int mailCode() {
        return 2;
    }
}
