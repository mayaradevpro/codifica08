public class CartaoCredito extends FormaPagamento {
    
    private String numeroCartao;
    
    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Processando pagamento de R$ " + valor + " com cartão de crédito.");
        } else {
            System.out.println("Pagamento com cartão de crédito inválido.");
        }
    }

    @Override
    public boolean validarPagamento() {
        return numeroCartao != null && numeroCartao.length() == 16;
    }
}