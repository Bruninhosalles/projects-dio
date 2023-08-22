package usuario;

import dispositivos.Smartphone.Iphone;

public class MeuSmartphone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("\n Bem-vindo ao seu SmartPhone Pessoal! Escolha a função desejada.\n");
        //Abrindo Player de Musica
        iphone.abrirPlayerMusic();
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.proxima();
        iphone.pausar();
        iphone.parar();
        iphone.voltarMenu();

        //Abrindo Navegador de Internet
        iphone.abrirNavegador();
        iphone.favoritos();
        iphone.exibirPagina();
        iphone.historicoNavegador();
        iphone.exibirPagina();
        iphone.retroceder();
        iphone.voltarMenu();

        //Abrindo Chamadas para fazer ligações telefônicas
        iphone.abrirChamadas();
        iphone.contatosFavoritos();
        iphone.selecionarContato();
        iphone.ligar();
        iphone.ativarVivavoz();
        iphone.iniciarCorreioVoz();
        iphone.voltarMenu();
    }
}
