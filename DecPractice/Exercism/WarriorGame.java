package Exercism;
abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

    
    public String toString() {
        return "Fighter is a"+this.getClass().getName();
    }

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a "+this.getClass().getName();
    }

    @Override
    int damagePoints(Fighter wizard) {
       return (wizard.isVulnerable()!=true)? 6 : 10;
    }
}

class Wizard extends Fighter {
    int pointsDealt = 0;
    boolean spellPrepared = false;

     @Override
    public String toString() {
        return "Fighter is a "+this.getClass().getName();
    }
    
    @Override
    boolean isVulnerable() {
        return (spellPrepared!=true)? true : false;
    }

    @Override
    int damagePoints(Fighter warrior) {
       return (spellPrepared!=true)? 3 : 12;
    }

    void prepareSpell() {
        spellPrepared = true;
    }

}
