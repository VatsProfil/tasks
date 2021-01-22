package lesson220121;

import java.util.Scanner;

public class taskLetterDiamond {


    public static void main(String[] args) {


        int charNum=0;
        int num=0;
        int duplicateSpaceNum=0;
        int duplicateNum=0;
        int rowNum;
        int spaceNum=0;

        Scanner scanner = new Scanner(System.in);
        rowNum=scanner.nextInt();


        switch(rowNum)
        {
            case 1:
                charNum=65;
                spaceNum=0;
                break;
            case 2:
                charNum=66;
                spaceNum=2;
                break;
            case 3:
                charNum=67;
                spaceNum=4;
                break;
            case 4:
                charNum=68;
                spaceNum=6;
                break;
            case 5:
                charNum=69;
                spaceNum=8;
                break;
            case 6:
                charNum=70;
                spaceNum=10;
                break;
            case 7:
                charNum=71;
                spaceNum=12;
                break;
            case 8:
                charNum=72;
                spaceNum=14;
                break;
            case 9:
                charNum=73;
                spaceNum=16;
                break;
            case 10:
                charNum=74;
                spaceNum=18;
                break;
            case 11:
                charNum=75;
                spaceNum=20;
                break;
            case 12:
                charNum=76;
                spaceNum=22;
                break;
            case 13:
                charNum=77;
                spaceNum=24;
                break;
            case 14:
                charNum=78;
                spaceNum=26;
                break;
            case 15:
                charNum=79;
                spaceNum=28;
                break;
            case 16:
                charNum=80;
                spaceNum=30;
                break;
            case 18:
                charNum=81;
                spaceNum=32;
                break;
            case 19:
                charNum=82;
                spaceNum=34;
                break;
            case 20:
                charNum=83;
                spaceNum=36;
                break;
            case 21:
                charNum=84;
                spaceNum=38;
                break;
            case 22:
                charNum=85;
                spaceNum=40;
                break;
            case 23:
                charNum=86;
                spaceNum=42;
                break;
            case 24:
                charNum=87;
                spaceNum=44;
                break;
            case 25:
                charNum=88;
                spaceNum=46;
                break;
            case 26:
                charNum=89;
                spaceNum=48;
                break;
            case 27:
                charNum=90;
                spaceNum=50;
                break;

            default:
                System.out.println("1-27 araliginda eded daxil edilmelidir");
                break;


        }



        duplicateSpaceNum=0;

        for(int i=65; i<=charNum; i++){

            for(int k=0;k<=spaceNum;k++){
                System.out.print(" ");
            }

            for (int j=65; j<=i; j++){
                System.out.print((char)j + " ");
                num=j;
            }

            for (int k=num-1; k>=65; k--){
                System.out.print((char)k + " ");
            }

            System.out.println();
            spaceNum-=2;

        }





        for(int i=charNum;i>=65;i--){

            for (int j=0;j<=duplicateSpaceNum;j++){
                System.out.print(" ");

            }

            for(int k=65;k<=i;k++) {
                System.out.print((char) k+ " ");
                duplicateNum=k;

            }

            for (int k=i-1; k>=65; k--){
                System.out.print((char)k + " ");
            }

            System.out.println();
            duplicateSpaceNum+=2;

        }






    }






           // 65
         //65 66 65
      //65 66 67 66 65
   //65 66 67 68 67 66 65


}
