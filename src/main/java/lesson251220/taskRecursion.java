package lesson251220;

public class taskRecursion {

    public static void main(String[] args) {

        System.out.println(calculateFact(10));
    }


    public static int calculateFact(int num){


        return (num>1)?num * calculateFact(num - 1):1;


    }

}
