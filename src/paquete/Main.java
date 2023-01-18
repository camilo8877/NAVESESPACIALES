
package paquete;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main{
    

        public static void main(String[] args) {
        boolean naveDisponible;
            
        int seguir=1;
        while(seguir == 1){
        naveDisponible = Boolean.parseBoolean(JOptionPane.showInputDialog("Digite true si hay naves disponibles o si no false"));
        
      
    
         if(naveDisponible==true){   

        NaveTripulada vehiculo = new NaveTripulada(true,20, "Extra", 2000, 40, 20, "Aslam");
        vehiculo.tipo("tipoVehiculo");
        vehiculo.color("colorVehiculo");
        vehiculo.paisFabricacion();
        vehiculo.velocidad();
        vehiculo.volar();
        vehiculo.mostrarCaracteristicas();
        vehiculo.aterrizar();
        }
         else if(naveDisponible==false){
             System.out.println("No hay naves disponibles para su vuelo");
         }
         
            Scanner objsc = new Scanner(System.in);
            System.out.println("Tecle 1 para repetir el programa o 0 para salir");
            seguir = objsc.nextInt();
        
        }
      
    }

    
}


 