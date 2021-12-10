public class FabricaJogadorBasquete implements FabricaAbstrata {


    @Override
    public Bola criarBola() {
        return new BolaDeBasquete();
    }

    @Override
    public Tenis criarTenis() {
        return new TenisBasquete();
    }
}
