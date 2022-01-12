import java.util.Scanner;

public class level2 {
    public static void main(String[] args) {
        int x = 0;
        int barisMap = 5, kolomMap = 3;
        char map [][] = new char[barisMap][kolomMap];
        boolean acuan = true;
        System.out.println("A = Karakter anda");
        System.out.println("! = Garis Finish");
        System.out.println("Atas = Bergerak ke atas");
        System.out.println("Bawah  = Bergerak ke bawah");
        do {
            emptyMap(map, barisMap, kolomMap);
            defaultMap(map, barisMap, x);
            spawnMap(map, barisMap, kolomMap);
            Scanner scr = new Scanner(System.in);
            String pilihan = scr.nextLine();
            if (pilihan.equalsIgnoreCase("bawah")) {
                x++;
            } else if (pilihan.equalsIgnoreCase("atas")) {

                if (x > 0) {
                    x--;
                } else if (x == 0) {
                    System.out.println("You can't do that!");
                }
            } else {
                System.out.println("Wrong command!");
            }
            if (x == 4){
                emptyMap(map, barisMap, kolomMap);
                defaultMap(map, barisMap, x);
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
    public static void defaultMap(char map[][], int barisMap, int x){
        for (int i = 0; i < barisMap; i++) {
            map[i][0] = '|';
            map[i][2] = '|';
            map[4][1] = '!';
            map[x][1] = 'A';
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
    public static void walk (String pilihan, int x){
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
    }
}
    
