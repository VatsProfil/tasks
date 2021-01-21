package lesson220121;

import com.sun.deploy.util.StringUtils;

public class taskPyramid {

    public static void main(String[] args) {

        doPyramid(20);

    }

    public static void doPyramid(int rowNum){

        int duplicateRowNum = rowNum;

        for(int i=1;i<=rowNum;i++){

            for (int k = 0; k < duplicateRowNum; k++) {
                System.out.print(" ");
            }


            for(int j=0;j<i;j++) {
                System.out.print(i + " ");
            }

            duplicateRowNum-=1;
            System.out.println();

        }

    }


}
