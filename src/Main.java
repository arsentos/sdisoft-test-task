import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfRows = scanner.nextInt();
        int numberOfColumn = scanner.nextInt();
        HeightMap map = new HeightMap(numberOfRows, numberOfColumn);
        map.printMap();
    }

}
