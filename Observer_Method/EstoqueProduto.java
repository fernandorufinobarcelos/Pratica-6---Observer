import java.util.ArrayList;
import java.util.List;

public class EstoqueProduto implements Estoque{
    private String nomeProduto;
    private boolean emEstoque;
    private List<Observer> observadores = new ArrayList<>();

    public EstoqueProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
        this.emEstoque = false; // Inicialmente fora de estoque
    }

    @Override
    public void Registrar(Observer observador) {
        observadores.add(observador);
    }

    @Override
    public void Remover(Observer observador) {
        observadores.remove(observador);
    }

    @Override
    public void Notificar(String mensagem) {
        for (Observer observador : observadores) {
            observador.Update(mensagem);
        }
    }

    public void reabastecer() {
        this.emEstoque = true;
        Notificar("O produto " + nomeProduto + " está disponível novamente!");
    }
}
