package dispositivos.Smartphone;

import dispositivos.audio.ReprodutorMusical;
import dispositivos.comunicacao.TelefoneCelular;
import dispositivos.internet.NavegadorInternet;

public class Iphone implements ReprodutorMusical, TelefoneCelular, NavegadorInternet {
   
   public void voltarMenu(){
   System.out.println("Voltando para Menu Principal...");
   }

    //Funções do Reprodutor Musical
    public void abrirPlayerMusic(){
   System.out.println("Abrindo Player de Audio...");
   }
   public void tocar(){
    System.out.println("Reproduzindo música...");
   }
   public void pausar(){
    System.out.println("Pausando música...");
   }
   public void parar(){
    System.out.println("Parando música...");
   }
   public void proxima(){
    System.out.println("Indo para próxima música...");
   }
   public void anterior(){
    System.out.println("Voltando para música anterior...");
   }
   public void avancar(){
    System.out.println("Adiantando parte da música...");
   }
   public void retroceder(){
    System.out.println("Voltando parte da música...");
   }
   public void selecionarMusica(){
    System.out.println("Selecionando música...");
   }
   //Funções de Telefônia
   public void selecionarContato(){
    System.out.println("Selecionando contato...");
   }
   public void ligar(){
    System.out.println("Ligando para o contato selecionado...");
   }
   public void atender(){
    System.out.println("Atendendo chamada...");
   }
   public void conferencia(){
    System.out.println("Iniciando conferência com chamadas ativas...");
   }
   public void ativarVivavoz(){
    System.out.println("Ativando Viva-voz na chamada...");
   }
   public void contatosFavoritos(){
    System.out.println("Abrindo lista de contatos favoritos...");
   }
   public void contatosRecentes(){
    System.out.println("Abrindo lista de contatos recentes...");
   }
   public void iniciarCorreioVoz(){
    System.out.println("Iniciando verificação de correio de voz...");
   }
    public void abrirChamadas(){
    System.out.println("Atualizando página da internet...");
   }
   //Funções do Navegador de Internet
   public void exibirPagina(){
    System.out.println("Exibindo página da internet...");
   }
   public void adicionarNovaAba(){
    System.out.println("Adicionando nova aba...");
   }
   public void fecharAba(){
    System.out.println("Fechando nova aba...");
   }
   public void favoritos(){
    System.out.println("Abrindo as páginas Favoritas salvas...");
   }
   public void historicoNavegador(){
    System.out.println("Exibindo histórico de navegação...");
   }
   public void avancarPagina(){
    System.out.println("Avançando para próxima página acessada...");
   }
   public void retrocederPagina(){
    System.out.println("Voltando para página anterior...");
   }
   public void atualizarPagina(){
    System.out.println("Atualizando página da internet...");
   }
    public void abrirNavegador(){
    System.out.println("Atualizando página da internet...");
   }
}
