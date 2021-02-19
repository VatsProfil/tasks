package lesson190221;

public  class Human extends Workplace{

    private String name;
    private String surname;
    private Parent father;
    private Parent mother;
    private int age;


    public Human(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public Human (String name, String surname, int age, Parent father, Parent mother){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.father = father;
        this.mother =mother;
    }

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
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

    public Parent getFather() {
        return father;
    }

    public void setFather(Parent father) {
        this.father = father;
    }

    public Parent getMother() {
        return mother;
    }

    public void setMother(Parent mother) {
        this.mother = mother;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public void isWork(String answer) {
        System.out.println(this.name +" "+ answer);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", father=" + father +
                ", mother=" + mother +
                ", age=" + age +
                '}';
    }
}
