import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

        // takes in name of user and greets them
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name + "!");

        Car volvo = new Car("Volvo", "V40", 2012, "blue");
        Car porsche = new Car("Porsche", "Panamera", 2009, "red");
        Car audi = new Car("Audi", "A3", 2018, "grey");
        
        System.out.printf(volvo.getDetails());

        System.out.println("What colour would you like your car to be?");
        String newColour = scanner.nextLine();
        volvo.setColour(newColour);
        System.out.printf(volvo.getDetails());

        scanner.close();

    }
}