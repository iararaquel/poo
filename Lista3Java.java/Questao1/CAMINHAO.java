package Questao1;

public class CAMINHAO extends VEICULO{
    public double capacidadeCarga;

    @Override
    public double calcularIpva(){
        return preco * 0.015;
    }
}