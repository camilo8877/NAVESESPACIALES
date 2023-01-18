
package paquete;

public abstract class VehiculoEspacial {
    
    public String combustible;
    public int potencia, peso, altura;
    protected String nombre;

    public VehiculoEspacial(String combustible, int potencia, int peso, int altura, String nombre) {
        this.combustible = combustible;
        this.potencia = potencia;
        this.peso = peso;
        this.altura = altura;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
  
    public abstract void volar();
    
    
    public abstract void aterrizar();
    
    
     

   
    
    
    
    
}
