/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author javie
 */
public class EliminarUsuario extends JFrame {
    
    public JPanel  panel;
     public JTextField texto1, texto2, texto3, texto4, texto5;
     
     private JButton crear;
     
     public EliminarUsuario(){
          setSize(500,400);
        setLocationRelativeTo(null);
        setTitle("ELIMINAR USUARIO");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        iniciarComponentes();
     }
     
     private void iniciarComponentes(){
        
         crearPanel();
         Botones();
         crearLabel();
         crearText();
         
        

    }
    
    private void crearPanel(){
    
        panel = new JPanel();
        panel.setLayout(null);
        
       // panel.setBackground(Color.ORANGE);
        this.getContentPane().add(panel);
    }
    
    private void crearLabel(){
    
        
        JLabel etiqueta2 = new JLabel();
        JLabel etiqueta3 = new JLabel();
        JLabel etiqueta4 = new JLabel();
        JLabel etiqueta5 = new JLabel();
       
        
        
       
        
        etiqueta2.setText("Nombre");
        etiqueta2.setBounds(50, 85, 50, 30);
        etiqueta3.setText("Apellido");
        etiqueta3.setBounds(50, 125, 50, 30);
        etiqueta4.setText("Usuario");
        etiqueta4.setBounds(50, 165, 50, 30);
        etiqueta5.setText("Rol");
        etiqueta5.setBounds(50, 205, 50, 30);
        
        
        
        
        panel.add(etiqueta2);
        panel.add(etiqueta3);
        panel.add(etiqueta4);
        panel.add(etiqueta5);
        
    }
    
    private void crearText(){
    
          texto1 = new JTextField();
          texto2 = new JTextField();
          texto3 = new JTextField();
          texto4 = new JTextField();
          texto5 = new JTextField();
        
        
        
         
        
        
        
        texto1.setBounds(250, 45, 200, 20);
        
        texto2.setBounds(250, 85, 200, 20);
        texto3.setBounds(250, 125,200, 20);
        texto4.setBounds(250, 165,200, 20);
        texto5.setBounds(250, 205, 200, 20);
        
        
        
        
        panel.add(texto1);
        panel.add(texto2);
        panel.add(texto3);
        panel.add(texto4);
        panel.add(texto5);
       
        
    }
    
    private void Botones(){
        crear = new JButton("Eliminar");
        crear.setBounds(100, 275, 100, 40);
       
        panel.add(crear);
        
        JButton cancelar = new JButton("Cancelar");
        cancelar.setBounds(310, 275, 100, 40);
        panel.add(cancelar);
        
        JButton buscar = new JButton("Buscar");
        buscar.setBounds(50, 45, 100, 30);
        panel.add(buscar);
    }
}
