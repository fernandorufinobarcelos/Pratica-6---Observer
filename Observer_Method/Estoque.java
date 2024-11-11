public interface Estoque {
    public void Registrar(Observer observador);
    public void Remover(Observer observador);
    public void Notificar(String mensagem);
}
