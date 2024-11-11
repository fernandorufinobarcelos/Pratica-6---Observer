public class DepartamentoVendas implements Observer{
    @Override
    public void Update(String mensagem) {
        System.out.println("Departamento de Marketing: " + mensagem);
        // Promover o produto nas redes sociais
    }
}
