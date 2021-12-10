import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void mustGetBolaDeBasquete() {
        FabricaAbstrata factory = new FabricaJogadorBasquete();
        Jogador jogador = new Jogador(factory);
        assertEquals("Couro Laranja", jogador.getBola());
    }
    
    @Test
    void mustGetBolaDeFutebol() {
        FabricaAbstrata factory = new FabricaJogadorFutebol();
        Jogador jogador = new Jogador(factory);
        assertEquals("Couro", jogador.getBola());
    }

    @Test
    void mustGetTenisDeBasquete() {
        FabricaAbstrata factory = new FabricaJogadorBasquete();
        Jogador jogador = new Jogador(factory);
        assertEquals("Cano alto", jogador.getTenis());
    }

    @Test
    void mustGetTenisDeFutebol() {
        FabricaAbstrata factory = new FabricaJogadorFutebol();
        Jogador jogador = new Jogador(factory);
        assertEquals("Chuteira", jogador.getTenis());
    }
}