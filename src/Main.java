import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);

    System.out.print("Please enter your party affiliation [D,R,I, other]: ");

    String party = in.nextLine();

    if(party.equalsIgnoreCase("D")) {
        System.out.println("You get a Democratic Donkey! ");
    }
    else if(party.equalsIgnoreCase("R")) {
        System.out.println("You get a Republican Elephant! ");
    }
    else if(party.equalsIgnoreCase("I")) {
        System.out.println("You get a Independent Person! ");
    }
    else if(party.equalsIgnoreCase("other")) {
        System.out.println("You get a Other Patriot! ");

    }
    else
    {
       System.out.println("You've entered invalid code! Please type [D,R,I,other]: ");
    }

    }
}