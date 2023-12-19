public class Sounds extends Elements implements Talkable{
    public Sounds(String name) {
        super(name);
    }

    @Override
    // алгоритм речи
    public void say(Person person,int soundlevel) throws soundlevelException {
        if (getName() == " ") {
            setName("что-то");      //если имя пустое то замена на что то
        }
        if ((soundlevel <= 50) & (soundlevel >= 1)) {
            System.out.println(person + " " + Verbs.valueOf("говорил") + "(и)" + " " + getName() + " шепотом");
        } else if (soundlevel >= 50) {
            System.out.println(person + " " + Verbs.valueOf("говорил") + "(и)" + " " + getName() + " в полный голос");
        } else if (soundlevel == 0){
            System.out.println(person + " " + Verbs.valueOf("затаил") + " " + "дыхание");
        } else if (soundlevel < 0) {
            throw new soundlevelException(this, "произнесено слишком тихо");
        }
    }

    @Override
    // алгоритм уровня звука
    public void somesound(int somesoundlevel) throws soundlevelException {
        if ((somesoundlevel <=50) & (somesoundlevel >=1)) {
            System.out.println("звуки " + "'" + getName() + "'" + " " + Verbs.valueOf("слышались") + " слабо");
        }
        else if (somesoundlevel >= 50){
            System.out.println("звуки " + "'" + getName() + "'" + " " + Verbs.valueOf("усилились"));
        }
        else if (somesoundlevel == 0){
            System.out.println("звуков " + "'" + getName() + "'" + " не было ");
        }
        if (somesoundlevel < 0) {
            throw new soundlevelException(this, "произнесено слишком тихо");
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
