package reprodutor;

public class Reproduzir implements ReprodutorMusical{
    @Override
    public String tocar(Musica musica) {
        return "Tocando " + musica.getNome() + " do(a) artista " + musica.getArtista();
    }

    @Override
    public String pausar(Musica musica, int minutagem) {
        return "Pausando música " + musica.getNome() + " na minutagem " + minutagem;
    }

    @Override
    public String selecionarMusica(Musica musica) {
        return musica.getNome() + " selecionada";
    }
}
