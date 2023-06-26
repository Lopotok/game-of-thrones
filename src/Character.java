import combat.Weapon;

import java.util.HashSet;
import java.util.Set;

public class Character implements Mortal {

    private String name;

    private final String birthPlace;
    private Gender gender;

    private Set<Weapon> weapons= new HashSet<>();


    public static int population = 0;



    public Character(String name, String birthPlace, Gender gender) {
        population++;
        this.name = name;
        this.birthPlace = birthPlace;
    }

    public void addWeapon (Weapon weapon) {
        this.weapons.add(weapon);
    }
    public void removeWeapon(String WeaponName) {
        this.weapons.remove(weapons);
    }

    public Set<Weapon> getWeapons() {
        return weapons;
    }

    public static int getWorldPopulation() {
        return population;
    }

    @Override
    public void die() {
        population--;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public final String getBirthPlace() {
        return birthPlace;
    }

    public Gender getGender(){

        return Gender.MALE;
    }

    public void setGender(Gender gender) {
        if (this.gender == Gender.MALE && gender == Gender.EUNUCH) {
            this.gender = gender; // vagy this.gender = Gender.EUNUCH
        }
    }


}
