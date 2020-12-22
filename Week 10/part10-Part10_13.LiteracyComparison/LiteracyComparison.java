
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LiteracyComparison {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(Paths.get("literacy.csv"));
            ArrayList<LandLiteracy> landList = new ArrayList<>();

            while (scanner.hasNextLine()) {
               String readLine = scanner.nextLine();
               String[] parts = readLine.split(",");
                double litRate = Double.valueOf(parts[5]);
                parts[2] = parts[2].trim();
                String partsOf2[] = parts[2].split(" ");
                String gender = partsOf2[0];
                landList.add(new LandLiteracy(parts[3], parts[4], gender, litRate));

            }

            Collections.sort(landList);
            landList.stream().forEach(item -> System.out.println(item.toString()));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
