//служит для управления объектами. Интерфейсы могут быть полезны при реализации множественного наследования.

public interface Perceptionable {
    public void disappeared(Place place);
    public void set(Place place);
    public void sit(Place place);
    public void waiting();
    public void sleep();
    public void go();
    public void scare();
    public void onlight();
    public void jump(Place place);
    public void discover(Place place, Person person);
    public void closedeyes();
    public void makesound();
    public void think(String phrase);
    public void thinkabout(Person person);
    public void huge(Person person);
}
