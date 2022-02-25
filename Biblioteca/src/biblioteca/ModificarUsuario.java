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
public class ModificarUsuario extends Usuario {
    
     public JPanel  panel;
     public JTextField texto1, texto2, texto3, texto4;
     private JPasswordField texto6, texto7;
     private JButton crear;
     private JComboBox rol;
     private String[] roles = {"Estudiante","Catedrático"};
     
    public ModificarUsuario(){
    
         setSize(500,500);
        setLocationRelativeTo(null);
        setTitle("MODIFICAR USUARIO");
        
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
        JLabel etiqueta6 = new JLabel();
        JLabel etiqueta7 = new JLabel();
        
        
       
        
        etiqueta2.setText("Nombre");
        etiqueta2.setBounds(50, 85, 50, 30);
        etiqueta3.setText("Apellido");
        etiqueta3.setBounds(50, 125, 50, 30);
        etiqueta4.setText("Usuario");
        etiqueta4.setBounds(50, 165, 50, 30);
        etiqueta5.setText("Rol");
        etiqueta5.setBounds(50, 205, 50, 30);
        etiqueta6.setText("Contraseña");
        etiqueta6.setBounds(50, 245, 100, 30);
        etiqueta7.setText("Confirmar contraseña");
        etiqueta7.setBounds(50, 285, 200, 30);
        
        
        
        panel.add(etiqueta2);
        panel.add(etiqueta3);
        panel.add(etiqueta4);
        panel.add(etiqueta5);
        panel.add(etiqueta6);
        panel.add(etiqueta7);
    }
    
    private void crearText(){
    
          texto1 = new JTextField();
          texto2 = new JTextField();
          texto3 = new JTextField();
          texto4 = new JTextField();
          rol = new JComboBox(roles);
        
        
        
         texto6 = new JPasswordField();
         texto7 = new JPasswordField();
        
        
        
        texto1.setBounds(250, 45, 200, 20);
        
        texto2.setBounds(250, 85, 200, 20);
        texto3.setBounds(250, 125,200, 20);
        texto4.setBounds(250, 165,200, 20);
        rol.setBounds(250, 205, 100, 20);
        
        texto6.setBounds(250, 245,200, 20);
       
        texto7.setBounds(250, 285,200, 20);
        
        
        panel.add(texto1);
        panel.add(texto2);
        panel.add(texto3);
        panel.add(texto4);
        panel.add(rol);
        panel.add(texto6);
        panel.add(texto7);
        
    }
    
    private void Botones(){
        crear = new JButton("Crear");
        crear.setBounds(100, 350, 100, 40);
       
        panel.add(crear);
        
        JButton cancelar = new JButton("Cancelar");
        cancelar.setBounds(310, 350, 100, 40);
        panel.add(cancelar);
        
        JButton buscar = new JButton("Buscar");
        buscar.setBounds(50, 45, 100, 30);
        panel.add(buscar);
    }
   
}
