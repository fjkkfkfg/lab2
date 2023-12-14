package pokemon;
import attacks.PhysicalMove.Facade;
import attacks.PhysicalMove.QuickAttack;
import attacks.SpecialMove.Thunderbolt;
import ru.ifmo.se.pokemon.*;


public class Jolteon extends Eevee {
    public Jolteon(String name,int level){
        super(name,level);
        super.setStats(65,65,60,110,95,130);
        super.setType(Type.ELECTRIC);
        super.addMove(new Thunderbolt());
    }
}
