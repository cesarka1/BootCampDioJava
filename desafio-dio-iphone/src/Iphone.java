
public class Iphone {

    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;
    private ReprodutorMusical reprodutorMusical;

    public static void main(String[] args) {
        Iphone iphone2007 = new Iphone();

        System.out.println("Teste das funções do Iphone 2007:");

        System.out.println("Navegador:");

        iphone2007.navegadorInternet.exibirPagina("google.com");
        iphone2007.navegadorInternet.adicionarNovaAba();
        iphone2007.navegadorInternet.atualizarPagina();

        System.out.println("Reprodutor Musical:");

        iphone2007.reprodutorMusical.selecionarMusica("Song.mp4");
        iphone2007.reprodutorMusical.tocar();
        iphone2007.reprodutorMusical.pausar();

        System.out.println("Aparelho Telefonico:");

        iphone2007.aparelhoTelefonico.ligar("999999999999");
        iphone2007.aparelhoTelefonico.atender();
        iphone2007.aparelhoTelefonico.iniciarCorreioVoz();
    }

    public Iphone() {
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
        this.reprodutorMusical = new ReprodutorMusical();
    }

}
