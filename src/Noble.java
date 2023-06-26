import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Noble extends Character {

    private final Set<House> houses = new HashSet<>();

    private int wealth;

    public Noble(String name, String birthPlace, Gender gender, Set<House> houses, int wealth) {
        super(name, birthPlace, gender);

        this.wealth = wealth;
    }

    @Override
    public void die() {
        for (var actual : houses) {
            System.out.println(actual.getEnglishName());
        }
        super.die();
    }

    public Set<House> getHouses() {
        return houses;
    }

    public void addHouses(House houses) {
        this.houses.add(houses);
    }
    public void removeHouses(House houses) {
        this.houses.remove(houses);
    }

    public int getWealth() {
        return wealth;
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }

    private String getHousesAsString(){
        String outHouses = "";
        for ( House house : houses){
                outHouses += house + ",";
        }return outHouses.substring(0, outHouses.length()-1);

    }

    @Override
    public String toString() {
        return getName() +
                "house='" +getHousesAsString() +
                ", has " + getWealth() +
                " gold dragons";
    }
}
