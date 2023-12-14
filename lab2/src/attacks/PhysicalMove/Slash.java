package attacks.PhysicalMove;
import ru.ifmo.se.pokemon.*;
public class Slash extends PhysicalMove {
    public Slash(){super(Type.NORMAL,70,100);}

    @Override
    public void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int) Math.round(damage));

    }

    @Override
    protected double calcCriticalHit(Pokemon att,Pokemon def){
        return 3.0 * super.calcCriticalHit(att,def);
    }


    @Override
    protected String describe(){return "Slash has increased chance of critical attack. Deals 70 damage";}


}
