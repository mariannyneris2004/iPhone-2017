package navegador;

public class Navegar implements NavegadorNaInternet{
    @Override
    public String exibirPagina(String url) {
        return "Exibindo página " + url;
    }

    @Override
    public String adicionarNovaAba() {
        return "Adicionando nova aba...";
    }

    @Override
    public String atualizarPagina(String url) {
        return "Atualizando página " + url;
    }
}
