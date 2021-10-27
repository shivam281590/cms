
package cms;

import javax.swing.*;
import java.awt.*;
public class Login {
    public void adminPage()
    {   
        JFrame jf=new JFrame("Login Page");
        jf.setVisible(true);
        jf.setBounds(200,150,500,300);
        jf.setResizable(false);
        jf.setLayout(null);
        jf.getContentPane().setBackground(Color.WHITE);
       //Admin image
       ImageIcon img1=new ImageIcon("D:\\java\\College Management System\\src\\image\\ad.png");
        Image i2=img1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT );
        ImageIcon i3=new ImageIcon(i2);
        JLabel jl=new JLabel(i3);
        jl.setBounds(0,0,200,250);
        jf.add(jl);
        //Username image
        ImageIcon us=new ImageIcon("D:\\java\\College Management System\\src\\image\\us.png");
        Image imu=us.getImage().getScaledInstance(25,30,Image.SCALE_DEFAULT);
        ImageIcon icus=new ImageIcon(imu);
        JLabel lus=new JLabel(icus);
        lus.setBounds(250,75,30,35);
        jf.add(lus);
        // Password Image
        ImageIcon ps=new ImageIcon("D:\\java\\College Management System\\src\\image\\l.png");
        Image imp=ps.getImage().getScaledInstance(25,30,Image.SCALE_DEFAULT);
        ImageIcon icps=new ImageIcon(imp);
        JLabel lps=new JLabel(icps);
        lps.setBounds(250,125,30,35);
        jf.add(lps);
        //Text Field
        JTextField tf=new JTextField();
        tf.setBounds(285,78,140,27);
        jf.add(tf);
        // password
        JPasswordField jp=new JPasswordField();
        jp.setBounds(285,128,140,27);
        jf.add(jp);
        //Button
        JButton jb=new JButton("Login");
        jb.setBackground(Color.BLACK);
        jb.setForeground(Color.WHITE);
        jb.setBounds(275,178,75,20);
        Font font=new Font("Arial",Font.BOLD,11);
        jb.setFont(font);
        jf.add(jb);
        //button forget
         JButton jbf=new JButton("Forget");
        jbf.setBackground(Color.BLACK);
        jbf.setForeground(Color.WHITE);
        jbf.setBounds(360,178,75,20);
       // Font font=new Font("Arial",Font.BOLD,11);
        jbf.setFont(font);
        jf.add(jbf);
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String ar[])
    {   Login l=new Login();
        l.adminPage();
    }
    
    
}
