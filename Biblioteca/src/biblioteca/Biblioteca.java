/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author javie
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal ventana = new Principal();
        
        ventana.setVisible(false);
        
        Login login = new Login();
        login.setVisible(false);
        
        Administrador admin = new Administrador();
        admin.setVisible(false);
        
        CargaIndividual individual = new CargaIndividual();
        individual.setVisible(true);
        
    }
    
}
