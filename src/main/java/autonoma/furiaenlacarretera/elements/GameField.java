package autonoma.furiaenlacarretera.elements;

import gamebase.elements.SpriteContainer;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Kamii
 */
public class GameField extends SpriteContainer{

    public GameField(int x, int y, int height, int width) {
        super(x, y, height, width);
    }

    @Override
    public void paint(Graphics g) {
    }

    @Override
    public Rectangle getBordes() {
        return new Rectangle(x, y, width, height);
    }

    @Override
    public void refresh() {
    }
    
    
}
