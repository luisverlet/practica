
package poopracticaconcesionaria;

public class Moto extends Vehiculo {
    
    private int anchoManubrio;
    
    void hacerCaballito(){
        System.out.println("Hace caballito");
    }
    
    public Moto(String Modelo, String Placa, int anchoManubrio){
        this.Modelo = Modelo;
        this.Placa = Placa;
        this.anchoManubrio = anchoManubrio;
        this.v1 = v1;
        this.v2 = v2;
        
    }
    public void restar(int v3){
       v3 = v1 - v2;
    }

    @Override
    public String toString() {
        return "Moto{" + "anchoManubrio=" + anchoManubrio + "Modelo=" + Modelo + "Placa=" + Placa +'}';
    }
    
}


