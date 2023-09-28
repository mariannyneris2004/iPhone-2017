package reprodutor;

public interface ReprodutorMusical {
    String tocar(Musica musica);

    String pausar(Musica musica, int minutagem);

    String selecionarMusica(Musica musica);
}
