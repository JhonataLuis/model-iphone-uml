package model;

import repository.AparelhoTelefonico;
import repository.NavegadorInternet;
import repository.ReprodutorMusical;

public class Iphone extends Dispositivo implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    public Iphone(String modelo, int armazenamento){
        super(modelo, armazenamento);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina: " +url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Nova aba com pagina: " +url);
    }

    @Override
    public void atualizarPagina() {
       System.out.println("Pagina atualizada");
    }

    @Override
    public void ligar(String numero) {
       System.out.println("Ligando para: " +numero);
    }

    @Override
    public void atender() {
      System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica.");
    }
    @Override
    public void pausar() {
        System.out.println("Música Pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica: " +musica);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando Aparelho Telefonico");
    }

    @Override
    public void desligar() {
        System.out.println("Aparelho Desligado");
    }
}
