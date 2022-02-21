package br.dio.com;

public class Carro {

    String modelo;
    String cor;
    int capacidadeDoTanque;

// construtores****************************************

        Carro (){

        }

        Carro (String modelo, String cor,int capacidadeDoTanque){
                this.modelo = modelo;
                this.cor = cor;
                this.capacidadeDoTanque = capacidadeDoTanque;
        }

    // Getts e Setts************************************

    void setCor (String cor){
        this.cor = cor;
    }

    String getCor () {
        return  cor;
    }

    void setModelo (String modelo){
        this.modelo = modelo;
    }

    String getModelo () {
        return  modelo;
    }

    void setCapacidadeDoTanque (int capacidadeDoTanque) {
            this.capacidadeDoTanque = capacidadeDoTanque;
    }

    int getCapacidadeDoTanque (){
        return capacidadeDoTanque;
    }

// metodos da classe ************************************

    double totalDoTanque (double valorDoCombustivel) {
        return capacidadeDoTanque * valorDoCombustivel;
    }


}
