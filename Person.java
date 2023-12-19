// Действия персонажей 
public class Person extends Elements implements Perceptionable {
    public Person(String name) {
        super(name);
    }

    @Override
    public void disappeared(Place place) {
        System.out.println(getName() + " " + Verbs.valueOf("исчезли") + " " + "в " + place);
    }

    @Override
    public void set(Place place) {
        System.out.println(getName() + " " + Verbs.valueOf("воцарилась") + " в " + place);
        System.out.println("В " + place + " " + Verbs.valueOf("было") + " " + place.lightlevel);
    }

    @Override
    public void waiting(){
        System.out.println(getName() + " " + Verbs.valueOf("ждал"));
    }

    @Override
    public void sit(Place place) {
        System.out.println(getName() + " " + Verbs.valueOf("сидел") + " под " + place + "ом");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " " + Verbs.valueOf("погрузились") + " в " + "сон");
    }

    @Override
    public void go() {
        System.out.println(getName() +  " " + Verbs.valueOf("двинулись") + " в путь");
    }

    @Override
    public void scare() {
        System.out.println(getName() + " " + Verbs.valueOf("был_охвачен") + " ужасом");
    }

    private static boolean generateRandomBoolean() {
        return Math.random() < 0.5; // Шанс получить true равен 50%
    }

    // рандом шанс на включение фанарика с первой попытки
    @Override
    public void onlight() {
            boolean randomBoolean = generateRandomBoolean();
            if (randomBoolean) {
                System.out.println(getName() + " " + Verbs.valueOf("зажгли") + " " + "фонарик");
            }
            else {
                System.out.println(getName() + " не " + Verbs.valueOf("зажгли") + " " + "фонарик" + "с первого раза");
                System.out.println(getName() + " " + Verbs.valueOf("повторили") + " попытку");
                System.out.println(getName() + " " + Verbs.valueOf("зажгли") + " " + "фонарик");
            }
        }

    @Override
    public void jump(Place place) {
        System.out.println(getName() + " " + Verbs.valueOf("запрыгал") + " по " + place);
        place.setLightLevel("Светлее");
        System.out.println("В " + place + " " + Verbs.valueOf("стало") + " " + place.lightlevel);
    }

    @Override
    public void discover(Place place, Person person) {
           System.out.println(getName() + " " + Verbs.valueOf("обнаружили") + " под " + place + "ом " + person);
    }

    @Override
    public void closedeyes() {
        System.out.println(getName() + " " + Verbs.valueOf("зажмурил") + " глаза");
    }

    @Override
    public void makesound() {
        System.out.println(getName() + " " + Verbs.valueOf("издавали") + " звуки дыхания ");
    }

    @Override
    public void think(String phrase) {
        System.out.println(getName() + " " + Verbs.valueOf("подумал") + " '" + phrase + "'");
    }

    @Override
    public void thinkabout(Person person) {
        System.out.println(getName() + " " + Verbs.valueOf("подумал") + " о " + person);
    }

    @Override
    public void huge(Person person) {
        System.out.println(getName() + " " + Verbs.valueOf("придвинулся") + " ближе к " + person);
    }

    public static class Chance {
        private final String chance;
        public Chance(String chance) {
            this.chance = chance;
        }
        public void chanceofstay(Person person) {
            System.out.println(chance + " " + person + " " + Verbs.valueOf("стоят") + " в тамбуре");
        }
        public void chanceofpritailis(Person person) {
            System.out.println(chance + " " + person + " " + Verbs.valueOf("притаились") + " в темноте, за пальто на вешалке");
        }
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }
}