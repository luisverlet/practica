
package poopracticaconcesionaria;

import java.util.ArrayList;

/**
 *
 * @author luisv
 */
public class Consesionaria {
    
    private String nombre;
    private ArrayList<Auto> autos;
    private ArrayList<Moto> motos;

    public Consesionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();
        this.motos = new ArrayList<>();
    }
    
    public void agregarAuto(Auto a){
        this.autos.add(a);
    }
    
    public void mostrarAutos(){
            if (autos.isEmpty()) {
                System.out.println("No hay carros uwu");
        }else{
                /*for (int i = 0; i < autos.size(); i++) {
                    System.out.println(autos.get(i));
                }*/
                
                for (Auto a : autos) {
                    System.out.println(a);
                }
            }
    }
  
    
    
    public void agregarMoto(Moto a){
        this.motos.add(a);   
    }
    public void mostrarMotos(){
            if (motos.isEmpty()) {
                System.out.println("No hay motos uwu");
        }else{
                for (Moto a : motos) {
                    System.out.println(a);
                }
            }
    }
  
}
