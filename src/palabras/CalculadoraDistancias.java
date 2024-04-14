package palabras;
/**
     *@author Ivan Diaz
     * clase con los calculos necesarios para calcular la distancia
     */
public class CalculadoraDistancias {
    /**
     * Calcula la distancia de edición entre las cadenas `s1` y `s2`.
     * @param s1 palabra objetivo
     * @param s2 palabra a transformar
     * @return número mínimo de modificaciones
     */
    public static int calcularDistancia(String s1, String s2) {
        int[][] m = new int[s1.length() + 1][s2.length() + 1];

        // Inicializar la matriz para las filas y columnas iniciales
        for (int i = 0; i <= s1.length(); i++) {
            m[i][0] = i;
        }
        for (int j = 0; j <= s2.length(); j++) {
            m[0][j] = j;
        }

        // Llenar la matriz con los valores de distancia mínima
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    m[i][j] = m[i - 1][j - 1];
                } else {
                    m[i][j] = Math.min(Math.min(m[i][j - 1] + 1, m[i - 1][j] + 1), m[i - 1][j - 1] + 2);
                }
            }
        }

        // Devolver el valor en la esquina inferior derecha de la matriz
        return m[s1.length()][s2.length()];
    }
}

