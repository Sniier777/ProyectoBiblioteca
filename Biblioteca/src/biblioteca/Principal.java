/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author javie
 */
public class Principal extends JFrame{
    
    public JPanel panel, panel2;
   
    
    public Principal(){
    
        setSize(1000,600);
        setTitle("BIBLIOTECA USAC");
        
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200,200));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        iniciarComponentes();
        
    }
    
    private void iniciarComponentes(){
        
        llamarPanel();
        llamarLabel();
        llamarBoton();
        llamarArea();
        
    }
    
    private void llamarPanel(){
       
       panel = new JPanel(); //Panel principal
       
       panel.setLayout(null);
       this.getContentPane().add(panel);
       
       panel2 = new JPanel();//Panel secundario
       
       panel2.setLayout(null);
       panel2.setBackground(Color.LIGHT_GRAY);
       panel2.setBounds(30, 30, 940, 90);
       panel.add(panel2);
       
   }
   
    private void llamarLabel(){
   
       ImageIcon usuario = new ImageIcon("usuario.png");//foto de usuario
       JLabel login = new JLabel();
       
       login.setBounds(70, 10, 100, 70);
       login.setIcon(new ImageIcon(usuario.getImage().getScaledInstance(100, 70, Image.SCALE_SMOOTH)));
       
       panel2.add(login);
       
       ImageIcon logo = new ImageIcon("logo.png");//foto del logo
       JLabel loginl = new JLabel();
       
       
       loginl.setBounds(30, 200, 530, 200);
       loginl.setIcon(new ImageIcon(logo.getImage().getScaledInstance(530, 200, Image.SCALE_SMOOTH)));
       
       panel.add(loginl);
       
       JLabel vision = new JLabel("Visión");//Titulo de Vision
     
       vision.setBounds(580, 200, 100, 20);
       vision.setFont(new Font("Arial",0,20));
       
       panel.add(vision);
   }
    
    private void llamarBoton(){
    
        JButton login = new JButton("Login");//Botón de login
        
        login.setBounds(770, 25, 100, 30);
        
        panel2.add(login);
        
        JButton about = new JButton("About");//Botón about
        about.setBounds(30, 500, 100, 30);
        
        panel.add(about);
        
    }
    
    private void llamarArea(){
    
        JTextArea vision = new JTextArea();//Area de texto de vision
        vision.setOpaque(false);
        vision.setBounds(580, 230, 460, 200);
        vision.setText("Ser la unidad de información especializada y");
        vision.append("\ntécnica, con estándares de Biblioteca"+"\nUniversitaria en beneficio del desarrollo de"
        +"\nla ciencia y la tecnología del país");
        vision.setFont(new Font("Arial",0,15));
        vision.setEditable(false);
    
        panel.add(vision);
    }
   
   
    
}
