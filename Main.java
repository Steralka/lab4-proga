public class Main {
    //локальный класс
    static {
        class vvodniyconstruct {
            public void vvodniy(String word){
                System.out.println(word + " говоря");
            }
        }
        vvodniyconstruct vvodniyconstruct1 = new vvodniyconstruct();
        vvodniyconstruct1.vvodniy("Собственно");
    }


    public static void main(String[] args) {

        Person uliusandbok = new Person("Юлиус и Фрекен Бок");
        Person tishina = new Person("Тишина");
        Person karson = new Person("Карлсон");
        Person malish = new Person("Малыш");
        Person filleandrulle = new Person("Филле и Рулле");
        Person oni = new Person("Они");
        Person luch = new Person("Луч света");
        Person mamochka = new Person("Мамочка");
        Person on = new Person("Он");

        Place room = new Place("Комната", "Темно");
        Place stol = new Place("Стол", "Темно");
        Place prihog = new Place("Прихожая", "Темно");

        Sounds brrshh = new Sounds("брр-пс-пс и брр-аш");
        Sounds nothing = new Sounds(" ");
        Sounds sound1 = new Sounds("шкашошные шушештва");
        Person.Chance chance1 = new Person.Chance("Вероятнее всего");
        Person.Chance chance2 = new Person.Chance("Может");


        try { // код, который может вызвать исключение

            try {
                sound1.say(on, 60);
            }
            catch (soundlevelException ex) { // код для обработки исключения типа
                System.out.println("ОШИБКА! " + ex.getMessage());
            }

            malish.think("Он ведь остался без зубов");
            on.thinkabout(filleandrulle);

            //анонимный класс
            Person Kirill = new Person("Кирилл") {
                public void go() {
                    System.out.println(getName() + " " + "верит что закроет лабу!");
                }
            };
            
            Kirill.go();
            chance1.chanceofstay(filleandrulle);
            chance2.chanceofpritailis(filleandrulle);
            malish.scare();
            malish.huge(karson);

            System.out.println();

            uliusandbok.disappeared(room);
            tishina.set(room);
            karson.sit(stol);
            malish.sit(stol);
            karson.waiting();
            malish.waiting();
            malish.think("Прошла уже целая вечность");

            try {
                brrshh.somesound(50);
            }
            catch (soundlevelException ex){
                System.out.println("ОШИБКА! " + ex.getMessage());
            }

            try {
                brrshh.somesound(80);
            }
            catch (soundlevelException ex){
                System.out.println("ОШИБКА! " + ex.getMessage());
            }

            uliusandbok.sleep();
            filleandrulle.go();
            filleandrulle.makesound();
            malish.scare();
            oni.onlight();
            luch.jump(prihog);
            filleandrulle.discover(stol, malish);
            filleandrulle.discover(stol, karson);
            filleandrulle.discover(stol, mamochka);
            malish.closedeyes();
            
            try {
                nothing.say(malish, 0);
            }
            catch (soundlevelException ex){
                System.out.println("ОШИБКА! " + ex.getMessage());
            }

            try {
                nothing.say(filleandrulle, 50);
            }
            catch (soundlevelException ex){
                System.out.println("ОШИБКА! " + ex.getMessage());
            }
        }
        catch (NameException e) {
            System.out.println(e.getMessage());
        }
    }
}