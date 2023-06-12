public class CarApplications {

    public static void main(String[] args) {
        introduction();
        table();
        // Creating objects of class to use in the program
        // Using variables made in class Car, 4 different car models are created with its own-
        // individual statistics
        CarDealership mercedes = new CarDealership("Mercedes", "CLA 250", "Black", 25, 95000);
        CarDealership audi = new CarDealership("Audi", "Rs7", "Nardo Grey", 30, 145000);
        CarDealership honda = new CarDealership("Honda", "CRV", "White", 4, 32000);
        CarDealership toyota = new CarDealership("Toyota", "Rav 4", "Red", 9, 25000);

        // Creating a 2d array with all the elements listed above
        CarDealership[] inventory = new CarDealership[4];
        // 4 Different arrays with their own set of values
        inventory[0] = mercedes;
        inventory[1] = audi;
        inventory[2] = honda;
        inventory[3] = toyota;
        // Using the array with the methods in class Car
        for (int i = 0; i < 4; i++) {
            inventory[i].printHeading();
        }

        String customerChoice = CarDealership.choices();
        // THe method purchaseDetails will only occur if the the correct values/spelling is used
        if (customerChoice.equalsIgnoreCase("Mercedes CLA 250") ||
                customerChoice.equalsIgnoreCase("Honda CRV") ||
                customerChoice.equalsIgnoreCase("Toyota Rav 4") ||
                customerChoice.equalsIgnoreCase("Audi Rs7")) {
            CarDealership.purchaseDetails(customerChoice);
        }

    }

    public static void introduction(){
        System.out.println("Hello! Welcome to our dealership.");
        System.out.println("There is a vast amount of cars to choose " +
                "from so take a look and let us know when you are ready to choose.\n");
    }

    public static void table() {
        System.out.format("%-20s %-15s", "Car Model", "Colour");
        System.out.format("%-15s %-15s", "In Stock", "Price");
    }
}