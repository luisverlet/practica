
package poopracticaconcesionaria;
import java.util.Scanner;

/**
 *
 * @author luisv
 */
public class Principal {

    public static void main(String[] args) {
        int b = 0;
        int d = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduzca nombre de la concesionaria");
        String nombre = scanner.next();
        System.out.println("Cantidad de autos a agregar");
        int canta = scanner.nextInt();
        System.out.println("Cantidad de motos a agregar");
        int cantm = scanner.nextInt();
        
        Consesionaria c = new Consesionaria(nombre);
        
        for (int i = 0; i < canta; i++) {
           
            b++;
            System.out.println("Introduzca placa de carro n "+b);
            String placaa = scanner.next();
            System.out.println("Introduzca modelo de carro n "+b);
            String modeloa = scanner.next();
            System.out.println("Introduzca valor1 de carro n "+b);
            int r1 = scanner.nextInt();
            System.out.println("Introduzca valor2 de carro n "+b);
            int r2 = scanner.nextInt();
            
            Auto auto = new Auto(placaa,modeloa,true,r1,r2);
            auto.sumar();
            c.agregarAuto(auto);
            auto.agregarPuerta(material,vidrio);

        }
        for (int i = 0; i < cantm; i++) {
           
            d++;
            System.out.println("Introduzca placa de moto n "+d);
            String placam = scanner.next();
            System.out.println("Introduzca modelo de moto n "+d);
            String modelom = scanner.next();
            System.out.println("Introduzca ancho de manubrio de vehiculo n "+d);
            int ancho = scanner.nextInt();
            
            c.agregarMoto(new Moto(modelom,placam,ancho));
            
            
        }
            System.out.println("Motos: ");
            c.mostrarMotos();
            System.out.println("Autos: ");
            c.mostrarAutos();
    }
    
}
