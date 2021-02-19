package lesson190221;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) throws IOException {


        Parent Hudson = new Parent("Hudson",58);
        Parent Ronda = new Parent("Ronda",58);
        Human Alisson = new Human("Alisson","Wilson",28,Hudson,Ronda);

        Hudson.isWork("is working");
        Hudson.setWorkName("Car Factory");
        Hudson.setWorkRank("Engineer");


        System.out.println(Alisson.toString());


        List<Human> humans =  Arrays.asList(
                new Human("Allison","Becker",32),
                new Human("Joe","Gomez",25),
                new Human("Virgil","Dijk",28),
                new Human("Trent","Arnold",22),
                new Human("Andy","Robertson",23),
                new Human("Gianlougi","Wijnaldum",32),
                new Human("Jordan","Henderson",34),
                new Human("Thiago","Alcantara",28),
                new Human("Sadio","Mane",29),
                new Human("Mohammad","Salah",29),
                new Human("Roberto","Firmino",33),
                new Human("Diogo","Jota",23),
                        new Human("Henrique","Fabinho",35),
                        new Human("Divock","Origi",30),
                        new Human("Naby","Keita",30));

        System.out.println(humans.stream().sorted(Comparator.comparing(human -> human.getAge())).collect(Collectors.toList()).toString());
        System.out.println(humans.stream().mapToInt(human -> human.getAge()).average());
        System.out.println(humans.stream().mapToInt(human -> human.getAge()).max());
        System.out.println(humans.stream().mapToInt(human -> human.getAge()).min());






        try {

            FileWriter writer = new FileWriter("file.txt");

        for(Human human: humans) {
            writer.write(human + System.lineSeparator());
        }
        System.out.println("Fayla yazildi");
        writer.close();}
        catch (Exception e){
            e.printStackTrace();
        }



        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }




    }
}
