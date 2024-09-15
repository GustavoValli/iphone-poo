public class Main {
    
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.adicionarAba();
        iphone.atender();
        iphone.atualizarPagina();
        iphone.exibirPagina("youtube.com.br");
        iphone.iniciarCorreioVoz();
        iphone.ligar("(11) 99999-9999");
        iphone.pausar();
        iphone.selecionarMusica("Metallica");
        iphone.tocar();
    }
}
