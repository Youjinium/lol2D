package lol.game;

public class Tower extends Attacker{
    public static final int HP_TOWER = 5;
    public static final int RANGE_OF_ATTACK = 2;
    public static final int DAMAGE_TOWER = 4;
    public static final int BLUE = 0;
    public static final int RED = 1;
    private int teamID;

    // we let the attributes be constants for now
    public Tower(int teamID) {
        super(HP_TOWER, RANGE_OF_ATTACK, DAMAGE_TOWER);
        this.teamID = teamID;
    }

    public int teamOfTower() {
        return teamID;
    }

    public String name() {
        return name();
    }

    @Override public void accept(TileVisitor visitor) {
        if(isAlive()) {
            visitor.visitTower(this);
        }
        else {
            visitor.visitGround(Battlefield.GroundTile.fromASCII('~'), x(), y());
        }
    }

    @Override public void hit(int damage) {
        super.hit(damage);
        System.out.println(this);
    }

    @Override public String toString() {
        return (teamID == BLUE ? "Blue" : "Red") + " Tower: " + currentHP + "hp left";
    }
}
