package net.maromo;

import java.util.Random;

public class Cartela {
    private int m[][] = new int[5][5];


    //método construtor
    public Cartela(){
        Random ale =new Random();
        //Primeira coluna
        for(int coluna=0; coluna<5; coluna++) {
            for (int i = 0; i < 5; i++) {
                int gerado = 0;
                if (coluna == 0) gerado = ale.nextInt(15) + 1;
                if (coluna == 1) gerado = ale.nextInt(15) + 16;
                if (coluna == 2) gerado = ale.nextInt(15) + 31;
                if (coluna == 3) gerado = ale.nextInt(15) + 46;
                if (coluna == 4) gerado = ale.nextInt(15) + 61;
                boolean achou = false;
                for (int j = 0; j < 5; j++) {
                    if (gerado == m[j][coluna]) {
                        achou = true;
                        i--;
                        break;
                    }
                }
                if (!achou) m[i][coluna] = gerado;
            }
        }
        m[2][2] = 99;
        imprimir();
     }

     private void imprimir(){
         System.out.println("CARTELA NOVA PARA VOCÊ");
         System.out.println("----------------------");
         for (int i = 0; i < 5; i++) {
             for (int j = 0; j < 5; j++) {
                 if((i==2)&&(j==2)){
                     System.out.printf("[-:-] ");
                 }else{
                     System.out.printf("[%3d] ", m[i][j]);
                 }
             }
             System.out.println();
         }
     }
}
