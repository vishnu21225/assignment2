import java.awt.*;
public class BC8 extends Frame
{
public static void main(String arg[])
{
BC8 g=new BC8();
}
TextField t1=new TextField();
TextField t2=new TextField();
Button b1=new Button("Submit");
Button b2=new Button("Cancel");
Label l1=new Label("Name");
Label l2=new Label("Address");
GridBagLayout g1=new GridBagLayout();
GridBagConstraints gb1=new GridBagConstraints();
GridBagConstraints gb2=new GridBagConstraints();
GridBagConstraints gb3=new GridBagConstraints();
GridBagConstraints gb4=new GridBagConstraints();
GridBagConstraints gb5=new GridBagConstraints();
GridBagConstraints gb6=new GridBagConstraints();
public BC8()
{
super("U8 Window");
setSize(400,300);

gb1.gridx=0;
gb1.gridy=0;
gb1.weightx=1;
gb1.weighty=1;
gb1.gridwidth=1;
gb1.gridheight=2;
g1.setConstraints(l1,gb1);
add(l1);

gb2.gridx=1;
gb2.gridy=2;
gb2.weightx=1;
gb2.weighty=1;
gb2.gridwidth=2;
gb2.gridheight=1;
g1.setConstraints(t1,gb2);
add(t1);

gb3.gridx=2;
gb3.gridy=1;
gb3.weightx=1;
gb3.weighty=1;
gb3.gridwidth=2;
gb3.gridheight=3;
g1.setConstraints(l2,gb3);
add(l2);

gb4.gridx=2;
gb4.gridy=2;
gb4.weightx=1;
gb4.weighty=1;
gb4.gridwidth=3;
gb4.gridheight=2;
g1.setConstraints(t2,gb4);
add(t2);
setVisible(true);
}
}



