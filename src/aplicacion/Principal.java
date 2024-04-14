package aplicacion;

import palabras.CalculadoraDistancias;

public class Principal { 
    public static void main(String[] args) {
        // Definimos dos palabras para calcular la distancia de edición
        String palabra1 = "casa";
        String palabra2 = "caja";

        // Calculamos y mostramos la distancia de edición utilizando la implementación de CalculadoraDistancias.calcularDistancia
        System.out.println("Distancia de edición entre '" + palabra1 + "' y '" + palabra2 + "': " + CalculadoraDistancias.calcularDistancia(palabra1, palabra2));
    }
}

