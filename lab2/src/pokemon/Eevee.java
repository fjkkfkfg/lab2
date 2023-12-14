package pokemon;
import attacks.StatusMove.BabyDollEyes;
import attacks.PhysicalMove.Facade;
import attacks.PhysicalMove.QuickAttack;
import ru.ifmo.se.pokemon.*;


public class Eevee extends Pokemon {
    public Eevee(String name,int level){
        super(name,level);
        super.setStats(55,55,50,45,65,55);
        super.setType(Type.NORMAL);
        super.setMove(new QuickAttack(),new BabyDollEyes(),new Facade());
    }
}
