package combat;

import combat.type.MeleeWeaponType;

public class MeleeWeapon extends Weapon {

    private MeleeWeaponType type;

    @Override
    public void setRange(int range) {
        super.setRange(range);

    }

    public MeleeWeapon(String name, int damage, int range) {
        super(name, damage, range);
    }

    @Override
    public String toString() {
        return "MeleeWeapon{" +
                "type=" + type +
                '}';
    }
}
