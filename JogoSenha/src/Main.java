import model.*;
import service.JogoSenha;

public class Main {
    public static void main(String[] args){
        JogoSenha jogo = new JogoSenha();
        Jogador jogador = new Tentativa();

        while(!jogo.terminou()){
            int[] tentativa = jogador.tentativa();
            Resultado resultado = jogo.jogar(tentativa);
            System.out.println("Certos: " + resultado.getCertos() + " | Errados: " + resultado.getErrados());
        }
        System.out.println("Fim de jogo!");
    }
}