public abstract class Elements {

    private String name;

    public Elements(String name) {
        this.name = name;
        if(name.isEmpty())
            throw new NameException("Добавьте имя/название");
    }

    public String getName() {
        return name;
    }     //гетер чтобы получать имя

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new NameException("Имя не может быть пустым");
        }
        this.name = name;
    } //сетер чтобы изменять имя

    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Elements elements = (Elements) obj;
        return elements.name.equals(name);
    }

    @Override
    public String toString() {
        return this.getName();
    }
}