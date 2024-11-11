public class DepartamentoCompras implements Observer{
    @Override
    public void Update(String mensagem) {
        System.out.println("Departamento de Compras: " + mensagem);
        // Monitorar níveis de estoque e planejar novos pedidos
    }
}
