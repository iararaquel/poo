package desafio2;

public class Checkout {
    public void finalizarCompra(ProcessadorPagamento metodo, double valorTotal) {
        boolean ok = metodo.processar(valorTotal);
        if (ok) {
            System.out.println("Transação finalizada com sucesso.");
        } else {
            System.out.println("Falha ao processar a transação.");
        }
    }
}
