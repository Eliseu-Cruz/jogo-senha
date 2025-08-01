package model;
import java.util.Scanner;

public class Tentativa implements Jogador{
    Scanner sc = new Scanner(System.in);

    @Override
    public int[] tentativa() {
        System.out.println("Digite 4 números: ");
        int[] tentativa = new int[4];
        for (int i = 0; i < tentativa.length; i++){
            tentativa[i] = sc.nextInt();
        }
        return tentativa;
    }
}