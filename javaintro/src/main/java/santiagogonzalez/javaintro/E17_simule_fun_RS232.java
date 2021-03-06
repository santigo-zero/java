package santiagogonzalez.javaintro;

import java.util.Scanner;

public class E17_simule_fun_RS232 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useDelimiter("\n"); // Leer
        boolean fde = false; // Inicializo como false para que funcione el while
        String frase = null; // Inicializo esta cadena asi no queda como local del loop
        int correctas = 0; // Contador
        int incorrectas = 0; // Contador

        do { System.out.println("Dé una frase de 5 caracteres que empieze con X y termine con O");
            frase = reader.nextLine(); // Leemos la frase
            
            if (frase.equals("&&&&&")) {
                System.out.println("Esto marca el final de los envios (FDE)");
                fde = true;
            } else {
                fde = false;
		if ((frase.length() == 5) && (frase.substring(0, 1).equals("X")) && (frase.substring(4, 5).equals("O"))) {
			++correctas;
		} else {
			++incorrectas;
		}
            } 
        }   while (fde == false);

	System.out.println("Correctas: " + correctas);
	System.out.println("Incorrectas: " + incorrectas);
	// csj
    }
}
/* Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
 * tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
 * con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
 * carácter tiene que ser X y el último tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas, la
 * secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
 * secuencia distinta de FDE, que no respete el formato se considera incorrecta.
 * Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
 * correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
 * se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */