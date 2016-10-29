package neznau;

/**
 * Created by Evegeny on 29/10/2016.
 */
public class UserImpl implements User {


    @Override
    public Channel getChannel() {
        return null;
    }

    @Override
    public void addDomain(Domain domain) {

    }

    @Override
    public void removeDomain(Domain domain) {

    }

    @Override
    public void removeAccount() {

    }

    @Override
    public Settings getSettings() {
        return null;
    }

    @Override
    public void addLink(Link link) {

    }

    @Override
    public void comment(Link link, Comment comment) {
        link.addComment(comment);
    }

    @Override
    public Link getLink(Long id) {
        return links.;
    }
}
