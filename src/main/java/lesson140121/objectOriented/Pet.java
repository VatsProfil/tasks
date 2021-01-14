package lesson140121.objectOriented;

public class Pet {

    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String []habits;

    public Pet() {
    }

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

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        if(trickLevel<100 && trickLevel>1)
        this.trickLevel = trickLevel;
        else
            System.out.println("tricklevel-i 1 ve 100 arasinda daxil edin");
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

}
