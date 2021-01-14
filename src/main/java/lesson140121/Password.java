package lesson140121;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    public static void main(String[] args) {

       isValidPassword("Abcdabcdcdcd1");

    }

    public static void isValidPassword(String pass){

        String regex="[a-zA-Z_0-9]+[0-9]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pass);



        if(pass.length()>=10 && matcher.matches() ){

            System.out.println("valid password");
        }

        else {
            System.out.println("not valid password");
        }
    }



}
