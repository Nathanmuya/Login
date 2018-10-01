
package system_login;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

        
/**
 *
 * @author NATE_
 */
public class System_login {
    
    private JFrame myframe;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame myframe = new JFrame("Login System");
        JPanel mypanel = new JPanel();
        JPanel panel = new JPanel();
        JButton mybutton = new JButton();
        JLabel usernameLabel = new JLabel("Username");
        JTextField txtUsername = new JTextField();
        txtUsername.setColumns(40);
        JLabel passwordLabel = new JLabel("Password");
        JTextField txtPassword= new JTextField();
        txtPassword.setColumns(40);
        JButton login = new JButton("Login");
        JButton exit = new JButton("exit");
        
        //To set Username and Password
        String Username;
        String Password;
        Password="STRATHMOREUNIVERSITY";
        Username="BOSS";
        System.out.println(usernameLabel);
        System.out.println(passwordLabel);
        
        //To set Panel Sizes
        usernameLabel.setBounds(50,70,80,30);
        txtUsername.setBounds(50, 100, 160, 50);
        passwordLabel.setBounds(40, 80, 180, 40);
        txtPassword.setBounds(40,200,180,40);
        login.setBounds(150, 300, 200, 10);
        exit.setBounds(50, 300, 100, 10);
        
        
        
        myframe.setVisible(true);//Frame will be visible
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        //To set Panels
        myframe.add(mypanel);
        myframe.setBounds(60, 190, 300, 350);
        mypanel.add(usernameLabel);
        mypanel.add(txtUsername);
        mypanel.add(passwordLabel);
        mypanel.add(login);
        mypanel.add(exit);
        




        
        
        
        
        
        
        
        
        
        
    }
    
}
