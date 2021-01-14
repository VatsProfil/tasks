package lesson010121;

public class task6 {

    public static void main(String[] args) {

        showKaprekar(1000);
    }
    
     public static void showKaprekar(int number){

       int part1,part2,divide,count;
       Integer sqri;
        for(int i=0;i<number;i++){
            sqri=i*i;
            count=sqri.toString().length();
            if(count%2==0){
                divide=count/2;
            }
            else {
                divide = (count + 1) / 2;
            }

            part1= (int) (sqri/(Math.pow(10,divide)));
            part2= (int) (sqri%(Math.pow(10,divide)));

            if(part1+part2==i){
                System.out.println(i);

            }
            


        }




}
