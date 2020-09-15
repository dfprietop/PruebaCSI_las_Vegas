package PuntosGuia1;
import java.io.*;

public class Ejercicio2 {

    //preguntar al usuario el nombre el apellido, la dirección y el telefono almacenarlas en
    //sus respectivas variables, despues de ingresar los datos hacer la impresion de los datos en forma inversa
    public static void main(String[] args) 
    throws IOException
    {
        String nombre, apellido, direccion,telefono;
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingrese su nombre:\n");
        nombre = bf.readLine();
        System.out.println("Ingrese su apellido:\n");
        apellido = bf.readLine();
        System.out.println("Ingrese su direccion:\n");
        direccion = bf.readLine();
        System.out.println("Ingrese su telefono");
        telefono = bf.readLine();
        
        System.out.println("El orden inverso es;\n" + telefono + "\n" + direccion + "\n" + apellido + "\n" + nombre  );
        
        
    }
    
}
