import java.awt.*;
import java.applet.*;
import java.awt.Color;
public class BC2 extends Applet
{ 
String str=" REDDY";
public void init()
{
setSize(400,150);
setBackground(Color.blue);
}
public void paint(Graphics g)
{
g.setColor(Color.red);
g.drawString(str,60,50);
}
}
/*  
 <applet code="BC2.class" height=200 width=320>
 </applet>
 */