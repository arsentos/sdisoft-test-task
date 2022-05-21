import java.util.Scanner;

public class HeightMap {
    private final int[][] map;
    private final int[][] result;
    private final int numberOfRows;
    private final int numberOfColumns;

    public HeightMap(int numberOfRows, int numberOfColumns) {
        this.numberOfRows = numberOfRows;
        this.numberOfColumns = numberOfColumns;
        Scanner scanner = new Scanner(System.in);
        map = new int[numberOfRows][numberOfColumns];
        result = new int[numberOfRows][numberOfColumns];
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                map[i][j] = scanner.nextInt();
                result[i][j] = 0;
            }
        }
    }

    public void getResult() {
        for (int i = 1; i < numberOfRows-1; i++) {
            for (int j = 1; j < numberOfColumns-1; j++) {
                if (map[i-1][j] > map[i][j] &&
                    map[i][j-1] > map[i][j] &&
                    map[i][j+1] > map[i][j] &&
                    map[i+1][j] > map[i][j]) {

                }
            }
        }
    }




    public void printMap() {
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//---
//        создаем такой же двумерный массив_озер для отметки озер и для возврата как результат в итоге
//
//        идем циклом по массиву гор от 1 до n-1 и от 1 до m-1 {
//
//        массив_озер[i,j]!= 0? ///клетка уже включена в какое-то озеро
//        continue
//
//        если ли там гарантировано вода? (вода гарантировано есть, если все соседи > этой клетки) {
//
//        помечаем эту клетку в массиве озер номером озера
//        у каждой соседней (север юг запад восток) спрашиваем сколько_воды_у_тебя(номер_озера, ее координаты, откуда я)
//        берем минимум из ответов и сохраняем в мапку эту высоту для этого озера
//        }
//        }
//        проходим циклом по массиву озер и вместо номера озера ставим высоту воды из мапки
//        ---
//
//        функция сколько_воды_у_тебя(номер_озера, m, n, откуда_спросили): Int
//        если (m,n) - локальный максимум (все клетки-соседи ниже)
//        return массив_гор[m, n] // высота этой горы
//        иначе
//        массив_озер[m,n] = номер_озера
//        спрашиваю у соседей кроме того направления откуда_спросили, сколько у них воды и отвечаю минимум из этих уровней