import combat.MeleeWeapon;
import combat.RangedWeapon;
import combat.Weapon;
import combat.type.MeleeWeaponType;
import combat.type.RangedWeaponType;

import java.util.Set;

public class GameOfThrones {

    public static void main(String[] args) {
        Character arya1 = new Character("Arya","Winterfell",Gender.FEMALE);
        Character Varys = new Character("Varys","NobodyKnows",Gender.EUNUCH);
        System.out.println(Character.getWorldPopulation());
        arya1.die();
        System.out.println(Character.getWorldPopulation());
        Character arya = new Noble("Arya", "Winterfell", Gender.FEMALE, Set.of(House.STARK), 30);
  //    System.out.println(arya.hasWeapons()); // False



        arya.addWeapon(new MeleeWeapon("Valyrian steel dagger", 20, MeleeWeaponType.DAGGER));
        arya.addWeapon(new RangedWeapon("Stolen bow", 10, 40, 5, RangedWeaponType.BOW));

        arya.removeWeapon("Stolen bow");

        System.out.println(arya.getWeapons()); // [MeleeWeapon{type=DAGGER, name='Valyrian steel dagger', damage=20, range=1}]

    }
}
