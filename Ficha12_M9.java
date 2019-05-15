/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha12_m9;

import java.util.Scanner;

/**
 *
 * @author SOFIA
 */
public class Ficha12_M9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Anime xpto = new Anime();
        //Anime xpto = new Anime();
        System.out.println("1-Inserir ataques");
        System.out.println("2-Procurar posição do ataque");
        System.out.println("3-Procurar o nome do ataque");
        System.out.println("0-Sair");
        int op=sc.nextInt();
        do{
            switch(op){
                case 1:
                    System.out.println("Insira os 5 ataques: ");
                    for(int i=0; i<=5; i++){
                        String ataque=sc.nextLine();
                        xpto.setAtaques(i, ataque);
                    }
                    break;
                case 2:
                    System.out.println("Insira o nome do ataque que procura: ");
                    String a=sc.nextLine();
                    System.out.println("A posição do ataque é: "+xpto.posicao);
                    break;
                case 3:
                    System.out.println("Insira a posição do ataque que procura: ");
                    int x=sc.nextInt();
                    break;
            }
        }while (op!=0);
    }
}