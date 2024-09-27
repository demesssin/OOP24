package Lab1.Dragon;
import java.util.Vector;

public class DragonLaunch {
    Vector<Person> kidnappedPeople;

    public DragonLaunch() {
        kidnappedPeople = new Vector<>();
    }

    public void kidnap(Person p) {
        kidnappedPeople.add(p);
    }

    public boolean willDragonEatOrNot() {
        int i = 0;

        while (i < kidnappedPeople.size() - 1) {
            if (kidnappedPeople.get(i).getGender() == Gender.BOY &&
                    kidnappedPeople.get(i + 1).getGender() == Gender.GIRL) {

                kidnappedPeople.remove(i);
                kidnappedPeople.remove(i);

                i = Math.max(i - 1, 0);
            } else {
                i++;
            }
        }

        return kidnappedPeople.size() > 0;
    }

    public static void main(String[] args) {
        DragonLaunch dragonLaunch = new DragonLaunch();

        dragonLaunch.kidnap(new Person(Gender.BOY));
        dragonLaunch.kidnap(new Person(Gender.BOY));
        dragonLaunch.kidnap(new Person(Gender.GIRL));
        dragonLaunch.kidnap(new Person(Gender.GIRL));

        boolean canEat = dragonLaunch.willDragonEatOrNot();
        System.out.println("Will the dragon eat? " + (canEat ? "Yes" : "No"));
        System.out.println("Remaining people: " + dragonLaunch.kidnappedPeople);
    }
}
