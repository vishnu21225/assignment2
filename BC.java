import java.awt.*;
import java.applet.*;
 
public class BC extends Applet
{
 int n=0;
 String month[];
 int value[];
 public void init()
 {
  setBackground(Color.pink);
  int n = Integer.parseInt(getParameter("Columns"));
   month = new String[n];
   value = new int[n];
   month[0]  = getParameter("month1");
   month[1]  = getParameter("month2");
  month[2]  = getParameter("month3");
   month[3]  = getParameter("month4");
   value[0] = Integer.parseInt(getParameter("c1"));
   value[1] = Integer.parseInt(getParameter("c2"));
   value[2] = Integer.parseInt(getParameter("c3"));
   value[3] = Integer.parseInt(getParameter("c4"));
  }
 public void paint(Graphics g)
 {
  for(int i=0;i<4;i++) {
   g.setColor(Color.black);
   g.drawString(month[i],20,i*50+30);
   g.setColor(Color.red);
   g.fillRect(50,i*50+10,value[i],40);
  }
 }
}
 
/* <applet code=BC width=400 height=400>
 <param name=c1 value=40>
 <param name=c2 value=50>
 <param name=c3 value=70>
 <param name=c4 value=80>
 <param name=month1 value=1>
 <param name=month2 value=2>
 <param name=month3 value=3>
 <param name=month4 value=4>
 <param name=Columns value=4>
</applet>
*/