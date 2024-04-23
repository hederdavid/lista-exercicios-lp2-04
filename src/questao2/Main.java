package questao2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collection<Integer> numeros = new ArrayList<>();
        Collection<Integer> numerosPrimeiroEUltimoIguais = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Insira um número: ");
            numeros.add(sc.nextInt());
        }

        Iterator<Integer> t1 = numeros.iterator();

        while (t1.hasNext()) {
            Integer numero = t1.next();
            if ( getNumeroReverso(numero) % 10 == numero % 10 ) {
                numerosPrimeiroEUltimoIguais.add(numero);
                t1.remove();
            }
        }

        System.out.println("Lista de numeros 1:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("Lista de numeros 2:");
        for (Integer numero : numerosPrimeiroEUltimoIguais) {
            System.out.println(numero);
        }
    }

    public static int getNumeroReverso(int n) {
        int ultimoDigito;
        int nReverso = 0;
        while (n != 0) {
            ultimoDigito = n % 10;
            nReverso = nReverso * 10 + ultimoDigito;
            n = n / 10;
        }
        return nReverso;
    }
}
