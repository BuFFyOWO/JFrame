import javax.swing.*;
import java.awt.*;

public class ClassStarter {
    public static void main(String[] args) {
        SimpleObject so = new SimpleObject();
        SimpleObject so2 = new SimpleObject();
        so.x=99;
        so2.y=77;
        so.moveX(10);
        System.out.println(so.x);

        so.moveX(10);
        so2.moveX(90);
        so.changeWidth(998.0);
        so.changeLength(785.0);
        so.getSquare();


        JFrame fr = new JFrame();

        fr.setTitle("Заголовок");
        fr.add(new JButton("12345"),BorderLayout.NORTH);
        fr.setBounds(100,100,700,700);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);

        JButton btn2 = new JButton("54321");
        fr.add(btn2,BorderLayout.SOUTH);



    }
}
