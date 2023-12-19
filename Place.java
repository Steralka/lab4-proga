public class Place extends Elements {

    protected String lightlevel;
    public Place(String name, String lightlevel) {
        super(name);
        this.lightlevel = lightlevel;
        }
    public void setLightLevel(String lightlevel) {
        this.lightlevel = lightlevel;
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
