public class Unit {

    protected int health;
    protected int power;
    protected int defence;
    protected float criticalChance;
    protected float parryChance;

    protected void getDamage(int power){
        this.health -= power;
    }
    protected void attack(Unit unit){
        unit.getDamage(unit.power);
    }

    @Override
    public String toString() {
        return "Unit{" +
                "health=" + health +
                ", power=" + power +
                ", defence=" + defence +
                ", criticalChance=" + criticalChance +
                ", parryChance=" + parryChance +
                '}';
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public float getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(float criticalChance) {
        this.criticalChance = criticalChance;
    }

    public float getParryChance() {
        return parryChance;
    }

    public void setParryChance(float parryChance) {
        this.parryChance = parryChance;
    }
}
