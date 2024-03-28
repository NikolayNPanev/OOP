import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /////////////////////////
        //  CREATE COMPONENTS  //
        /////////////////////////

        JFrame f = new JFrame();
        JButton b = new JButton("click");
        b.setBounds(100,100,100,50);



        ///////////////////////
        //  COMPONENT LOGIC  //
        ///////////////////////


        //////////////////////////////
        //  ADD COMPONENTS TO FRAME //
        //////////////////////////////
        f.add(b);


        ////////////////////
        //  FRAME LAYOUT  //
        ////////////////////
        f.setSize(600,400);
        f.setLayout(null);
        f.setVisible(true);


    }
}