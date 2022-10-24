/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.matrizenotramatriz;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JAVAMatrizEnOtraMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingresar uno a uno los elementos de la matriz 3x3");
        int [][] matriz=new int [3][3];
        Rellenar(matriz);
        int [][] matrizPrinc=devolverMatriz();
        Busqueda(matriz, matrizPrinc);
    }
    
    public static int[][] devolverMatriz(){
        int [][] matriz= new int [10][10];
        matriz[0][0]=1;matriz[0][1]=26;matriz[0][2]=36;matriz[0][3]=47;matriz[0][4]=5;matriz[0][5]=6;matriz[0][6]=72;matriz[0][7]=81;matriz[0][8]=95;matriz[0][9]=10;
        matriz[1][0]=11;matriz[1][1]=12;matriz[1][2]=13;matriz[1][3]=21;matriz[1][4]=41;matriz[1][5]=22;matriz[1][6]=67;matriz[1][7]=20;matriz[1][8]=10;matriz[1][9]=61;
        matriz[2][0]=56;matriz[2][1]=78;matriz[2][2]=87;matriz[2][3]=90;matriz[2][4]=9;matriz[2][5]=90;matriz[2][6]=17;matriz[2][7]=12;matriz[2][8]=87;matriz[2][9]=67;
        matriz[3][0]=41;matriz[3][1]=87;matriz[3][2]=24;matriz[3][3]=56;matriz[3][4]=97;matriz[3][5]=74;matriz[3][6]=87;matriz[3][7]=42;matriz[3][8]=64;matriz[3][9]=35;
        matriz[4][0]=32;matriz[4][1]=76;matriz[4][2]=79;matriz[4][3]=1;matriz[4][4]=36;matriz[4][5]=5;matriz[4][6]=67;matriz[4][7]=96;matriz[4][8]=12;matriz[4][9]=11;
        matriz[5][0]=99;matriz[5][1]=13;matriz[5][2]=54;matriz[5][3]=88;matriz[5][4]=89;matriz[5][5]=90;matriz[5][6]=75;matriz[5][7]=12;matriz[5][8]=41;matriz[5][9]=76;
        matriz[6][0]=67;matriz[6][1]=78;matriz[6][2]=87;matriz[6][3]=45;matriz[6][4]=14;matriz[6][5]=22;matriz[6][6]=26;matriz[6][7]=42;matriz[6][8]=56;matriz[6][9]=78;
        matriz[7][0]=98;matriz[7][1]=45;matriz[7][2]=34;matriz[7][3]=23;matriz[7][4]=32;matriz[7][5]=56;matriz[7][6]=74;matriz[7][7]=16;matriz[7][8]=19;matriz[7][9]=18;
        matriz[8][0]=24;matriz[8][1]=67;matriz[8][2]=97;matriz[8][3]=46;matriz[8][4]=87;matriz[8][5]=13;matriz[8][6]=67;matriz[8][7]=89;matriz[8][8]=93;matriz[8][9]=24;
        matriz[9][0]=21;matriz[9][1]=68;matriz[9][2]=78;matriz[9][3]=98;matriz[9][4]=90;matriz[9][5]=67;matriz[9][6]=12;matriz[9][7]=41;matriz[9][8]=65;matriz[9][9]=12;
        return matriz;
    }
    public static void Rellenar(int[][] matriz){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=leer.nextInt();
            }
        }
    }
    public static void Busqueda(int[][] matriz, int[][] matrizPrinc){
        boolean bandera=false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrizPrinc[i][j]==matriz[0][0]&&matrizPrinc[i][j+1]==matriz[0][1]&&matrizPrinc[i][j+2]==matriz[0][2]&&
                    matrizPrinc[i+1][j]==matriz[1][0]&&matrizPrinc[i+1][j+1]==matriz[1][1]&&matrizPrinc[i+1][j+2]==matriz[1][2]&&
                    matrizPrinc[i+2][j]==matriz[2][0]&&matrizPrinc[i+2][j+1]==matriz[2][1]&&matrizPrinc[i+2][j+2]==matriz[2][2]){
                    System.out.println("La matriz ingresada comienza en el punto "+"["+i+";"+j+"]");
                    bandera=true;
                    break;
                }
            }
        }
        if (bandera=false){
            System.out.println("La matriz ingresda no se encuentra");
        }
    }
    
}
