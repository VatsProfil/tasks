package lesson010121;

public class task6 {

    public static void main(String[] args) {

        Integer number= 88209;
        int count=number.toString().length(),part1,part2;
        int divide;
        if(count%2==0){
            divide=count/2;
        }
        else {
            divide = (count + 1) / 2;
        }

        part1=number/(10^divide);
        part2=number%(10^divide);




    }




}
