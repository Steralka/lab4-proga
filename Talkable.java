public interface Talkable {
    public void say(Person person,int soundsevel) throws soundlevelException; //предупреждаем с помощью throws, что метод может выбросить исключение
    public void somesound(int somesoundlevel) throws soundlevelException;
}
