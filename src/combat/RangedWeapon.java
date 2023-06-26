package combat;

import combat.type.RangedWeaponType;

public class RangedWeapon extends Weapon {

    private RangedWeaponType type;
    private int ammunition;

    public RangedWeapon(String name, int damage, int range,int ammunition) {
        super(name, damage, range);
        ammunition--;
    }

    @Override
    public String toString() {
        return "RangedWeapon{" +
                "type=" + type +
                ", ammunition=" + ammunition +
                '}';
    }
}
