public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("O TELEFONE ESTÁ TOCANDO");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO A MÚSICA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("TOCANDO A MÚSICA " + musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO A PÁGINA " + url);
    }

    @Override
    public void adicionarAba() {
        System.out.println("ADICIONANDO UMA NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PÁGINA");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA O NÚMERO " + numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO O TELEFONE");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO O CORREIO DE VOZ");
    }
    

}
