import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main {
    // ?????????????????? ???????????????
    private static boolean[][] card = new boolean[4][13];
    
    // ?????????
    private static void initCards() {
        // ?????????????????????false (??????) ??§?????????
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 13; j++) {
                card[i][j] = false;
            }
        }
    }
    
    // ???????????????????????????????????????
    public static void findCard(int suit, int number) {
        card[suit][number-1] = true;
    }
    
    // ????????????????????¨?????????
    public static void showNothingCard() {
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 13; j++) {
                if(card[i][j] == false) {
                    showCardKind(i, j);
                }
            }
        }
    }
    
    // ?????????????¨???\??????????????¨?????????
    public static void showCardKind(int suit, int number) {
        switch(suit) {
            case 0:
                // 0???????????????
                System.out.println("S " + (number+1));
                break;
            case 1:
                // 1????????????
                System.out.println("H " + (number+1));
                break;
            case 2:
                // 2????????????
                System.out.println("C " + (number+1));
                break;
            case 3 :
                // 3????????????
                System.out.println("D " + (number+1));
                break;
        }
    }
    
    public static void main(String[] args) {
        try {
            
            BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
            
            String line;
            int count = 0;
            int cardCount = 0;
            while((line = stdReader.readLine()) != null) {
                // ?????????????????°?????????
                if(count == 0) {
                    initCards();
                    cardCount = Integer.parseInt(line);
                    count++;
                    continue;
                }
                // ???????????\????????????????¨?????????????
                String[] card = line.split(" ", 0);
                String suit = card[0];
                int number = Integer.parseInt(card[1]);
                
                if(suit.equals("S")) {
                    findCard(0, number);
                }
                if(suit.equals("H")) {
                    findCard(1, number);
                }
                if(suit.equals("C")) {
                    findCard(2, number);
                }
                if(suit.equals("D")) {
                    findCard(3, number);
                }
                
                count++;
                
                // ?????°?????°????????£??????????????°???????????????
                if(count == cardCount+1) {
                    showNothingCard();
                    
                    count = 0;
                    continue;
                }
            }
            stdReader.close();
        } catch(Exception e) {
            System.out.println(e);
            e.getStackTrace();
            System.exit(-1);
        }
    }
}