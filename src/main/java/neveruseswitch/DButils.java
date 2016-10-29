package neveruseswitch;

import org.fluttercode.datafactory.impl.DataFactory;

/**
 * Created by Evegeny on 29/10/2016.
 */
public class DButils {
    public static MailInfo getMailInfo() {
        DataFactory dataFactory = new DataFactory();
        return new MailInfo(dataFactory.getEmailAddress(),dataFactory.getNumberBetween(1,4));
    }
}
