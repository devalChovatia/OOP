import java.lang.String;
import java.util.Scanner;


public class CarDealership {

    // Creating the variables in class Car to use in class CarApplications
    String brand;
    String model;
    String colour;
    int inStock;
    int price;

    // Giving parameters to "Car" so it can be used in a different class
    CarDealership(String brand, String model, String colour, int inStock,int price) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.inStock = inStock;
        this.price = price;
    }
    // Creating a method to display the table with cars
    public void printHeading() {

        System.out.println("");
        System.out.format("%-21s", brand + " " + model);
        System.out.format("%-18s", colour);
        System.out.format("%-13s", inStock);
        System.out.format("%-15s", price);
    }

    public static String choices() {
        System.out.println("\nPlease enter the full name of the car you wish to buy " +
                "and we'll see if we can get it for you.");

        Scanner scanner = new Scanner(System.in);

        String choice = scanner.nextLine();
        String formattedChoice = choice.trim();
        // Display of information for Mercedes
        if (formattedChoice.equalsIgnoreCase("Mercedes CLA 250")) {
            System.out.println("\nGood choice, Mercedes is one of the best innovative cars ever made.");
            System.out.println("The 2.0-Litre four-cylinder engine that generates 221 HP will surely get you from " +
                    "0-60 in less than 6.2s");
            // Display of information for Audi
        } else if (formattedChoice.equalsIgnoreCase("Audi Rs7")) {
            System.out.println("\nAudi Rs7 is the best there is when searching for a luxurious yet fast vehicle.");
            System.out.println("The car is the fastest one we sell in this dealership with a total HP of 591." +
                    "\nThis car is great for a weekday, weekend, track, or just riding casually around the streets.");
            // Display of information for Honda
        } else if (formattedChoice.equalsIgnoreCase("Honda CRV")) {
            System.out.println("\nOur 2023 Honda CRV is packed with many of our latest technology");
            System.out.println("The affordable but also sleek build is a perfect car for anyone and anywhere");
            // Display of information for Toyota
        } else if (formattedChoice.equalsIgnoreCase("Toyota Rav 4")) {
            System.out.println("\nToyota Rav 4, how can you go wrong with a car like this.");
            System.out.println("The best family car there is, ranging from sports events, business meetings," +
                    "or even picking your child from soccer practices.");
            // Else statement if the user does not enter the name correctly
        } else {
            System.out.println("Please enter correct model");
        }
        // Returning the variable so it can be used in a different method/class
        return formattedChoice;

    }
    // A method to calculate the price and the type of payment options the user would like to do
    public static void purchaseDetails(String choice){
        System.out.println("\nAre you sure would like to purchase this model?");
        Scanner scanner2 = new Scanner(System.in);
        String confirmAnswer = scanner2.nextLine();
        if (confirmAnswer.equalsIgnoreCase("yes")){
            System.out.println("Congrats on deciding your car. I will run up all the " +
                    "calculations of the cost and we can decide the payment plans.");

            if(choice.equalsIgnoreCase("Mercedes CLA 250")){
                System.out.println("Your total price has come out to be $" +
                        95000*1.13 + "\n" + "\nWould you like to pay upfront or put a down payment? (Cash or Down Payment)");
                String choice3 = scanner2.nextLine();
                if(choice3.equalsIgnoreCase("Cash")){
                    System.out.println("Alright we'll have everything ready for you");
                } else {
                    System.out.println("\nAlright, so the monthly costs to pay off the car in about 8 years " +
                            "is " + (95000*1.13)/(8*12) + "/month");
                }

            }
            if(choice.equalsIgnoreCase("Audi Rs7")){
                System.out.println("Your total price has come out to be $" +
                        145000*1.13 + "\n" + "\nWould you like to pay upfront or put a down payment? (Cash or Down Payment)");
                String choice3 = scanner2.nextLine();
                if(choice3.equalsIgnoreCase("Cash")){
                    System.out.println("Alright, we'll have everything ready for you");
                } else {
                    System.out.println("\nAlright, so the monthly costs to pay off the car in about 8 years " +
                            "is " + (145000*1.13)/(8*12) + "/month");
                }

            }
            if(choice.equalsIgnoreCase("Honda CRV")){
                System.out.println("Your total price has come out to be $" +
                        32000*1.13 + "\n" + "\nWould you like to pay upfront or put a down payment? (Cash or Down Payment)");
                String choice3 = scanner2.nextLine();
                if(choice3.equalsIgnoreCase("Cash")){
                    System.out.println("Alright we'll have everything ready for you");
                } else {
                    System.out.println("\nAlright, so the monthly costs to pay off the car in about 8 years " +
                            "is " + (32000*1.13)/(8*12) + "/month");
                }

            }
            if(choice.equalsIgnoreCase("Toyota Rav 4")){
                System.out.println("Your total price has come out to be $" +
                        25000*1.13 + "\n" + "\nWould you like to pay upfront or put a down payment? (Cash or Down Payment)");
                String choice3 = scanner2.nextLine();
                if(choice3.equalsIgnoreCase("Cash")){
                    System.out.println("Alright we'll have everything ready for you");
                } else {
                    System.out.println("\nAlright, so the monthly costs to pay off the car in about 8 years " +
                            "is " + (25000*1.13)/(8*12) + "/month");
                }

            }
            System.out.println("We'll have all the paperwork ready in a few days, we'll let you know" +
                    "when you can stop by to fill it out and receive your brand new car.");
            System.out.println("Goodbye and have a great day. ");
        } else {
            System.out.println("You didn't confirm your purchase.. See you next time. Have a good day");
        }
    }
}





