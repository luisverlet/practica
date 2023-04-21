
package poopracticaconcesionaria;

/**
 *
 * @author luisv
 */
public class Auto extends Vehiculo{
    
   /* private String Modelo;
    private String Placa;*/
    
    private boolean Aire;
    
    
    void prenderAire(){
        System.out.println("encendiendo aire");
        Aire = true;
    }
    
    void apagarAire(){
        System.out.println("apagando aire");
        Aire = false;
    }

    public Auto(String Modelo, String Placa, boolean Aire, int v1, int v2) {
        this.Modelo = Modelo;
        this.Placa = Placa;
        this.Aire = Aire;
        this.v1 = v1;
        this.v2 = v2;
 
        
    }
    public void agregarPuerta(){
        Puerta p = new Puerta();
   
        p.material = "webo";
        p.vidrio = true;
    }

    
    public void sumar(){
       v3 = v1 + v2;
    }

    @Override
    public String toString() {
        return "Auto{" + "Modelo=" + Modelo + ", Placa=" + Placa + ", Aire=" + Aire + v3 +'}';
    }
    

    
    
}
