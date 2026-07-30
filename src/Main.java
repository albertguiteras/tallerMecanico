/*TALLER MECANICO
tenemos un taller mecanico con algunas propiedades:
- nombre del taller
- persona de contacto
- telefono
- lista de servicios

A partir de ahí:
- crear los metodos tipicos
- crear méto-do extra que solo diga persona de contacto y telefono

En el main:
- instanciar al menos 3 talleres para la agenda de talleres
- Recorrer todos los talleres para mostrar todos los datos
- mostrar solo nombres y telefonos
- buscar un nombre de taller en especifico

-EXTRA: preguntar datos al usuario*/

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Taller t1 = new Taller("Taller Bueno", "Paco", 600300500, new ArrayList<String>(Arrays.asList("ruedas", "extras")));
        Taller t2 = new Taller("Taller Malo", "Pedro", 700300500, new ArrayList<String>(Arrays.asList("ruedas", "frenos", "extras")));
        Taller t3 = new Taller("Taller Caro", "Fernando", 800300500, new ArrayList<String>(Arrays.asList("ruedas", "frenos", "dirección", "extras")));

        System.out.println(t1);
        t1.nombrePrecio();

    }
}
