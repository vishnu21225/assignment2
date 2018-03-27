import java.awt.*;
import java.applet.*;
public class BC12 extends Applet
{
  public void paint(Graphics g)
  {
    g.setColor(Color.blue);
    g.drawRect(50, 80, 150, 100);
    g.setColor(Color.red);
    g.fillRect(230, 80, 150, 100);
  }
}
/*  
 <applet code="BC12.class" height=200 width=320>
 </applet>
 */