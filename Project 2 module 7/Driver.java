import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();

    //Array list for monkey
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    public static void main(String[] args) {

        String menuChoice = "";

        initializeDogList();
        initializeMonkeyList();

        //switch case loop that determines if theres a new dog, monkey, animal, or print animals
    while (!menuChoice.equalsIgnoreCase("q")) {
        displayMenu();
        menuChoice = scanner.nextLine();
        switch (menuChoice) {
            case "1":
                intakeNewDog(scanner);
                break;
            case "2":
                intakeNewMonkey(scanner);
                break;
            case "3":
                reserveAnimal(scanner);
                break;
            case "4":
                printAnimals('4');
                break;
            case "5":
                printAnimals('5');
                break;
            case "6":
                printAnimals('6');
                break;
            default:
                if (!menuChoice.equalsIgnoreCase("q")) {
                    System.out.println("Input not valid, enter another input.");
                }
            break;
        }
    }

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Anthony", "4", "26.3", "25.8", "Marmoset", "Male", "4", "30", "2/11/2024", "United States", "intake", "false", "United States");
        Monkey monkey2 = new Monkey("George", "2", "22.4", "23.5", "Macaque", "Male", "6", "27", "12/25/2023", "United States", "in service", "true", "United States");
        Monkey monkey3 = new Monkey("Alison", "7", "19.8", "22.1", "Tamarin", "Female", "8", "25", "10/20/2023", "United States", "in service", "true", "United States");

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
            //get dogs breed
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
            //get dogs gender
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
            //get dog's age
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
            //get dog's weight
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
            //get acquisition date
        System.out.println("What is the dog's acquisition date?");
        String acquisitionDate = scanner.nextLine();
            //get acquisition country
        System.out.println("What is the dog's acquisition country?");
        String acquisitionCountry = scanner.nextLine();
            //get training status
        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();
            //get reservation status
        System.out.println("Is the dog reserved?");
        Boolean reservationStatus = scanner.nextBoolean();
        scanner.nextLine();
            //get in service country
        System.out.println("What country is the dog in service in?");
        String  inServiceCountry = scanner.nextLine();

        Dog dog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reservationStatus, inServiceCountry);
        dogList.add(dog);
        System.out.println("Dog has been added to system.");

    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();

            for (Monkey monkey: monkeyList) {
                if (monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("This monkey is currently in the system.");
                    return;
                }
            }
                //get monkey tail length
            System.out.println("What is the monkey's tail length?");
            String tailLength = scanner.nextLine();
                //get monkey height
            System.out.println("What is the monkey's height?");
            String height = scanner.nextLine();
                //get body length
            System.out.println("What is the monkey's body length?");
            String bodyLength = scanner.nextLine();
                //get species
            System.out.println("What is the monkey's species?");
            String species = scanner.nextLine();

            //make sure species is eligible
            while (!(Arrays.asList("Tamarin", "Squirrel monkey", "Marmoset", "Macaque", "Guenon", "Capuchin").contains(species))) {
                System.out.println("This is not an eligible monkey species, please enter an eligible species.");
                species = scanner.nextLine();
            }
                //get gender
            System.out.println("What is the monkey's gender?");
            String gender = scanner.nextLine();
                //get age
            System.out.println("What is the monkey's age?");
            String age = scanner.nextLine();
                //get weight
            System.out.println("What is the monkey's weight?");
            String weight = scanner.nextLine();
                //get acquisition date
            System.out.println("What is the monkey's acquisition date?");
            String acquisitionDate = scanner.nextLine();
                //get acquisition country
            System.out.println("What is the monkey's acquisition country?");
            String acquisitionCountry = scanner.nextLine();
                //get training status
            System.out.println("What is the monkey's training status?");
            String trainingStatus = scanner.nextLine();
                //get reserved status
            System.out.println("What is the monkey's reservation status?");
            boolean reservation = scanner.nextBoolean();
            scanner.nextLine();
                //get in service country
            System.out.println("What is the monkey's in service country?");
            String serviceCountry = scanner.nextLine();

            Monkey monkey = new Monkey(name, tailLength, height, bodyLength, species, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reservation, serviceCountry);
            monkeyList.add(monkey);
            System.out.println("Monkey has been added to system.");
        }

        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("Are you reserving a dog or monkey?");
            String animalType = scanner.nextLine();
            System.out.println("What is the in service country?");
            String inServiceCountry = scanner.nextLine();

            //check availability and reserve
            if (animalType.equalsIgnoreCase("Dog")) {
                for(Dog dog: dogList) {
                    if (dog.getInServiceLocation().equals(inServiceCountry) && dog.getReserved() == false && dog.getTrainingStatus() == "in service") {
                        dog.setReserved(true);
                        System.out.println("You have reserved " + dog.toString());
                        reservationStatus = true;
                        return;
                    }
                }
                if (reservationStatus == false) {
                    System.out.println("No dog is available currently.");
                }
            }
            if (animalType.equalsIgnoreCase("Monkey")) {
                for (Monkey monkey: monkeyList) {
                    if (monkey.getInServiceLocation().equalsIgnoreCase(inServiceCountry) && monkey.getReserved() == false && monkey.getTrainingStatus() == "in service") {
                        monkey.setReserved(true);
                        System.out.println("You have reserved " + monkey.toString());
                        reservation = true;
                        return;
                    }

        }
    }
}

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(char menuChoice) {
                //prints all dogs
            if (menuChoice == '4') {
                for (int i=0; i < dogList.size(); i++) {
                    System.out.println(dogList.get(i).toString());
                }
            }
            
                //prints all monkeys
            else if (menuChoice == '5') {
                for (int i=0; i < monkeyList.size(); i++) {
                    System.out.println(monkeyList.get(i).toString());
                }
            }

                //prints all animals in service and not reserved
            else if (menuChoice == '6') {
                    //all dogs in service and not reserved
                for (int i=0; i<dogList.size(); i++) {
                    if (dogList.get(i).getTrainingStatus().equals("in service") && dogList.get(i).getReserved() == false) {
                        System.out.println(dogList.get(i).toString());
                    }
                }
                    //all monkeys in service and not reserved
                for (int i=0; i<monkeyList.size(); i++) {
                    if (monkeyList.get(i).getTrainingStatus().equals("in service") && monkeyList.get(i).getReserved() == false) {
                        System.out.println(monkeyList.get(i).toString());
                    }
            }
        }
    }
}
