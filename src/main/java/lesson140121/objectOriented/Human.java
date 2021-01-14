package lesson140121.objectOriented;

public class Human {

    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public Human(){
    }

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

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void greetPet(){
        System.out.println("Hello, "+this.pet.getNickname());
    }

    public void describePet(){
        String trickL;
        if(this.pet.getTrickLevel()>50)
            trickL="very sly";
        else
            trickL="almost not sly";
        System.out.println("I have a "+this.pet.getSpecies()+", he is "+this.pet.getAge()+" years old, he is very " + trickL);
    }



    public String toString(Human human) {
        System.out.println("Human{name='"+human.name+"', surname='"+human.surname+"', year="+human.year+", iq="+human.iq+", mother= "+human.mother+", father = "+human.father+", pet= "+human.pet);
    return "1";






    }
}
