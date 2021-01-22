package lesson220121.AHappyFamily_miniProject;

import java.util.Random;

public class Human {

    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[] schedule = new String[2];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        if(iq<1 || iq>100){
            System.out.println("1 ve 100 arasinda eded daxil edin");
        }
        else
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[] schedule) {

        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.println("Hello, "+this.pet.getNickname());
    }

    public void describePet() {
        int comparingTrickLevel=this.pet.getTricklevel();
        if(comparingTrickLevel<=50){
            System.out.println("I have a "+ this.pet.getSpecies()+", he is "+this.pet.getAge()+" years old, he is almost not sly");
        }
        else
        System.out.println("I have a "+ this.pet.getSpecies()+", he is "+this.pet.getAge()+" years old, he is very sly");
    }

    public String toString(){

        return "Human{ name='"+this.name+"', surname='"+this.surname+"', year='"+this.year+", iq="+this.iq+", mother="+this.mother.getName()+", father="+this.father.getName()+", pet="+this.pet.toString();
    }

    public Human(String name, String surname, int year){

        this.name=name;
        this.surname=surname;
        this.year=year;

    }

    public Human(String name, String surname, int year, Human father, Human mother){

        this.name=name;
        this.surname=surname;
        this.year=year;
        this.father=father;
        this.mother=mother;

    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[] schedule ){

        this.name=name;
        this.surname=surname;
        this.year=year;
        if(iq<1 || iq>100){
            System.out.println("1-100 arasi eded daxil edin");
        }
        else
        this.iq=iq;
        this.pet=pet;
        this.mother=mother;
        this.father=father;
        this.schedule=schedule;

    }

    public Human(){

    }

    public void feedPet(boolean isFeedingTime) {

        Random random = new Random();
        int randomNumber = random.nextInt(100)+1;
        if(isFeedingTime){
            System.out.println("Hm, I will feed "+this.pet.getNickname());
        }
        else{
            if(this.pet.getTricklevel()>randomNumber){
                System.out.println("Hm, I will feed "+this.pet.getNickname());
            }
            else
                System.out.println("I think "+this.pet.getNickname()+" is not hungry");
        }


    }

}
