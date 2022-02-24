/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author javie
 */
public class CargaIndividual extends JFrame {
    
    public JPanel panel;
    
    public CargaIndividual(){
    
        setSize(650, 450);
        setTitle("CARGA INDIVIDUAL");
        setLocationRelativeTo(null);
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
        JLabel tipo = new JLabel("Tipo");
        tipo.setBounds(40, 20, 100, 20);
        panel.add(tipo);
        
        JLabel autor = new JLabel("Autor");
        autor.setBounds(40, 70, 100, 20);
        panel.add(autor);
        
        JLabel titulo = new JLabel("Título");
        titulo.setBounds(40, 120, 100, 20);
        panel.add(titulo);
        
        JLabel edicion = new JLabel("Edición");
        edicion.setBounds(40, 170, 100, 20);
        panel.add(edicion);
        
        JLabel desc = new JLabel("Descripción");
        desc.setBounds(40, 220, 100, 20);
        panel.add(desc);
        
        JLabel temas = new JLabel("Temas");
        temas.setBounds(40, 270, 100, 20);
        panel.add(temas);
        
         JLabel fre = new JLabel("Frecuencia");
        fre.setBounds(340, 70, 100, 20);
        panel.add(fre);
        
        JLabel ejem = new JLabel("Ejemplares");
        ejem.setBounds(340, 120, 100, 20);
        panel.add(ejem);
        
        JLabel copias = new JLabel("Copias");
        copias.setBounds(340, 170, 100, 20);
        panel.add(copias);
        
        JLabel dis = new JLabel("Disponibles");
        dis.setBounds(340, 220, 100, 20);
        panel.add(dis);
        
    }
    
    private void llamarTextField(){
        JComboBox tipo = new JComboBox();
        tipo.setBounds(140, 20, 100, 20);
        tipo.addItem("Libros");
        tipo.addItem("Revistas");
        tipo.addItem("Tesis");
        panel.add(tipo);
        
        JTextField autor = new JTextField();
        autor.setBounds(140, 70, 150, 20);
        panel.add(autor);
        
        JTextField titulo = new JTextField();
        titulo.setBounds(140, 120, 150, 20);
        panel.add(titulo);
        
        JTextField edicion = new JTextField();
        edicion.setBounds(140, 170, 150, 20);
        panel.add(edicion);
        
        JTextField desc = new JTextField();
        desc.setBounds(140, 220, 150, 20);
        panel.add(desc);
        
        JTextField temas = new JTextField();
        temas.setBounds(140, 270, 150, 20);
        panel.add(temas);
        
        JTextField fre = new JTextField();
        fre.setBounds(440, 70, 150, 20);
        panel.add(fre);
        
        JTextField ejem = new JTextField();
        ejem.setBounds(440, 120, 150, 20);
        panel.add(ejem);
        
        JTextField  copias = new JTextField();
        copias.setBounds(440, 170, 150, 20);
        panel.add(copias);
        
        JTextField dis = new JTextField();
        dis.setBounds(440, 220, 150, 20);
        panel.add(dis);
        
    }
    
    private void llamarBotones(){
    
        JButton crear = new JButton("Crear");
        crear.setBounds(120, 330, 100, 30);
        panel.add(crear);
        
        JButton atras = new JButton("Atrás");
        atras.setBounds(420, 330, 100, 30);
        panel.add(atras);
    }
    
    
    
    
}
