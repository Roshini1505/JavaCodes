import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class swing {
    swing(){
        JFrame f1= new JFrame("Registration form");
        JLabel l1=new JLabel( "Sign in");
        l1.setBounds(600,150,100,20);

        JLabel l2=new JLabel( "Email");
        l2.setBounds(400,180,55,20);
        JTextField t1 = new JTextField();
        t1.setBounds(500,180,250,20);

        JLabel l3=new JLabel("password");
        l3.setBounds(400,210,60,20);
        JTextField t2 = new JTextField();
        t2.setBounds(500,210,250,20);

        JButton b1=new JButton( "Login");
        b1.setBounds(500,250,200,40);

        //Button b2=new Button( "help");
        //Label l4=new Label( "Forgetpassword");

        ActionListener login = new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println(t1.getText());
                System.out.println(t2.getText());
            }
        };
        b1.addActionListener(login);
        f1.add(l1);
        f1.add(l2);
        f1.add(t1);
        f1.add(l3);
        f1.add(t2);
        f1.add(b1);
        //f1.add(b2);
        //f1.add(l4);
        f1.setLayout(null);
        f1.setVisible(true);//shows the button
        f1.setSize( 50, 100);
    }
    public static void main(String args[]){
        new swing();
    }
}