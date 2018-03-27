import java.awt.*;
public class BC13 extends Frame
{
public static void main(String args[])
{}
Button B1,B2,B3,B4;
public BC13()
{
B1=new Button("B1");
B2=new Button("B2");
B3=new Button("B3");
B4=new Button("B4");
setLayout(new GridLayout(2,2));
add(B1);
add(B2);
add(B3);
add(B4);
setVisible(true);
}
}
