import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};

        int counter = 0;//Tekrar sayısı hesaplamak için
        int[] visited = new int[array.length];//Her sayının kaç kere yazıldığını gösterir

        System.out.println("Tekrar sayıları");

        for (int i = 0; i < array.length; i++) {
            if (visited[i] == 1) {
                continue; // Zaten sayılmışsa bir sonraki adıma geçer
            }
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
            if (array[i] == array[j]) {
                count++;
                visited[j] = 1; // Sayıldığını işaretler
            }
        }
            if (count > 1) {
                counter++;
                System.out.println(array[i] + " sayısı " + count + " kere tekrar edildi");
            }
        }
    }

}