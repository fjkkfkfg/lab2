package attacks.SpecialMove;
import ru.ifmo.se.pokemon.*;


public class Thunderbolt extends SpecialMove{

    public Thunderbolt(){super(Type.ELECTRIC,90,100);}

    @Override
    public void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int) Math.round(damage));

    }

    @Override
    public void applyOppEffects(Pokemon p){
        Effect e = new Effect().turns(1).condition(Status.PARALYZE);
        p.addEffect(e);
    }
    @Override
    protected String describe(){ return "uses Thunderbolt! Paralyzed the enemy and deals 90 damage";}
}
