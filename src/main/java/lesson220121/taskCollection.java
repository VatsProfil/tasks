package lesson220121;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class taskCollection {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(8);
        list.add(7);
        list.add(8);
        list.add(10);

        list.remove(3);

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }



    }




}
