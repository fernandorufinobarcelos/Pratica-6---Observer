public class Main {
    public static void main(String[] args) {
        // Criar um estoque de produto
        EstoqueProduto estoqueProduto = new EstoqueProduto("Camiseta");

        // Criar observadores
        DepartamentoVendas vendas = new DepartamentoVendas();
        DepartamentoMarketing marketing = new DepartamentoMarketing();
        DepartamentoCompras compras = new DepartamentoCompras();

        // Registrar observadores no estoque
        estoqueProduto.Registrar(vendas);
        estoqueProduto.Registrar(marketing);
        estoqueProduto.Registrar(compras);

        // Simular reabastecimento do produto
        estoqueProduto.reabastecer();
    }
}