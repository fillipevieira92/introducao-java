package Aula03;

import java.util.Scanner;



public class CervejaFreezer {
    public static void main(String[] args) {
        
        var numCerveja = 100;
        Scanner cachaceiro = new Scanner(System.in);

        while (numCerveja > 0) {            
            System.out.println(numCerveja + " cervejas na freezer. \nPego uma garrafa, passo pra frente.");
            numCerveja--;
            
            if (numCerveja == 0) {
                System.out.println("Agora deu errado, era a saideira! :( \nDeseja colocar mais quantas cervejas para gelar?");

                int addCerveja = cachaceiro.nextInt();

                if (addCerveja > 0) {                    
                    System.out.println("Ok! Adicionando mais "+addCerveja+" cervejas.");
                } else {
                    System.out.println("Ah, que pena! Na proxima nós bebemos mais!");
                }
                numCerveja += addCerveja;                

            } else {
                System.out.println("Agora são " + numCerveja + " na freezer.");
            }
        }
        cachaceiro.close();
    }
}
