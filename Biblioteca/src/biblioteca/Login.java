/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author javie
 */
public class Login extends JFrame {
    
    public JPanel panel;
    
    public Login(){
        
        setSize(500,500);
        
        setTitle("LOGIN");
        
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200,200));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        iniciarComponentes();
        
    }
    
    private void iniciarComponentes(){
        
        llamarPanel();
        llamarLabel();
        llamarTextField();
        llamarBotones();
    }
    
    private void llamarPanel(){
    
        panel = new JPanel();
        panel.setLayout(null);
        
        this.getContentPane().add(panel);
        
        
    }
    private void llamarLabel(){
        
        ImageIcon imagen = new ImageIcon("usuario.png");//Foto de usario
        JLabel login = new JLabel ();
        login.setBounds(200, 20, 100, 100);
        login.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        
        
        panel.add(login);
        
        JLabel usuario = new JLabel("Usuario");
        usuario.setBounds(100, 170, 50, 15);
        panel.add(usuario);
        
         JLabel contra = new JLabel("Contraseñna");
        contra.setBounds(100, 230, 100, 15);
        panel.add(contra);
    }
    
    private void llamarTextField(){
            JTextField usuario = new JTextField();
            usuario.setBounds(200, 170, 200, 20);
            panel.add(usuario);
            
            JTextField contra = new JTextField();
            contra.setBounds(200, 230, 200, 20);
            panel.add(contra);
            
        
    }
    
    private void llamarBotones(){
    
        JButton ingresar = new JButton("Ingresar");
        ingresar.setBounds(150, 350, 100, 30);
        panel.add(ingresar);
        
        JButton cancelar = new JButton("Cancelar");
        cancelar.setBounds(310, 350, 100, 30);
        panel.add(cancelar);
        
    }
    
    
}
