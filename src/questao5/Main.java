package questao5;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Contato> listaDeContatos = new ArrayList<>();
        int opcaoEscolhida = 0;

        do {
            System.out.println("Menu:");
            System.out.println("1) INSERÇÃO DE NOVO CONTATO");
            System.out.println("2) LISTAGEM DE CONTATOS DE DETERMINADO ANO DE NASCIMENTO");
            System.out.println("3) ENCERRAMENTO DO PROGRAMA");
            System.out.print("Escolha uma opção: ");
            opcaoEscolhida = sc.nextInt();

            sc.nextLine();

            switch (opcaoEscolhida) {
                case 1 -> {
                    String nome;
                    long telefone;
                    GregorianCalendar dataNascimento = new GregorianCalendar();

                    System.out.println("Insira as informações corretamente: ");
                    System.out.print("Nome: ");
                    nome = sc.nextLine();

                    System.out.print("Número para contato: ");
                    telefone = sc.nextLong();
                    sc.nextLine();

                    System.out.println("Data de nascimento: ");
                    System.out.print("Dia: ");
                    int dia = sc.nextInt();

                    System.out.print("Mês (1 a 12): ");
                    int mes = sc.nextInt() - 1;

                    System.out.print("Ano: ");
                    int ano = sc.nextInt();
                    sc.nextLine();
                    dataNascimento.set(ano, mes, dia);

                    listaDeContatos.add(new Contato(nome, telefone, dataNascimento));
                    System.out.println("Cadastro realizado com sucesso");
                    System.out.println("-----------------------------------------------------------");
                }

                case 2 -> {
                    System.out.print("Insira o ano: ");
                    int ano = sc.nextInt();

                    for (Contato contato : listaDeContatos) {
                        if (contato.getDataNascimento().get(Calendar.YEAR) == ano) {
                            System.out.println(contato);
                        }
                    }
                    System.out.println("-----------------------------------------------------------");
                }

                case 3 -> {
                    System.out.println("Encerrando programa...");
                }

                default -> {
                    System.out.println("Insira uma opção válida...");
                }
            }

        } while (opcaoEscolhida != 3);
    }
}
