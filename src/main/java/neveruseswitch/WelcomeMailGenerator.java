package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 29/10/2016.
 */
@Component("1")
public class WelcomeMailGenerator implements MailGenerator {
    public String generateHtml() {
        return "<html>welcome new client</html>";
    }
}
