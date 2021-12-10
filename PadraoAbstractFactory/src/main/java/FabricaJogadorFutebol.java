public class FabricaJogadorFutebol implements FabricaAbstrata{
    @Override
    public Bola criarBola() {
        return new BolaDeFutebol();
    }

    @Override
    public Tenis criarTenis() {
        return new TenisFutebol();
    }
}
