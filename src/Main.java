import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfRows = scanner.nextInt();
        int numberOfColumn = scanner.nextInt();
        int[][] map = new int[numberOfRows][numberOfColumn];
        int[][] result = new int[numberOfRows][numberOfColumn];
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumn; j++) {
                map[i][j] = scanner.nextInt();
                result[i][j] = 0;
            }
        }

        if (!isMapFlat(map)) {
            for (int i = 1; i < numberOfRows-1; i++) {
                for (int j = 1; j < numberOfColumn-1; j++) {
                    int min = map[i][j];
                    if (map[i-1][j] == 0) {
                        min = 0;
                    }
                    if (map[i-1][j] > min) {
                        min = map[i-1][j];
                    }
                    if (map[i][j-1] == 0) {
                        min = 0;
                    }
                    if(map[i][j-1] > min)
                }
            }

        } else {
            System.out.println("flat");
        }



        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumn; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isMapFlat(int[][] map) {
        int num = map[0][0];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (num != map[i][j]) return false;
            }
        }
        return true;
    }
}
