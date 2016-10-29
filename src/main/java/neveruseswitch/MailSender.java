package neveruseswitch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Evegeny on 29/10/2016.
 */
@Service
@EnableScheduling
public class MailSender {
    @Autowired
    private Map<String,MailGenerator> map;

    @Scheduled(cron = "1/1 * * * * ?")
    public void sendMail() {
        MailInfo mailInfo = DButils.getMailInfo();
        String code = String.valueOf(mailInfo.getCode());
        MailGenerator mailGenerator = map.get(code);
        if (mailGenerator == null) {
            throw new RuntimeException(code + " not supported");
        }

        String html = mailGenerator.generateHtml();
        send(html,mailInfo.getTo());
    }

    private void send(String html,String to) {
        System.out.println("sending... "+to+" "+html);
    }

}
