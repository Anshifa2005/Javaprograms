import java.applet.Applet;
import java.awt.*;

/*
<applet code="RectApplet.class" width="400" height="300">
    <param name="x" value="50">
    <param name="y" value="60">
    <param name="width" value="200">
    <param name="height" value="100">
    <param name="color" value="blue">
</applet>
*/

public class RectApplet extends Applet {
    int x, y, w, h;
    Color c;

    
    public void init() {
        
        x = Integer.parseInt(getParameter("x"));
        y = Integer.parseInt(getParameter("y"));
        w = Integer.parseInt(getParameter("width"));
        h = Integer.parseInt(getParameter("height"));

        String colorName = getParameter("color");

        if (colorName.equalsIgnoreCase("red")) {
            c = Color.red;
        } else if (colorName.equalsIgnoreCase("green")) {
            c = Color.green;
        } else if (colorName.equalsIgnoreCase("blue")) {
            c = Color.blue;
        } else if (colorName.equalsIgnoreCase("yellow")) {
            c = Color.yellow;
        } else if (colorName.equalsIgnoreCase("black")) {
            c = Color.black;
        } else {
            c = Color.gray;
        }
    }

    
    public void paint(Graphics g) {
        g.setColor(c);
        g.fillRect(x, y, w, h);
    }
}
