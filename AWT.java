import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AWT {
    AWT(){
        Frame f1= new Frame("Registration form");
        Label l1=new Label( "Sign in");
        l1.setBounds(600,150,100,20);

        Label l2=new Label( "Email");
        l2.setBounds(400,180,55,20);
        TextField t1 = new TextField();
        t1.setBounds(500,180,250,20);

        Label l3=new Label("password");
        l3.setBounds(400,210,55,20);
        TextField t2 = new TextField();
        t2.setBounds(500,210,250,20);

        Button b1=new Button( "Login");
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
        new AWT();
    }
}