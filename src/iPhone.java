import navegador.NavegadorNaInternet;
import navegador.Navegar;
import reprodutor.Musica;
import reprodutor.ReprodutorMusical;
import reprodutor.Reproduzir;
import telefone.AparelhoTelefonico;
import telefone.Telefone;

public class iPhone {
    public static void main(String[] args) {
        Musica musica = new Musica("Meu abrigo", "Álbum de Melim", "Melim", 232);
        ReprodutorMusical reprodutorMusical = new Reproduzir();
        System.out.println(reprodutorMusical.tocar(musica));
        System.out.println(reprodutorMusical.pausar(musica, 178));
        System.out.println(reprodutorMusical.selecionarMusica(musica));
        System.out.println();

        AparelhoTelefonico aparelhoTelefonico = new Telefone();
        System.out.println(aparelhoTelefonico.atender());
        System.out.println(aparelhoTelefonico.ligar("123456789"));
        System.out.println(aparelhoTelefonico.iniciarCorreioDeVoz("123456789"));
        System.out.println();

        NavegadorNaInternet navegadorNaInternet = new Navegar();
        System.out.println(navegadorNaInternet.adicionarNovaAba());
        System.out.println(navegadorNaInternet.exibirPagina("www.google.com"));
        System.out.println(navegadorNaInternet.atualizarPagina("www.google.com"));
    }
}