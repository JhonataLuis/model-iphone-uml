import model.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
       
        Iphone iphone = new Iphone("Iphone 15", 256);

        //Testando funcionalidades
        iphone.ligar();

        //Reprodutor musical
        iphone.selecionarMusica("Psy Disco Atual 2025");
        iphone.tocar();
        iphone.pausar();

        //Aparelho Telefonico
        iphone.ligar("419874652147");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //Navegador da Internet
        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba("https://www.apple.com");
        iphone.atualizarPagina();

        //Desligando aparelho
        iphone.desligar();

    }
}
