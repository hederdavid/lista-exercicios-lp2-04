package questao4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collection<String> nomesAnimais = new ArrayList<>();
        Collection<String> nomesAnimaisCincoLetrasOuMaior = new ArrayList<>();
        Iterator<String> t2 = null;
        boolean valorCorreto = false;

        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("Insira o " + (i + 1) +  "º animal: ");
                String nomeAnimal = sc.next().toLowerCase();

                if (nomesAnimais.contains(nomeAnimal)) {
                    System.out.println("Animal já inserido!!");
                } else {
                    nomesAnimais.add(nomeAnimal);
                    valorCorreto = true;
                }
            } while (!valorCorreto);

            valorCorreto = false;
        }

        Iterator<String> t1 = nomesAnimais.iterator();

        while (t1.hasNext()) {
            String animal = t1.next();
            if (animal.length() >= 5) {
                nomesAnimaisCincoLetrasOuMaior.add(animal);
                t1.remove();
            }
        }

        System.out.println("Lista de animais 1:");
        for (String animal : nomesAnimais) {
            System.out.println(animal);
        }

        System.out.println("Lista de animais 2:");
        for (String animal : nomesAnimaisCincoLetrasOuMaior) {
            System.out.println(animal);
        }
    }
}
