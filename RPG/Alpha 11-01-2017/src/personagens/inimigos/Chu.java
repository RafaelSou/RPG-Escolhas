package personagens.inimigos;

import flyweight.FlyFactoryItem;
import itens.Arma;
import personagens.Inimigo;




public class Chu extends Inimigo{
    public Chu(){
        this.setIcone("src/imagens/Chu.png");
        this.setNome("Chu");
        this.setHP(60);
        this.setAtaque(60);
        this.setDefesa(0);
        this.setAgilidade(4);
        this.setItem((Arma)FlyFactoryItem.get("Cetro Necromante"));
        this.setXP(2000);
    }
}
