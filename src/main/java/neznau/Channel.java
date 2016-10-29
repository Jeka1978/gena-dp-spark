package neznau;

/**
 * Created by Evegeny on 29/10/2016.
 */
public interface Channel {
    void addLink(Link link);

    void removeLink(Link link);

    void comment(Link link, Comment comment);

    void createFavoritesDir(Favorites favorites);

    void addToFavorites(Link link);

}
