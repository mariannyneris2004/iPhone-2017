package telefone;

public class Telefone implements AparelhoTelefonico{
    @Override
    public String ligar(String numero) {
        return "Ligando para " + numero;
    }

    @Override
    public String atender() {
        return "Atendendo telefone...";
    }

    @Override
    public String iniciarCorreioDeVoz(String numero) {
        return "Iniciando mensagem para " + numero;
    }
}
