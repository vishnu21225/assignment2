import java.applet.*;
import java.awt.*;
public class BC11 extends Applet
{
public void paint(Graphics g)
{
g.drawRoundRect(10,10,50,100,10,10);
g.drawRoundRect(100,100,50,50,10,10);
g.fillRoundRect(200,20,50,100,10,10);
g.fillRoundRect(200,200,50,50,10,10);
}
}
/*  
 <applet code="BC11.class" height=200 width=320>
 </applet>
 */