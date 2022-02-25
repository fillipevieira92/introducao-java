package Aula02;

import java.util.Scanner;

public class LerNome {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        boolean teste = false;

        System.out.println("Informe o seu nome: ");
        String nome = leitor.nextLine();
        
        System.out.println("Informe a sua idade: ");
        int idade = leitor.nextInt();
        
        if (nome == "Fillipe") {
            teste = true;
        }
                
        if (teste == true) {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        };

        

        leitor.close();        
        
    }
}
