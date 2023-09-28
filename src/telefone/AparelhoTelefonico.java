package telefone;

public interface AparelhoTelefonico {
    String ligar(String numero);

    String atender();

    String iniciarCorreioDeVoz(String numero);
}
