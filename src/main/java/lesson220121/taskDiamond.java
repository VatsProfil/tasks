package lesson220121;

public class taskDiamond {


    public static void main(String[] args) {

        doDiamond(7);

    }

    public static void doDiamond(int rowNum){


        int duplicateRowNum = rowNum;
        int num=0;


        for(int i=0;i<rowNum*2;i+=2){

            for(int k=1;k<duplicateRowNum;k++){
                System.out.print(" ");
            }


            for (int j=-1;j<i;j++){
            System.out.print("*");}

            duplicateRowNum-=1;
            System.out.println();



        }





        for(int i=0;i<rowNum*2;i+=2){


            for (int j=0;j<num;j++){
                System.out.print(" ");

            }

            for(int k=rowNum*2-1;k>i;k--) {
                System.out.print("*");

            }



            System.out.println();
            num++;



        }









        }







}



