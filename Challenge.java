import java.util.Scanner;


public class Challenge {



    public static void main (String[] Max){

        Scanner input;
        input = new Scanner(System.in);


        System.out.print("Type your name : ");
        String name = input.next();
        System.out.println(name);

        for(int i = 0; i < name.length(); i++) {

            if (name.charAt(i) == 48|| name.charAt(i) == 49|| name.charAt(i) == 50|| name.charAt(i) == 51|| name.charAt(i) == 52|| name.charAt(i) == 53|| name.charAt(i) == 54|| name.charAt(i) == 55|| name.charAt(i) == 56|| name.charAt(i) == 57){

                System.out.print("");


            }else {
                System.out.print(name.charAt(i));


            }
        }
    }
}
