package pokemon;
import ru.ifmo.se.pokemon.*;
import attacks.PhysicalMove.Facade;
import attacks.StatusMove.Confide;
import ru.ifmo.se.pokemon.Type;

public class Slakoth extends Pokemon {
    public Slakoth(String name, int level){
        super(name,level);
        super.setStats(60,60,60,35,35,30);
        super.setType(Type.NORMAL);
        super.setMove(new Confide(),new Facade());
    }
}
