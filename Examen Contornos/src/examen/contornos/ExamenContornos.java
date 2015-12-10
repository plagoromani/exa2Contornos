/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.contornos;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class ExamenContornos {

    /**
     * @param args the command line arguments
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean p = false;

    public static void main(String arg[]) {
        int digito = pedirNumero();
        int numerodigitos = 0;
        if (digito <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int i = 1; i <= 99999; i++) {
            int aux = i;

            int contadorx = 0;

            contadorx = División(aux, contadorx);
            
            numerodigitos = contadorx;

            if (numerodigitos == digito) {
                if (i < 4) {
                    p = true;
                } else {
                    if (i % 2 == 0) {
                        p = false;
                    } else {
                        int contadorx1 = 0;
                        int i1 = 1;
                        int k = (i - 1) / 2;
                        if (k % 2 == 0) {
                            k--;
                        }

                        while (i1 <= k) {
                            if (i % i1 == 0) {
                                contadorx1++;
                            }
                            i1 = Suma(i1, contadorx1, k);
                        }

                        if (contadorx1 == 1) {
                            p = true;
                        }
                    }
                }

                if (p == true) {
                    System.out.println(i);
                }
            }
        }
    }

    public static int Suma(int i1, int contadorx1, int k) {
        i1 += 2;
        if (contadorx1 == 2) {
            i1 = k + 1;
        }
        return i1;
    }

    public static int División(int aux, int contadorx) {
        while (aux != 0) {
            aux = aux / 10;
            contadorx++;
        }
        return contadorx;
    }


    public static int pedirNumero(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
        return numero;
    }
    
}