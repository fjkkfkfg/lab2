package attacks.StatusMove;
import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide(){super(Type.NORMAL,0,0);}
    int a;

    @Override
    public void applyOppEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.ATTACK, -1);
        if (p.getStat(Stat.ATTACK)>-6){
            p.addEffect(e);
        }
    }
    @Override
    protected String describe() {
        return "использует Confide и уменьшает специальную атаку на 1";
    }
}
