package org.kodluyoruz;
import java.util.*;

public class Main {



    //Aysun ERDEM 
    
          
        public static char gamer;
        public static char computer;
        static ArrayList<Integer> gamerPositions = new ArrayList<Integer>();
        static ArrayList<Integer> computerPositions = new ArrayList<Integer>();
    
        public static void main(String[] Args) {
    
            int row = 0, column = 0, panelSize = 0;
            //int gamerScore = 0, computerScore= 0;
    
    
            Scanner input = new Scanner(System.in);
            char panel[][] = new char[panelSize][panelSize];
    
            System.out.println("...SOS OYUNU...");
    
    
            System.out.println("Panel büyüklüğü için 3 ve 7 arasında olacak şekilde bir sayı giriniz: ");
            panelSize = input.nextInt(8);
    
            Random random = new Random();
            int number = random.nextInt(2);  //0 ve 1 arasında random
    
            if (number == 1) {
    
                System.out.println("İlk Gamer oyuncusu başlayacak ve S kullanacaktır.");
                gamer = 'S';
                computer = 'O';
    
            }
    
            else if (number == 0) {
    
                System.out.println("İlk Computer oyuncusu başlayacak ve 0 kullanacaktır.");
                computer = '0';
                gamer = 'S';
            }
    
    
            for (int x=0;x<(panelSize*panelSize);x++) {
    
    
            switch (panelSize) {
                case 3:
    
                    panel = new char[3][3];
                    printTable(panel);
                    break;
    
                case 4:
    
                    panel = new char[4][4];
                    printTable(panel);
                    break;
    
                case 5:
    
                    panel = new char[5][5];
                    printTable(panel);
                    break;
    
                case 6:
    
                    panel = new char[6][6];
                    printTable(panel);
                    break;
    
                case 7:
    
                    panel = new char[7][7];
                    printTable(panel);
                    break;
    
                default:
                    System.out.println("Lütfen 3 ve 7 arasında bir sayı giriniz: ");
                    panelSize = input.nextInt();
    
            }
    
                for (int i = 0; i < panelSize; i++) {
    
                    for (int j = 0; j < panelSize; j++) {
    
                        panel[i][j]=' ';
    
                    }
    
                }
    
    
          if ((panelSize >= 3) && (panelSize <= 7)) {
    
             //boolean sira=true;
                int i=0,j=0;
    
                if(number==1){
    
                    setGamer((Character) gamer);
    
                        if (i<(panelSize*panelSize)) {
    
                            //gamer = 'S';
                            //computer = 'O';
                            inputGamer(row, column);
                            inputComputer(row, column);
                            //i++;
                        }}
    
                else if (number==0){
    
                    setGamer((Character) computer);
                        if (j<((panelSize*panelSize))) {
    
                           // computer = 'O';
                            //gamer = 'S';
                            inputComputer(row, column);
                            inputGamer(row, column);
                            //j++;
                        }}
                    }
    
                }}
    
       public static char setGamer(char gamer){
            //int row = 0;
            //int column = 0;
            //char[][] panel = new char[row][column];
    
            //gamer= (char) panel[row][column];
    
    
            return gamer;
    
        }
    
        public static char setComputer(char computer) {
            //int row = 0;
            //int column = 0;
            //char[][] panel = new char[row][column];
    
            //computer = panel[row][column];
            return computer;
    
        }
    
    
    
            private static void printTable ( char[][] panel){
    
    
                for (int i = 0; i < panel.length; i++) {
    
                    System.out.println("-------------------------------------");
    
                    System.out.print("| ");
    
                    for (int j = 0; j < panel.length; j++) {
    
                        System.out.print(" ");
    
                        System.out.print(panel[i][j]);
    
                        System.out.print(" ");
    
                        System.out.print("| ");
    
                    }
    
                    System.out.println("");
    
                }
    
                System.out.println("-------------------------------------");
    
            }
    
            private static void inputGamer ( int row, int column){
                //char gamer=0, computer = 0;
                System.out.print(gamer + " >> Satır numarasını giriniz : ");
    
                Scanner scanner = new Scanner(System.in);
                row = scanner.nextInt();
    
    
                System.out.print(gamer + " >> Sütun numarasını giriniz : ");
    
                column = scanner.nextInt();
    
            }
    
            private static void inputComputer ( int row, int column){
                //char gamer=0, computer = 0;
                System.out.print(computer + " >> Bilgisayarın atadığı satır numarası : ");
    
                Random randoms = new Random();
                row = randoms.nextInt(3);
                System.out.println(row);
    
                System.out.print(computer + " >> Bilgisayarın atadığı sütun numarası : ");
    
                column = randoms.nextInt(3);
                System.out.println(column);
            }
    
    
            public static void placePiece(){
    
    
    
    
            }
    
    
        public static void placePiece(char[][] panel, int position, char user,int number) {
    
            char symbol = ' ';
    
            if(number==1) {
                symbol='S';
    
                gamerPositions.add(position);
    
            } else if (number==0) {
                symbol = 'O';
                computerPositions.add(position);
            }
    
            switch(position) {
                case 1:
                    panel[0][0] = symbol;
                    break;
                case 2:
                    panel[0][2] = symbol;
                    break;
                case 3:
                    panel[0][4] = symbol;
                    break;
                case 4:
                    panel[2][0] = symbol;
                    break;
                case 5:
                    panel[2][2] = symbol;
                    break;
                case 6:
                    panel[2][4] = symbol;
                    break;
                case 7:
                    panel[4][0] = symbol;
                    break;
                case 8:
                    panel[4][2] = symbol;
                    break;
                case 9:
                    panel[4][4] = symbol;
                    break;
                default:
                    break;
            }
    
    
        }}
    
    