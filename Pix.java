public class Pix extends FormaPagamento {
    
    private String chavePix;
    
    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Processando pagamento de R$ " + valor + " com pix.");
        } else {
            System.out.println("Pagamento com pix inválido.");
        }
    }

    @Override
    public boolean validarPagamento() {
        return chavePix != null && chavePix.length() > 0;
    }
}