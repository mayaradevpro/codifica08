public class SistemaPagamentos {
    public static void main(String[] args) {
        FormaPagamento cartao = new CartaoCredito("1234567812345678");
        FormaPagamento boleto = new Boleto("12345678901234567890123456789012345678901234");
        FormaPagamento pix = new Pix("chavepix@exemplo.com");
        
        double valorPagamento = 100.0;
        
        processarPagamento(cartao, valorPagamento);
        processarPagamento(boleto, valorPagamento);
        processarPagamento(pix, valorPagamento);
    }
    
    private static void processarPagamento(FormaPagamento formaPagamento, double valor) {
        formaPagamento.processarPagamento(valor);
    }
}