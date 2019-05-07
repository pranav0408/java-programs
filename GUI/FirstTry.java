import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Handler implements ActionListener{
    public void actionPerformed( ActionEvent a ){
        if(a.getSource() == FirstTry.reset){
            FirstTry.text.setText(null);
            FirstTry.pass.setText(null);
        }
    }
}   

class FirstTry{

        static JFrame jf = new JFrame();
        static JTextField text = new JTextField(20);
        static JPasswordField pass = new JPasswordField(20);
        static JButton reset = new JButton("Reset");

        void myGUI(){
            jf.add(text);
            jf.add(pass);
            jf.add(reset);
            jf.setLocationRelativeTo(null);

            jf.setLayout(null);
            jf.setSize(200,400);
            jf.setVisible(true);
            text.setBounds(10,10,160,20);
            pass.setBounds(10,40,160,20);
            reset.setBounds(40,100,100,30);
            pass.setEchoChar('*');

            jf.getContentPane().setBackground(Color.LIGHT_GRAY);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //action listener
            Handler h = new Handler();
            reset.addActionListener(h);
        }
    public static void main(String[] args) {
        FirstTry ob = new FirstTry();
        ob.myGUI();
    }        
}