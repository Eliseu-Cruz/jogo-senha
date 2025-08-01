package model;
import java.util.Random;

public class Senha {
    public static int[] gerar(){
        Random rand = new Random();
        int[] Senha = new int[4];
        for (int i = 0; i < Senha.length; i++){
            Senha[i] = rand.nextInt(10);
        }
        return Senha;
    }
}