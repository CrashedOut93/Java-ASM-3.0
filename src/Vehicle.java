import java.util.Scanner;

public class Vehicle {
    int vehicleNum = 0;
    String model = "";
    String manufacture = "";
    String color = "";
    int loadingCapacity = 100;
}

class Truck extends Vehicle{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the Max capacity of your truck?");
        int loadingCapacity = scan.nextInt();

        System.out.println("What is the color of your truck?");
        String color = scan.next();

        System.out.println("Your max truck capacity is " + loadingCapacity + " and the color of the vehicle is "
         + color);
    }

}