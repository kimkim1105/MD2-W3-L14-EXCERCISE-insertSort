import java.util.Scanner;

public class InsertSort {
    public static void insertSort(int[] list){
        int cnt =0;
        int pos,x;
        for (int i = 0; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (pos>0&&x<list[pos-1]){
                list[pos]=list[pos-1];
                pos--;
            }
            list[pos]=x;
            cnt = cnt+1;
            System.out.println(cnt);
        }
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+"\t");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai mang: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap vao phan tu thu "+(i+1));
            list[i] = scanner.nextInt();
        }
        insertSort(list);
    }
}
