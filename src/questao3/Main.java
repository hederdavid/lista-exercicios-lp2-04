package questao3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomesAnimais = new ArrayList<>();
        ArrayList<String> nomesAnimaisCincoLetrasOuMaior = new ArrayList<>();
        boolean valorCorreto = false;

        for (int i = 0; i < 10; i++) {
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

        int qtd = nomesAnimais.size();

        for (int i = 0; i < qtd; i++) {
            if (nomesAnimais.get(i).length() >= 5) {
                nomesAnimaisCincoLetrasOuMaior.add(nomesAnimais.get(i));
                nomesAnimais.remove(i);
                i--;
                qtd--;
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
