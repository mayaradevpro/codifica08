public class Boleto extends FormaPagamento {
    
    private String codigoBarras;
    
    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Processando pagamento de R$ " + valor + " com boleto.");
        } else {
            System.out.println("Pagamento com boleto inválido.");
        }
    }

    @Override
    public boolean validarPagamento() {
        return codigoBarras != null && codigoBarras.length() == 44;
    }
}