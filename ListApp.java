import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListApp {
    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args){

        //Create a list named list. I might change this.
        List<Object> list = new ArrayList<>();

        //Ask the user if they want to change a value.
        System.out.print("Do you want to add a value to the list (for yes enter y) --> ");
        String cont_add = userinput.nextLine();

        //This loop will run while the user wants to add values to the list.
        while (cont_add.equalsIgnoreCase("y")){

            //Have the user enter the value they want to add.
            System.out.print("Enter the value you would like to add --> ");
            //Add the value. I choose nextLine() because I wanted the user to be able to add integers, strings, and doubles to the list.
            list.add(userinput.nextLine());

            //Print the list so the user can see it has been updated.
            System.out.println("Here is the updated list:");
            System.out.println(list);

            //Ask the user if they want to add another value.
            System.out.print("Would you like to add another value (enter y for yes) --> ");
            cont_add = userinput.nextLine();

        }

        //Print the list.
        //I think I want to print all the values in the list with their indices here... although I'm not sure yet.
        System.out.println("Here is the list:");
        System.out.println(list);

        //The beginnings of the part where the user can change the values in the list.
        System.out.print("Would you like to change the values (enter y for yes) --> ");
        String cont_edit = userinput.nextLine();

        while(cont_edit.equalsIgnoreCase("y")){

        }

        

    }

}
