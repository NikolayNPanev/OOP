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

        b.addActionListener(e -> {
            System.out.println("kek, boutoun clicked");
        });

        //////////////////////////////
        //  ADD COMPONENTS TO FRAME //
        //////////////////////////////
        f.add(b);


        ////////////////////
        //  FRAME LAYOUT  //
        ////////////////////
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setUndecorated(true);
        f.setLayout(null);
        f.setVisible(true);


    }
}