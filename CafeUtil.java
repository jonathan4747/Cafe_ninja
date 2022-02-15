import java.util.ArrayList;
public class CafeUtil{

    public static int getStreakGoal(  ){
        int sum = 0;
        for (int i = 1 ; i <= 10; i++ ){
            sum = i + sum;
        }
        return sum;
    }

    public static double getOrderTotal (double[] prices){
        double sum = 0;
        for(int i = 0; i <prices.length ; i++){
            sum = prices[i]+ sum;
        }
        return sum;
    }

    public static void displayMenu(ArrayList<String> menuItems){
        for(int i = 0 ; i <= menuItems.size()-1; i++){
            String resultado =  String.format("%d %s", i , menuItems.get( i ));
            System.out.println(resultado);

        }
    }

    public ArrayList<String> addCustomer(ArrayList<String> customers){
        System.out.println("Por favor, ingresa tu nombre: ");
        String userName = System.console().readLine();
        System.out.println("Hola, "+userName);
        customers.add(userName);
        int numerodeclientes= customers.size()-1;
        System.out.println("Hay "+numerodeclientes + " personas frente a ti" );
        System.out.println(customers);
        return customers;
    }

}

