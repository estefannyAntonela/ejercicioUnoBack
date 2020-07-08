/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author esalcedo
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static int valor = 2;
    public static int cont = 0;

    public static void main(String[] args) {
        System.out.println("Primeros 10 numeros primos: ");
        while (cont < 10) {
            if (esPrimo()) {
                System.out.println(valor);
                cont++;
            }
            valor++;
        }
    }

    private static boolean esPrimo() {
        for (int div = 2; div < valor; div++) {
            if (valor % div == 0) {
                return false;
            }
        }
        return true;
    }

}
