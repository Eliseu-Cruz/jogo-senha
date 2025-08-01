package service;
import model.Resultado;

public abstract class Jogo{

    public abstract Resultado jogar(int[] tentativa);
    public abstract boolean terminou();
}