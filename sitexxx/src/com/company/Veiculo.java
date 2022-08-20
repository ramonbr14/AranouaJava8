package com.company;

public class Veiculo{

    private String cor = "";
    private String modelo = "";
    private String marca = "a";
    private String numChassi = "";

    //Construtor padrao
    public Veiculo(String cor, String modelo, String marca, String numChassi) {
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.numChassi = numChassi;
    }

    //ExemploConstrutor

    public Veiculo() {
    }

    public Veiculo(String cor) {
        this.cor = cor;
    }

    public Veiculo(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    public Veiculo(String cor, String modelo, String marca) {
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
    }
    pro

    //Metodos Importantes
    public int acelerar(int intensidade){
        return 0;
    }public int freiar(int intensidade){
        return 0;
    }public int trocarMarcha(int marcha){
        return 0;
    }public int girar_ignicao(int posicao){
        return 0;
    }


    //Getter e Setter
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(String numChassi) {
        this.numChassi = numChassi;
    }
}
