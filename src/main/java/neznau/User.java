package neznau;

import java.util.List;

/**
 * Created by Evegeny on 29/10/2016.
 */
public interface User {
    Channel getChannel();

    void addDomain(Domain domain);

    void removeDomain(Domain domain);

    void removeAccount();

    Settings getSettings();

    void addLink(Link link);

    void comment(Link link, Comment comment);


    Link getLink(Long id);
}
