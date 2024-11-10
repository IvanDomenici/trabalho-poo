
/**
 * Escreva uma descrição da classe Principal aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Principal
{

    public static void main(String[] aaaaaaaaaaaaaaaaaaa){
        ControleRemoto tv1 = new TvQueFicaMuda(new TV(1,100));
        ControleRemoto tv2 = new TvQuePausa(new TV(1,200));
    
        System.out.println("Testando a TV que fica muda:");
        tv1.botaoCinco();
        tv1.botaoSeis();
        tv1.botaoNove();
        
        System.out.println("Testando a TV que pausa:");
        tv2.botaoCinco();
        tv2.botaoSeis();
        tv2.botaoNove();
        
        ControleRemoto controle = new ControleRemoto();

        Dispositivo tvNormal = new TV("TV Normal");
        Dispositivo tvMuda = new TvQueFicaMuda("TV Que Fica Muda");
        Dispositivo tvPausa = new TvQuePausa("TV Que Pausa");
        Dispositivo tvDesligaAutomatico = new TvQueDesligaAutomaticamente("TV com Desligamento Automático", 30);
        Dispositivo tvVolumeAutomatico = new TvComVolumeAutomatico("TV com Volume Automático", 20, 5);

        controle.adicionarDispositivo(tvNormal);
        controle.adicionarDispositivo(tvMuda);
        controle.adicionarDispositivo(tvPausa);
        controle.adicionarDispositivo(tvDesligaAutomatico);
        controle.adicionarDispositivo(tvVolumeAutomatico);

        // Teste dos dispositivos
        controle.ligarDispositivo(tvNormal);
        controle.ligarDispositivo(tvMuda);
        controle.ligarDispositivo(tvPausa);
        controle.ligarDispositivo(tvDesligaAutomatico);
        controle.ligarDispositivo(tvVolumeAutomatico);
        
        ((TvQueDesligaAutomaticamente) tvDesligaAutomatico).desligarAutomaticamente();
        ((TvComVolumeAutomatico) tvVolumeAutomatico).ajustarVolumeAutomatico();
    }

}
