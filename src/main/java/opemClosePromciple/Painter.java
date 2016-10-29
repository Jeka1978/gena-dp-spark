package opemClosePromciple;

import java.awt.*;

/**
 * Created by Evegeny on 29/10/2016.
 */
public class Painter {

    private Graphics g;

    public Painter(Graphics g) {
        this.g = g;
    }

    public void drawShape(Shape shape) {
       shape.drawMyself(g);
    }
}
