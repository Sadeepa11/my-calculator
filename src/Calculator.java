
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class close extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);

    }

}

class cal implements ActionListener {

    //import Button
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b24, b25;

//import Textfield
    TextField tf;

    MenuItem mi1, mi2;

    Frame f1;
    Panel p1, p2;
    MenuBar mbar;
    Menu m1;

    //vab
    String fv, sv, op;
    double fdv, sdv, tot;

    cal() {

        f1 = new Frame();

        //backColor
//        f1.setBackground(Color.WHITE);//backColor
//Close btn action 
        f1.addWindowListener(new close());
//softwarePossition, Width ,Height
        f1.setBounds(500, 200, 350, 500);
//setTitle For softwaere
        f1.setTitle("elixelazz Calculator");

        //menuBar
        mbar = new MenuBar();
//menuBarItems
        mi1 = new MenuItem("Dark");
        mi2 = new MenuItem("Light");
//        MenuItem mi3 = new MenuItem("Copy");
//        MenuItem mi4 = new MenuItem("Past");
//        MenuItem mi5 = new MenuItem("Help");
//        MenuItem mi6 = new MenuItem("About");

//Menu
//menuTab1
        m1 = new Menu("View");

//addItemstoTopic
        m1.add(mi1);
        m1.add(mi2);
//menuTab2
//        Menu m2 = new Menu("Edit");

//addItemstoTopic
//        m2.add(mi3);
//        m2.add(mi4);
//menuTab3
//        Menu m3 = new Menu("FAQ");
//addItemstoTopic
//        m3.add(mi5);
//        m3.add(mi6);
//addMenu TO Menu Bar
        mbar.add(m1);
//        mbar.add(m2);
//        mbar.add(m3);

//menuBarSet
        f1.setMenuBar(mbar);

        //addButtons
        b1 = new Button("C");
        b2 = new Button("√");
        b3 = new Button("%");
        b4 = new Button("÷");
        b5 = new Button("7");
        b6 = new Button("8");
        b7 = new Button("9");
        b8 = new Button("×");
        b9 = new Button("4");
        b10 = new Button("5");
        b11 = new Button("6");
        b12 = new Button("-");
        b13 = new Button("1");
        b14 = new Button("2");
        b15 = new Button("3");
        b16 = new Button("+");
        b17 = new Button("00");
        b18 = new Button("0");
        b19 = new Button(".");
        b20 = new Button("=");

        //add fonts
        Font font1 = new Font("Cambria Math", Font.BOLD, 20);
        Font font2 = new Font("Courier New", Font.BOLD, 20);
//add fonts to btns
        b1.setFont(font1);
        b2.setFont(font1);
        b3.setFont(font1);
        b4.setFont(font1);
        b5.setFont(font1);
        b6.setFont(font1);
        b7.setFont(font1);
        b8.setFont(font1);
        b9.setFont(font1);
        b10.setFont(font2);
        b11.setFont(font2);
        b12.setFont(font2);
        b13.setFont(font2);
        b14.setFont(font2);
        b15.setFont(font2);
        b16.setFont(font2);
        b17.setFont(font2);
        b18.setFont(font2);
        b19.setFont(font2);
        b20.setFont(font2);

//        button colour
        b1.setBackground(Color.YELLOW);
        b2.setBackground(Color.YELLOW);
        b3.setBackground(Color.YELLOW);
        b4.setBackground(Color.YELLOW);
        b5.setBackground(Color.LIGHT_GRAY);
        b6.setBackground(Color.LIGHT_GRAY);
        b7.setBackground(Color.LIGHT_GRAY);
        b8.setBackground(Color.YELLOW);
        b9.setBackground(Color.LIGHT_GRAY);
        b10.setBackground(Color.LIGHT_GRAY);
        b11.setBackground(Color.LIGHT_GRAY);
        b12.setBackground(Color.YELLOW);
        b13.setBackground(Color.LIGHT_GRAY);
        b14.setBackground(Color.LIGHT_GRAY);
        b15.setBackground(Color.LIGHT_GRAY);
        b16.setBackground(Color.YELLOW);
        b17.setBackground(Color.LIGHT_GRAY);
        b18.setBackground(Color.LIGHT_GRAY);
        b19.setBackground(Color.LIGHT_GRAY);
        b20.setBackground(Color.RED);

        //        addTextField
        tf = new TextField(20);
//set Font to tf
        Font font3 = new Font("Cambria Math", Font.BOLD, 20);
        //set Font size to tf
        tf.setFont(font3);

//non edit tf
        tf.setEditable(false);
//textColor
        tf.setForeground(Color.WHITE);
//tfBackGroundColor
        tf.setBackground(Color.BLUE);

//        addPanel
        p1 = new Panel();
        p2 = new Panel();
//        p1.setBackground(Color.GRAY);
//        f1.setBackground(Color.GRAY);

//        gridLayoutPanel
        GridLayout g1 = new GridLayout(5, 4, 2, 2);

//add text field to p1
        p1.add(tf);
        tf.setBounds(1, 1, 300, 100);

//add GridLayout to p2
        p2.setLayout(g1);
//grid layout Background Color
        p2.setBackground(Color.WHITE);
//add Buttons to panel
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        p2.add(b17);
        p2.add(b18);
        p2.add(b19);
        p2.add(b20);

//frame layout
        f1.add(p1, BorderLayout.NORTH);
        f1.add(p2, BorderLayout.CENTER);

//        Add ACtion listener to buttons
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        mi1.addActionListener(this);
        mi2.addActionListener(this);

        f1.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent d) {
        Object o = d.getSource();
        if (o.equals(b5)) {
            tf.setText(tf.getText() + b5.getLabel());
        } else if (o.equals(b6)) {
            tf.setText(tf.getText() + b6.getLabel());
        } else if (o.equals(b7)) {
            tf.setText(tf.getText() + b7.getLabel());
        } else if (o.equals(b9)) {
            tf.setText(tf.getText() + b9.getLabel());
        } else if (o.equals(b10)) {
            tf.setText(tf.getText() + b10.getLabel());
        } else if (o.equals(b11)) {
            tf.setText(tf.getText() + b11.getLabel());
        } else if (o.equals(b13)) {
            tf.setText(tf.getText() + b13.getLabel());
        } else if (o.equals(b14)) {
            tf.setText(tf.getText() + b14.getLabel());
        } else if (o.equals(b15)) {
            tf.setText(tf.getText() + b15.getLabel());
        } else if (o.equals(b17)) {
            tf.setText(tf.getText() + b17.getLabel());
        } else if (o.equals(b18)) {
            tf.setText(tf.getText() + b18.getLabel());
        } else if (o.equals(b19)) {
            tf.setText(tf.getText() + b19.getLabel());

        } else if (o.equals(mi1)) {
            tf.setBackground(Color.GRAY);
            b1.setBackground(Color.ORANGE);
            b2.setBackground(Color.ORANGE);
            b3.setBackground(Color.ORANGE);
            b4.setBackground(Color.ORANGE);
            b5.setBackground(Color.DARK_GRAY);
            b5.setForeground(Color.WHITE);
            b6.setBackground(Color.DARK_GRAY);
            b6.setForeground(Color.WHITE);
            b7.setBackground(Color.DARK_GRAY);
            b7.setForeground(Color.WHITE);
            b8.setBackground(Color.ORANGE);
            b9.setBackground(Color.DARK_GRAY);
            b9.setForeground(Color.WHITE);
            b10.setBackground(Color.DARK_GRAY);
            b10.setForeground(Color.WHITE);
            b11.setBackground(Color.DARK_GRAY);
            b11.setForeground(Color.WHITE);
            b12.setBackground(Color.ORANGE);
            b13.setBackground(Color.DARK_GRAY);
            b13.setForeground(Color.WHITE);
            b14.setBackground(Color.DARK_GRAY);
            b14.setForeground(Color.WHITE);
            b15.setBackground(Color.DARK_GRAY);
            b15.setForeground(Color.WHITE);
            b16.setBackground(Color.ORANGE);
            b17.setBackground(Color.DARK_GRAY);
            b17.setForeground(Color.WHITE);
            b18.setBackground(Color.DARK_GRAY);
            b18.setForeground(Color.WHITE);
            b19.setBackground(Color.DARK_GRAY);
            b19.setForeground(Color.WHITE);
            b20.setBackground(Color.MAGENTA);
            p1.setBackground(Color.BLACK);
            p2.setBackground(Color.BLACK);
            
        } else if (o.equals(mi2)) {

            tf.setBackground(Color.BLUE);
            b1.setBackground(Color.YELLOW);
            b2.setBackground(Color.YELLOW);
            b3.setBackground(Color.YELLOW);
            b4.setBackground(Color.YELLOW);
            b5.setBackground(Color.LIGHT_GRAY);
            b5.setForeground(Color.BLACK);
            b6.setBackground(Color.LIGHT_GRAY);
            b6.setForeground(Color.BLACK);
            b7.setBackground(Color.LIGHT_GRAY);
            b7.setForeground(Color.BLACK);
            b8.setBackground(Color.YELLOW);
            b9.setBackground(Color.LIGHT_GRAY);
            b9.setForeground(Color.BLACK);
            b10.setBackground(Color.LIGHT_GRAY);
            b10.setForeground(Color.BLACK);
            b11.setBackground(Color.LIGHT_GRAY);
            b11.setForeground(Color.BLACK);
            b12.setBackground(Color.YELLOW);
            b13.setBackground(Color.LIGHT_GRAY);
            b13.setForeground(Color.BLACK);
            b14.setBackground(Color.LIGHT_GRAY);
            b14.setForeground(Color.BLACK);
            b15.setBackground(Color.LIGHT_GRAY);
            b15.setForeground(Color.BLACK);
            b16.setBackground(Color.YELLOW);
            b17.setBackground(Color.LIGHT_GRAY);
            b17.setForeground(Color.BLACK);
            b18.setBackground(Color.LIGHT_GRAY);
            b18.setForeground(Color.BLACK);
            b19.setBackground(Color.LIGHT_GRAY);
            b19.setForeground(Color.BLACK);
            b20.setBackground(Color.RED);
            p1.setBackground(Color.WHITE);
            p2.setBackground(Color.WHITE);
            
            
            
        } else if (o.equals(b4)) {
            fv = tf.getText();
            tf.setText("");
            op = b4.getLabel();
        } else if (o.equals(b8)) {
            fv = tf.getText();
            tf.setText("");
            op = b8.getLabel();
        } else if (o.equals(b12)) {
            fv = tf.getText();
            tf.setText("");
            op = b12.getLabel();
        } else if (o.equals(b16)) {
            fv = tf.getText();
            tf.setText("");
            op = b16.getLabel();
        } else if (o.equals(b3)) {
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tot = fdv * 100;
            tf.setText(tot + "%");

        } else if (o.equals(b2)) {
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tot = Math.sqrt(fdv);
            tf.setText(String.valueOf(tot));

        } else if (o.equals(b1)) {

            tf.setText("");
            fv = tf.getText();

        } else if (o.equals(b20)) {
            sv = tf.getText();

            fdv = Double.parseDouble(fv);
            sdv = Double.parseDouble(sv);

            if (op.equals("+")) {

                tot = fdv + sdv;
                tf.setText(tot + " ");
            } else if (op.equals("-")) {
                tot = fdv - sdv;
                tf.setText(tot + " ");
            } else if (op.equals("÷")) {
                tot = fdv / sdv;
                tf.setText(tot + " ");
                sdv = tot;
            } else if (op.equals("×")) {
                tot = fdv * sdv;
                tf.setText(tot + " ");
//            }else if (op.equals("%")) {
//                
//                tot1 = sdv * 100;
//                tf.setText(tot1 + " ");
            }

        }

        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

public class Calculator {

    public static void main(String[] args) {

        new cal();

    }

}
