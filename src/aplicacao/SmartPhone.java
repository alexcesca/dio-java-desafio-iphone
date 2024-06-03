package aplicacao;

import interfaces.Navegador;
import interfaces.ReprodutorMusical;
import interfaces.Telefone;

import java.util.Scanner;

public class SmartPhone implements Navegador, ReprodutorMusical, Telefone {

    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.ligar();
        smartPhone.atenderLigacao();
        smartPhone.enviarCorreioVoz();
        smartPhone.selecionarMusica();
        smartPhone.tocarMusica();
        smartPhone.pausarMusica();
        smartPhone.exibirPagina();
        smartPhone.novaAba();
        smartPhone.atualizarPagina();
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void novaAba() {
        System.out.println("Abrindo nova pagina");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausar musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void enviarCorreioVoz() {
        System.out.println("Enviando correio de voz");
    }
}
