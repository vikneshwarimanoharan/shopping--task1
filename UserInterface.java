package task1;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Products products = new Products();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Display");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter product to add: ");
                    scanner.nextLine(); // Consume newline character
                    String productToAdd = scanner.nextLine();
                    products.addProductToList(productToAdd);
                    System.out.println("Product added successfully!");
                    break;
                case 2:
                    ArrayList<String> productList = products.getProductList();
                    if (productList.isEmpty()) {
                        System.out.println("The list is empty");
                    } else {
                        System.out.println("Products in alphabetical order:");
                        products.sortProductList();
                        for (String product : productList) {
                            System.out.println(product);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the application");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please select a valid option (1-3).");
            }
        }
    }
}