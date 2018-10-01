import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author NATE_
 */
public class Registration {
    
    static JTextField name_txt;
    static JTextField fname_txt;
    static JTextField lname_txt;
    static  JRadioButton male;
    static JRadioButton female;
    private static Object add_txtArea;
    public static void main(=String args[]){
        
        //Make Frame with JFrame Class
        JFrame = new JFrame("Registartion Form");
        frame.setVisible(true);//Frame visibility
        frame.setBounds(300,200,800,700);//Frame location
        frame.setDefaultCloseOperatioj(JFrame.EXIT_ON_CLOSE);
        
        //FName JLabel and JTextFeild
        JLabel FName_lbl=new JLabel("First Name :");
        Fname_lbl.setBounds(70,100,130,50);
        c.add(Fname_lbl);
        name_txt=new JTextField();
        c.add(name_txt);
        name_txt.setBounds(200,100,160,50);
        
        //LName JLabel and JTextField
        JLabel LName_lbl=new JLabel("Last Name");
        LName_lbl.setBounds(70,150,180,50);
        c.add(LName_lbl);
        lname_txt=new JTextField();
        c.add(lname_txt);
        lname_txt.setBounds(200, 150, 160, 50);
        
        //Male and Female JRadionButton
        
                
        
    }
    
}
