package attacks.PhysicalMove;
import ru.ifmo.se.pokemon.*;

public class QuickAttack extends PhysicalMove {
    public QuickAttack(){super(Type.NORMAL,40,100);}

    @Override
    public void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int) Math.round(damage));

    }


    @Override
    protected String describe(){return "uses Quick attack and deals 40 damage";}

}
