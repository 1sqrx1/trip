import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Trip {
    private int price;
    private String country;
    private int numpeople;
    private String duration;

    public Trip(int price, String country, int numpeople, String duration) {
        this.price = price;
        this.country = country;
        this.numpeople = numpeople;
        this.duration = duration;
    }

    public static void writeFile(String content) {
        try {
            FileWriter fw = new FileWriter("output.txt");
            fw.write(content);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String readFile() {
        try (FileReader reader = new FileReader("output.txt")) {
            String result = "";
            int c;
            while ((c = reader.read()) != -1) {
                result += (char) c;
            }
            System.out.println(result);
            return result;
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    public static void Start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("   Welcome to Travel Explorer!");
        System.out.println("======================================");

        System.out.println("1. List");
        System.out.println("2. Log In");
        System.out.println("3. Register");
        System.out.println("4. Exit");
        System.out.print("Enter your choice (1-4): ");

        String choice = scanner.nextLine();

        switch (choice) {

            case "1":
                System.out.println("Redirecting to list...");
                list();
                Start();
            case "2":
                System.out.println("Redirecting to login...");
                login();
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Start();
            case "3":
                System.out.println("Redirecting to registration...");
                register();
                Start();
            case "4":
                System.out.println("Thank you for using Travel Explorer. Safe travels!");
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 4.");
        }


        scanner.close();
    }


        public static void register() {
            Scanner sc = new Scanner(System.in);

            System.out.println("=== User Registration ===");
            System.out.println("Enter your name:");
            String name = sc.nextLine();
            System.out.println("Enter your email:");
            String email = sc.nextLine();
            System.out.println("Create your password:");
            String password = sc.nextLine();
            System.out.println("Registration succesful!");
            System.out.println("Welcome, " + name + "!");
            String userdata = "name: " + name + "\nemail: " + email + "\npassword: " + password + "\n";
            writeFile(userdata);
        }

        public static void login() {
            Scanner sc = new Scanner(System.in);
            int i = 0;
            while (i != 1) {
                System.out.println("=== User Log In ===");
                System.out.println("Enter your name:");
                String name = sc.nextLine();
                System.out.println("Enter your email:");
                String email = sc.nextLine();
                System.out.println("Enter your password:");
                String password = sc.nextLine();
                String userdata = "name: " + name + "\nemail: " + email + "\npassword: " + password + "\n";
                if (Trip.readFile().equals(userdata)) {
                    System.out.println("Login succesful");
                    i++;
                } else {
                    System.out.println("Incorrect email or password");
                }
            }
        }

        public static void list(){

        Scanner sc = new Scanner(System.in);
            System.out.println("Enter your amount of money for trip: ");
            int money = sc.nextInt();
            System.out.println("\nEnter the country you want to visit: ");
            String country = sc.nextLine();
            System.out.println("Enter the number of people you are travelling: ");
            int num = sc.nextInt();
            System.out.println("\nEnter the duration: ");
            int duration = sc.nextInt();
            if (country != "Norwey" && country != "Italy" && country != "France" && country != "Switzerland" && country != "Germany")  {

            }

    }


            public int getPrice () {
                return price;
            }

            public void setPrice ( int price){
                this.price = price;
            }

            public String getCountry () {
                return country;
            }

            public void setCountry (String country){
                this.country = country;
            }

            public int getNumpeople () {
                return numpeople;
            }

            public void setNumpeople ( int numpeople){
                this.numpeople = numpeople;
            }

            public String getDuration () {
                return duration;
            }

            public void setDuration (String duration){
                this.duration = duration;
            }
        }

