import java.awt.*;
public class Calculator {
private Frame fr;
private Panel p1,p2;
private TextField tf;
private Button bn[];
private String []text = {"1","2","3","4","5","6","7","8","9","+","0",
"-"};
public void init() {
fr = new Frame("ShowComplex");
fr.setFont(new Font("TimesRoman",Font.BOLD,16));
p1 = new Panel();
p2 = new Panel();
tf = new TextField(" แสดง เ ลข ");
p1.setLayout(new BorderLayout());
p2.setLayout(new GridLayout(4,3));
bn = new Button[12];
for(int i=0;i<text.length;i++) {
bn[i] = new Button(text[i]);
p2.add(bn[i]);
}
p1.add(tf,BorderLayout.NORTH);
p1.add(p2,BorderLayout.CENTER);
fr.setLayout(new GridLayout(1,2));
fr.add(p1);
fr.pack();
fr.show();
}
public static void main(String args[]) {
Calculator cd = new Calculator();
cd.init();
}
}
