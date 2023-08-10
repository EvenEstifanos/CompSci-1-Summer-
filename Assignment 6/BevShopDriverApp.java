import java.util.Scanner;

public class BevShopDriverApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BevShop bevShop = new BevShop();

        System.out.println("Welcome to the Beverage Shop!\n The current order in process can have at most 3 alcoholic beverages.\n"
        		+ "The minimum age to order alcohol drink is 21.");

        boolean continueAddingOrders = true;

        while (continueAddingOrders) {
            System.out.println();
            System.out.print("Enter customer name: ");
            String customerName = scanner.nextLine();

            System.out.print("Enter customer age: ");
            int customerAge = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter order time (between 8 and 23): ");
            int orderTime = Integer.parseInt(scanner.nextLine());

            if (!bevShop.isValidTime(orderTime)) {
                System.out.println("Invalid order time. Please choose between 8 and 23.");
                continue;
            }

            System.out.print("Enter order day (MONDAY, TUESDAY, ...): ");
            String orderDayStr = scanner.nextLine();
            Day orderDay = Day.valueOf(orderDayStr);

            bevShop.startNewOrder(orderTime, orderDay, customerName, customerAge);

            System.out.println("Select beverage type:");
            System.out.println("1. Coffee");
            System.out.println("2. Alcohol");
            System.out.println("3. Smoothie");

            int beverageTypeChoice = Integer.parseInt(scanner.nextLine());

            switch (beverageTypeChoice) {
                case 1:
                    System.out.print("What is the name of your coffee? ");
                    String bevName = scanner.nextLine();
                    
                    System.out.print("What is the size of your coffee? ");
                    String size = scanner.nextLine();
                    Size sizes = Size.valueOf(size);
                    
                    System.out.print("Extra shot? Y or N: ");
                    boolean extraShot = scanner.nextLine().equalsIgnoreCase("Y");
                    
                    System.out.print("Extra Syrup? Y or N: ");
                    boolean extraSyrup = scanner.nextLine().equalsIgnoreCase("Y");
                    
                    bevShop.processCoffeeOrder(bevName, sizes, extraShot, extraSyrup);
                    System.out.println("Coffee order processed!");
                    break;

                case 2:
                    if (!bevShop.isValidAge(customerAge)) {
                        System.out.println("Sorry, you are not eligible to order alcohol beverages.");
                        continue;
                    }
                    
                    System.out.print("What is the name of your Alcohol? ");
                    String alcoholBevName = scanner.nextLine();
                    
                    System.out.print("What is the size of your Alcohol? ");
                    String alcoholS = scanner.nextLine();
                    Size alcoholSize = Size.valueOf(alcoholS);

                    bevShop.processAlcoholOrder(alcoholBevName, alcoholSize);
                    System.out.println("Alcohol order processed!");
                    break;

                case 3:
                    System.out.print("What is the name of your Smoothie? ");
                    String smoothieBevName = scanner.nextLine();
                    
                    System.out.print("What is the size of your Smoothie? ");
                    String smoothieS = scanner.nextLine();
                    Size smoothieBevSize = Size.valueOf(smoothieS);
                    
                    System.out.print("How many fruits?");
                    int numOfFruits = scanner.nextInt();
                    
                    while (bevShop.isMaxFruit(numOfFruits))
                    {
                        System.out.print("Can't have more than five fruits.\nHow many numbers of fruits do you want? ");
                        numOfFruits = Integer.parseInt(scanner.nextLine());
                    }
           
 
                    System.out.print("Wanna add Protein? Y or N: ");
                    boolean addProtein = scanner.nextLine().equalsIgnoreCase("Y");
                    
                    bevShop.processSmoothieOrder(smoothieBevName, smoothieBevSize, numOfFruits, addProtein);
                    System.out.println("Smoothie order processed!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            if (!bevShop.isEligibleForMore()) {
                System.out.println("Maximum alcohol beverages per order reached.");
                break;
            }

            System.out.println("Order total amount: $" + bevShop.getCurrentOrder().calcOrderTotal());

            System.out.print("Add another order? (true/false): ");
            continueAddingOrders = Boolean.parseBoolean(scanner.nextLine());
        }

        System.out.println("Total cost of all orders: $" + bevShop.totalMonthlySale());

        scanner.close();
    }
}
