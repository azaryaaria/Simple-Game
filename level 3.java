import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean acuan = true;
        int barisMap = 5, kolomMap = 7;
        int x = 1;
        int y = 0;
        char map [][] = new char[barisMap][kolomMap];
        System.out.println("A = You");
        System.out.println("! = Finish Mark");
        System.out.println("Kanan = Bergerak ke kanan");
        System.out.println("Kiri  = Bergerak ke kiri");
        System.out.println("Atas  = Bergerak ke atas");
        System.out.println("Bawah = Bergerak ke bawah");
        System.out.println();
        do {
            emptyMap(map, barisMap, kolomMap);
            defaultMap(map, x, y);
            spawnMap(map, barisMap, kolomMap);
            Scanner scr = new Scanner(System.in);
            String pilihan = scr.nextLine();
            if (pilihan.equalsIgnoreCase("bawah")) {
                x++;
            } else if (pilihan.equalsIgnoreCase("atas")) {

                if (x > 1) {
                    x--;
                } else if (x == 1) {
                    System.out.println("You can't do that!");
                }
            }else if(pilihan.equalsIgnoreCase("kanan")){
                y++;
            }
            else if(pilihan.equalsIgnoreCase("kiri")){

                if (y == 3) {
                    if (x >= 2) {
                        System.out.println("You can't do that!");
                    }
                    if (x == 1) {
                        y--;
                    }
                }else if(y!=0){
                    y--;
                }else if (y==0){
                    System.out.println("You can't do that!");
                }

            }else {
                System.out.println("Wrong command!");
            }
            if (x == 3 && y == 5){
                emptyMap(map, barisMap, kolomMap);
                defaultMap(map, x, y);
                spawnMap(map, barisMap, kolomMap);
                System.out.println("Congratulation!");
                acuan = false;
                break;
            }

            System.out.println("-".repeat(10));

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
    public static void defaultMap(char map[][], int x, int y) {
        for (int i = 0; i < 5; i++) {
            map[0][i] = '=';
        }
        for (int i = 0; i < 2; i++) {
            map[2][i] = '=';
        }
        for (int i = 2; i < 5; i++) {
            map[i][2] = '|';
        }
        for (int i = 3; i < 6; i++) {
            map[4][i] = '=';
        }
        for (int i = 0; i < 2; i++) {
            map[i][4] = '|';
        }
        map[0][4] = '=';
        map[2][4] = '|';
        map[2][6] = '=';
        map[3][6] = '|';
        map[4][6] = '|';
        map[2][5] = '=';
        map[3][5] = '!';
        map[x][y] = 'A';
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
