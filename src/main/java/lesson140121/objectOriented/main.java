package lesson140121.objectOriented;

public class main {

    public static void main(String[] args) {

        Human human = new Human();
        human.setName("Obyekt");
        human.setSurname("Obyekt");
        human.setFather(human);
        human.setMother(human);
        human.setSchedule("monday","2010");




    }
}
