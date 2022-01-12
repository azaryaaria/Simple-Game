import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int barisMap = 3, kolomMap = 5;
        char map [][] = new char[barisMap][kolomMap];
        boolean acuan = true;
        int x = 0;
        System.out.println("A = You");
        System.out.println("! = Finish Mark");
        System.out.println("Kanan = Bergerak ke kanan");
        System.out.println("Kiri = Bergerak ke kiri");
        do{
            emptyMap(map, barisMap, kolomMap);
            defaultMap(map, kolomMap, x);
            spawnMap(map, barisMap, kolomMap);
            Scanner scr = new Scanner(System.in);
            String pilihan = scr.nextLine();
            if(pilihan.equalsIgnoreCase("kanan")){
                x++;
            }
            else if(pilihan.equalsIgnoreCase("kiri")){

                if(x>0){
                    x--;
                }else if (x==0){
                    System.out.println("You can't do that!");
                }
            }else {
                System.out.println("Wrong command!");
            }
            if (x == 4){
                emptyMap(map, barisMap, kolomMap);
                defaultMap(map, kolomMap, x);
                spawnMap(map, barisMap, kolomMap);
                System.out.println("Congratulation!");
                acuan = false;
            }
        }while(acuan);

    }
    public static void emptyMap(char map[][], int barisMap, int kolomMap){
        for (int i = 0; i < barisMap; i++){
            map[i][0] = ' ';
            for (int j = 1; j < kolomMap; j++){
                map[i][j] = ' ';
            }
        }
    }
    public static void defaultMap(char map[][], int kolomMap, int x){
        for (int i = 0; i < kolomMap; i++) {
            map[0][i] = '-';
            map[2][i] = '-';
            map[1][4] = '!';
            map[1][x] = 'A';
        }
    }
    public static void spawnMap(char map[][],int barisMap,int kolomMap  ){
        for (int i = 0; i < barisMap; i++) {
            System.out.print(map[i][0]);
            for (int j = 1; j < kolomMap; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
