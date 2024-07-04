public class AparelhoTelefonico {
    public void ligar(String numero){
        System.out.println(String.format("Ligando para o número: %s", numero));
    }
    public void atender(){
        System.out.println("Atendendo a ligação");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Chamada encaminhada para o correio de voz");
    }
}
