
package paquete;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class NaveNoTripulada extends VehiculoEspacial{
    public int horaVuelo;

    public NaveNoTripulada(int horaVuelo, String combustible, int potencia, int peso, int altura, String nombre) {
        super(combustible, potencia, peso, altura, nombre);
        this.horaVuelo = horaVuelo;
    }

    
    
    @Override
    public void volar(){
        Scanner vuelo = new Scanner (System.in);
        System.out.println("Ingrese la hora a la que desea su vuelo: ");
        String hora = vuelo.next();
        
        if(horaVuelo<11){
        System.out.println("Su horario de vuelo es diurno-mañana");
          
        }else if(horaVuelo>=18){
        System.out.println("Su horario de vuelo es nocturno");
                
               
        }else{
            System.out.println("Su horario de vuelo es diurno-tarde");
        }
    }
    
    
     @Override
    public void aterrizar(){
        System.out.println("Su aterrizaje será cómodo y en el tiempo deseado");
    }
   
   
    public void mostrarCaracteristicas(){
        System.out.println("VEHÍCULO TIPO Nave no tripulada");
        System.out.println("La hora de su vuelo es:  " + horaVuelo );
        System.out.println("El combustible utilzado por la nave es:  " + combustible);
        System.out.println("La potencia de la nave es:  " + potencia + "HP");
        System.out.println("El peso de la nave es:  " + peso + "TON");
        System.out.println("La altura de la nave es:  " + altura + "Metros");
        System.out.println("El nombre de la nave es:  " + nombre);
    }
    
    public String tipo(String tipoVehiculo){
            String vehiculoTipo = JOptionPane.showInputDialog("Digite tipo de vehículo que desea abordar");
            return vehiculoTipo; 
            
        }
     public String color(String colorVehiculo){
            String vehiculocolor = JOptionPane.showInputDialog("Digite tipo de color del vehículo que desea abordar");
            return vehiculocolor;      
        }
}
