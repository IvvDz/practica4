package aplicacion;

import mates.Matematicas;
import maths.CalculadoraDistancias;

public class Principal {
    public static void main(String[] args) {
        // Definimos dos palabras para calcular la distancia de edición
        String palabra1 = "casa";
        String palabra2 = "caja";

        // Calculamos y mostramos la distancia de edición utilizando la implementación de Matematicas.distance
        System.out.println("Distancia de edición entre '" + palabra1 + "' y '" + palabra2 + "' (usando Matematicas.distance): " + Matematicas.distance(palabra1, palabra2));

        // Calculamos y mostramos la distancia de edición utilizando la implementación de CalculadoraDistancias.calcularDistancia
        System.out.println("Distancia de edición entre '" + palabra1 + "' y '" + palabra2 + "' (usando CalculadoraDistancias.calcularDistancia): " + CalculadoraDistancias.calcularDistancia(palabra1, palabra2));
    }
}

