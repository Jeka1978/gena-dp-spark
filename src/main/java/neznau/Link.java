package neznau;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evegeny on 29/10/2016.
 */
@Data
public class Link {
    private long id;
    private String url;
    private List<Estimate> estimates = new ArrayList<>();
    private List<Comment> comments = new ArrayList<>();

    public Link(long id) {
        this.id = id;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }
}
