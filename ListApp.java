import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListApp {
    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args){

        //Create a list named list. I might change this.
        List<Object> list = new ArrayList<>();

        //This list is going to be filled when the user changes the list.
        List<Object> newList = new ArrayList<>();

        //Formatting.
        System.out.println("\n");

        //Ask the user if they want to change a value.
        System.out.print("Do you want to add a value to the list (for yes enter y) --> ");
        String cont_add = userinput.nextLine();

        //This loop will run while the user wants to add values to the list.
        while (cont_add.equalsIgnoreCase("y")){

            //Formatting.
            System.out.println("\n");

            //Have the user ente\nr the value they want to add.
            System.out.print("Enter the value you would like to add --> ");
            //Add the value. I choose nextLine() because I wanted the user to be able to add integers, strings, and doubles to the list.
            list.add(userinput.nextLine());

            //Formatting.
            System.out.println("\n");

            //Print the list so the user can see it has been updated.
            System.out.println("Here is the updated list:");
            System.out.println(list);

            //Formatting.
            System.out.println("\n");

            //Ask the user if they want to add another value.
            System.out.print("Would you like to add another value (enter y for yes) --> ");
            cont_add = userinput.nextLine();

            //Formatting.
            System.out.println("\n");

            //Print out the final list.
            System.out.println(list);
        }

        //Formatting.
        System.out.println("\n");

        //Print the values of the list with their indices.
        System.out.println("Here are the values in the list with their indices:");
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i) + " has an index of " + i);
        }

        //Formatting.
        System.out.println("\n");

        //Ask the user if they want to change the list.
        System.out.print("Would you like to change the values (enter y for yes) --> ");
        String cont_edit = userinput.nextLine();

        //While the user wants to edit the list, continue executing the loop.
        while(cont_edit.equalsIgnoreCase("y")){

            //Formatting.
            System.out.println("\n");

            //Ask the user for the index of the value they want to change.
            System.out.print("Enter the index of the value you want to change --> ");
            int index = userinput.nextInt();
            userinput.nextLine();

            //Iterate through the list with a for loop.
            for (int j = 0; j < list.size(); j++){

                //Test if the current value of j is the value the user entered.
                if (j==index){

                    //Formatting.
                    System.out.println("\n");

                    //Ask the user to enter the new value.
                    System.out.print("Enter the new value you want at index " + j + " --> ");

                    //Add the new value to the new list.
                    newList.add(userinput.next());
                }

                //Run this code if the current value of j is not equal to the value the user entered.
                else{

                    //Add the value in the old list to the new list.
                    newList.add(list.get(j));
                }
                }

                //Formatting.
                System.out.println("\n");

                //Print out the values in the new list with their indices.
                System.out.println("Here are all the values in the new list with their indices: ");
                for(int k=0; k<newList.size(); k++){
                    System.out.println(newList.get(k) + " has an index of " + k);
                }
                
                //Formatting.
                System.out.println("\n");

                //Ask the user if they want to change another value.
                System.out.print("Do you want to change another value in the list --> ");

                cont_edit = userinput.nextLine();
                userinput.next();
        }

        //Formatting.
        System.out.println("\n");

        //Tell the user that the program is ending.
        System.out.println("The program is ending...");

        //Formatting.
        System.out.println("\n");
    }
}
