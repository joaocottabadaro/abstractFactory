public class Jogador {

   private Bola bola;
   private Tenis tenis;


    public Jogador(FabricaAbstrata fabricaAbstrata){
       this.bola = fabricaAbstrata.criarBola();
       this.tenis = fabricaAbstrata.criarTenis();
   }

   public String getBola(){
        return this.bola.getTecido();
   }

    public String getTenis(){
        return this.tenis.getEstilo();
    }
}
