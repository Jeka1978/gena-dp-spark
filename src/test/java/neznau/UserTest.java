package neznau;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 29/10/2016.
 */
public class UserTest {
    private User user;
    private Link link;


    @Before
    public void setUp() throws Exception {
        link = new Link(1);
        user = new UserImpl();
        user.addLink(link);

    }

    @Test
    public void commentLinkIsWorking() throws Exception {
        user.comment(link,new Comment("hren"));
        Link link = user.getLink(1L);
        List<Comment> comments = link.getComments();
        Assert.assertEquals("hren",comments.get(0));

    }
}