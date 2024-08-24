import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignInPage extends JFrame implements ActionListener {
    private JPasswordField passwordField;
    private JTextField usernameField;
    SignInPage(){
        this.setTitle("Sign in Page");
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        AddComponents();
        this.setVisible(true);

    }

    private void AddComponents(){
        JPanel panel=new JPanel(new GridBagLayout());
        GridBagConstraints gbc=new GridBagConstraints();
gbc.insets=new Insets(10,10,10,10);
gbc.fill=GridBagConstraints.HORIZONTAL;

       JLabel title=new JLabel("Sign in Form",SwingConstants.CENTER);
       title.setFont(new Font("Arial", Font.BOLD,24));
       gbc.gridx=0;
       gbc.gridy=0;
       gbc.gridwidth=2;
       panel.add(title,gbc);

       JLabel username=new JLabel("Username");
       username.setFont(new Font("Arial",Font.BOLD,15));
       gbc.gridx=0;
       gbc.gridy=1;
       gbc.gridwidth=1;
       panel.add(username,gbc);

        JLabel password=new JLabel("Password");
        password.setFont(new Font("Arial",Font.BOLD,15));
        gbc.gridx=0;
        gbc.gridy=2;
        panel.add(password,gbc);

        usernameField=new JTextField(20);
        gbc.gridx=1;
        gbc.gridy=1;
        panel.add(usernameField,gbc);

        passwordField=new JPasswordField(20);
        gbc.gridx=1;
        gbc.gridy=2;
        panel.add(passwordField,gbc);


        JButton button=new JButton("Click me");
        gbc.gridx=0;
        gbc.gridy=3;
        gbc.gridwidth=2;
        button.setBackground(new Color(13,110,253));
        button.setForeground(Color.white);
        button.addActionListener(this);
        panel.add(button,gbc);

// Action event

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String username=usernameField.getText();
        String password=new String(passwordField.getPassword());
        if(username.equals("")| password.equals("")){
            JOptionPane.showMessageDialog(this,"Fields must be filled!");
        }
        else{
            JOptionPane.showMessageDialog(this,"Welcome!\n"+"Your password is:"+password+"\n"+"Your username is:"+username);
        }




    }

}






















