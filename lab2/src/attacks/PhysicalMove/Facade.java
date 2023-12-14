package attacks.PhysicalMove;
import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    public void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int) Math.round(damage));

    }

    @Override
    public void applyOppEffects(Pokemon p) {
        if (p.getCondition() == Status.BURN){
            Effect e = new Effect().turns(1);
            p.addEffect(e);
        } else if (p.getCondition() == Status.POISON ||
                p.getCondition() == Status.PARALYZE) {
            Effect e1 = new Effect().turns(1);
            p.addEffect(e1);

        }

    }
    @Override
    protected String describe(){return "Использует Facade";}
}