package lesson220121.AHappyFamily_miniProject;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Pet pet = new Pet();
        pet.setNickname("rod");
        pet.respond();

        pet.setTricklevel(51);
        Human human = new Human();
        human.setPet(pet);
        human.greetPet();
        human.describePet();

        String []schedule_ = {"Monday","Playing"};
        human.setSchedule(schedule_);
        System.out.println(Arrays.toString(human.getSchedule()));

        //System.out.println(human.toString());

        pet.setAge(20);
        pet.setSpecies("husky");
        String[] habits = {"eat","drink","sleep"};
        pet.setHabits(habits);

        System.out.println(pet.toString());

        human.setName("Michael");
        human.setSurname("Corleone");
        human.setIq(90);
        human.setYear(1977);
        Human father = new Human();
        father.setName("Vito Corleone");
        Human mother = new Human();
        mother.setName("Jane Corleone");
        human.setFather(father);
        human.setMother(mother);

        System.out.println(human.toString());



        Human Jackie = new Human();
        Human Wendy = new Human();
        Jackie.setName("Jackie Torrence");
        Wendy.setName("Wendy Torrance");

        Pet Silver = new Pet("Husky","Silver",2,71,habits);

        Human Danny = new Human("Danny","Torrance",1952,72,Silver,Wendy,Jackie,schedule_);

        System.out.println(Danny.toString());






    }



}
