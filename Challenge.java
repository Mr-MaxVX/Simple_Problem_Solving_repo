/* Hello here is Max.
The idea of this code is to remove all the digits from the string.
* Or in other words all the numbers from the String has to be removed.
* A quick question I made up from a leet-code question.
*/

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
