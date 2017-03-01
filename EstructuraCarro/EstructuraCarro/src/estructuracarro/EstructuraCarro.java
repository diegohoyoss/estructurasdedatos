/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuracarro;

import estructuravehiculo.objeto.vehiculo;

/**
 *
 * @author diego hoyos 
 */
public class EstructuraCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        vehiculo AudiR8 = new vehiculo( );
        
        AudiR8.setColor("negro"); 
        AudiR8.setModelo("2017");
        AudiR8.setPlaca("ytd20c");
        AudiR8.setNumeroSoat("10998846");
        
        System.out.println("color: "  + AudiR8.getColor() + "\n" + "modelo: " + AudiR8.getModelo() + "\n" + "placa: "
                          + AudiR8.getPlaca() + "\n" + "numeroSoat: " + AudiR8.getNumeroSoat() + "\n");
    }
    
}
