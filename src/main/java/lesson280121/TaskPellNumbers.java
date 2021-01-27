package lesson280121;

public class TaskPellNumbers {

    public static void main(String[] args) {


        PellNumbers(1000);


    }

    public static void PellNumbers(int count){

        int pellNumberstart=0,pellNumberBefore=1,pellNumber,i=0,num;

        while(i<count) {

            pellNumber=pellNumberBefore*2 + pellNumberstart;
            System.out.println(pellNumber);

            num=pellNumberBefore;
            pellNumberBefore=pellNumber;
            pellNumberstart=num;

            i++;

        }


    }

}
