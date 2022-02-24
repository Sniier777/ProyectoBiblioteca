/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author javie
 */
public class Administrador extends JFrame {
    
    public JPanel panelp, panellog, panelr, panelu, panelb;
    
    public Administrador(){
        setSize(1000, 600);
        setTitle("ADMINISTRADOR");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        iniciarComponentes();
    
    }
    
    private void iniciarComponentes(){
        
        llamarPanel();
        llamarLabel();
        llamarBotones();
    }
    
    private void llamarPanel(){
        
        panelp = new JPanel();
        panelp.setLayout(null);
        
        this.getContentPane().add(panelp);
        
        panellog = new JPanel();
        panellog.setLayout(null);
        panellog.setBackground(Color.lightGray);
        panellog.setBounds(500, 30, 440, 100);
        panelp.add(panellog);
        
        panelr = new JPanel();
        panelr.setLayout(null);
        panelr.setBackground(Color.LIGHT_GRAY);
        panelr.setBounds(500, 140, 440, 100);
        panelp.add(panelr);
        
        panelu = new JPanel();
        panelu.setLayout(null);
        panelu.setBackground(Color.lightGray);
        panelu.setBounds(30, 280, 440, 200);
        panelp.add(panelu);
        
        panelb = new JPanel();
        panelb.setLayout(null);
        panelb.setBackground(Color.lightGray);
        panelb.setBounds(500, 280, 440, 200);
        panelp.add(panelb);
        
    }
    
    private void llamarLabel(){
        
        ImageIcon imagen = new ImageIcon("logo.png");
        JLabel logoad = new JLabel();
        logoad.setBounds(30, 30, 440, 200);
        logoad.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(440, 200, Image.SCALE_SMOOTH)));
        panelp.add(logoad);
        
        ImageIcon logout = new ImageIcon("usuario.png");
        JLabel out = new JLabel();
        out.setBounds(60, 10, 80, 80);
        out.setIcon(new ImageIcon(logout.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
        panellog.add(out);
        
        JLabel reportes = new JLabel("Reportes");
        reportes.setBounds(20, 10, 100, 20);
        reportes.setFont(new Font("Arial",0,17));
        panelr.add(reportes);
        
        JLabel usuarios = new JLabel("Usuarios");
        usuarios.setBounds(20, 10, 100, 20);
        usuarios.setFont(new Font("Arial",0,17));
        panelu.add(usuarios);
        
        JLabel biblio = new JLabel("Bibliografía");
        biblio.setBounds(20, 10, 100, 20);
        biblio.setFont(new Font("Arial",0,17));
        panelb.add(biblio);
    }
    
    private void llamarBotones(){
        
        JButton logout = new JButton("Logout");//Boton del panel logout
        logout.setBounds(300, 30, 100, 40);
        panellog.add(logout);
        
        JButton usuarios = new JButton("Usuarios");//Botoenes del panel reportes
        usuarios.setBounds(35, 50, 100, 30);
        panelr.add(usuarios);
       
        JButton biblio = new JButton("Bibliografía");
        biblio.setBounds(165, 50, 100, 30);
        panelr.add(biblio);
        
        JButton prestamos = new JButton("Préstamos");
        prestamos.setBounds(305, 50, 100, 30);
        panelr.add(prestamos);
        
        JButton crear = new JButton("Crear");//Botones del panel Usuarios
        crear.setBounds(70, 50, 100, 40);
        panelu.add(crear);
        
        JButton ver = new JButton("Ver");
        ver.setBounds(270, 50, 100, 40);
        panelu.add(ver);
        
        JButton modificar = new JButton("Modificar");
        modificar.setBounds(70, 140, 100, 40);
        panelu.add(modificar);
        
        JButton eliminar = new JButton("Eliminar");
        eliminar.setBounds(270, 140, 100, 40);
        panelu.add(eliminar);
        
        JButton crearb = new JButton("Crear");//Botones del panel bibliografía
        crearb.setBounds(70, 50, 100, 40);
        panelb.add(crearb);
        
        JButton verb = new JButton("Ver");
        verb.setBounds(270, 50, 100, 40);
        panelb.add(verb);
        
        JButton modificarb = new JButton("Modificar");
        modificarb.setBounds(70, 140, 100, 40);
        panelb.add(modificarb);
        
        JButton eliminarb = new JButton("Eliminar");
        eliminarb.setBounds(270, 140, 100, 40);
        panelb.add(eliminarb);
        
        
    }
    
    
}
