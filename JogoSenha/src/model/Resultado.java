package model;

public class Resultado {

    private final int certos;
    private final int errados;

    public Resultado(int certos, int errados){
        this.certos = certos;
        this.errados = errados;
    }

    public int getCertos(){
        return certos;
    }

    public int getErrados(){
        return errados;
    }
}