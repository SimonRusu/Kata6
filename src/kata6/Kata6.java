package kata6;

/**
 *
 * @author Simon
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproduct.models.CarToy;
import toyproduct.models.HelicopterToy;
import kata6.toys.ToyBusiness;
import toyproduct.Toy;

public class Kata6 {

    public static void main(String[] args) {
        ToyBusiness business = new ToyBusiness();
        ArrayList<Toy> toys = new ArrayList<>();
        
        Scanner in = new Scanner(System.in);
        String line = "";
        while (!line.equals("exit")) {
            line = in.nextLine();

            switch (line) {
                case "car":
                    toys.add((CarToy)business.createToy(line));
                    System.out.println("Built toys: " + toys.stream()
                            .map(c -> c.getSerialNumber().toString())
                            .collect(Collectors.joining(", ")));
                    break;
                case "helicopter":
                    toys.add((HelicopterToy)business.createToy(line));
                    System.out.println("Built toys: " + toys.stream()
                            .map(c -> c.getSerialNumber().toString())
                            .collect(Collectors.joining(", ")));
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Unknow command!");
            }
        }
    }

}
