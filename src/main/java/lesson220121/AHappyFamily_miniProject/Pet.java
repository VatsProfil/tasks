package lesson220121.AHappyFamily_miniProject;

import java.util.Arrays;

public class Pet {

    private String species;
    private String nickname;
    private int age;
    private int tricklevel;
    private String[] habits;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTricklevel() {
        return tricklevel;
    }

    public void setTricklevel(int tricklevel) {
        if(tricklevel<1 || tricklevel>100){
            System.out.println("1 ve 100 arasinda eded daxil edin");
        }
        else
        this.tricklevel = tricklevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }


    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am "+this.nickname+". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    public String toString(){

        return "dog{ nickname='"+this.nickname+"', age="+this.age+", tricklevel="+this.tricklevel+", habits="+ Arrays.toString(this.habits)+"} where dog="+this.species;
    }

    public Pet(String species, String nickname){

        this.species=species;
        this.nickname=nickname;

    }

    public Pet(String species, String nickname, int age, int tricklevel, String[] habits){

        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.tricklevel=tricklevel;
        this.habits=habits;

    }

    public Pet(){

    }
}
