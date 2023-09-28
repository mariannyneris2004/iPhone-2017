package reprodutor;

public class Musica {
    private String nome;
    private String album;
    private String artista;
    private int segundos;

    public Musica(String nome, String album, String artista, int segundos) {
        this.nome = nome;
        this.album = album;
        this.artista = artista;
        this.segundos = segundos;
    }

    public String getNome() {
        return nome;
    }

    public String getAlbum() {
        return album;
    }

    public String getArtista() {
        return artista;
    }

    public int getSegundos() {
        return segundos;
    }
}
