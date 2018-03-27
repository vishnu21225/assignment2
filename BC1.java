import java.awt.*;
public class BC1 extends Frame
{
public static void main(String args[])
{
BC1 s=new BC1();
}
Button B1=new Button("Submit");
Label l1=new Label("Student Name");
Label l2=new Label("Roll no");
Checkbox c1=new Checkbox("Hindi");
Checkbox c2=new Checkbox("English");
Label l3=new Label("Class");
TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
public BC1()
{
setSize(400,300);
setTitle("Student information window");
setLayout(new GridLayout(5,5));
add(l1);
add(t1);
add(l2);
add(t2);
add(c1);
add(c2);
add(B1);
setVisible(true);
}
}