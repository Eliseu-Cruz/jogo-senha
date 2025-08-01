package service;
import model.*;

public class JogoSenha extends Jogo{

    private final int[] senha;
    private int tentativasRestantes = 10;
    private boolean acertou = false;

    public JogoSenha(){
        this.senha = Senha.gerar();
    }

    @Override
    public Resultado jogar(int[] tentativa) {
        tentativasRestantes--;
        int certos = 0, errados = 0;

        boolean[] usadoSenha = new boolean[senha.length];
        boolean[] usadoTentativa = new boolean[senha.length];

        for (int i = 0; i < senha.length; i++){
            if (tentativa[i] == senha[i]){
                certos++;
                usadoSenha[i] = true;
                usadoTentativa[i] = true;
            }
        }

        for (int i = 0; i < senha.length; i++){
            if (!usadoTentativa[i]){
                for (int j = 0; j < senha.length; j++){
                    if (!usadoSenha[j] && tentativa[i] == senha[j]){
                        errados++;
                        usadoSenha[j] = true;
                        break;
                    }
                }
            }
        }

        if (certos == senha.length) acertou = true;
        return new Resultado(certos, errados);
    }

    @Override
    public boolean terminou() {
        return acertou || tentativasRestantes <=0;
    }
}

