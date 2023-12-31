import java.util.*;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String elem[] = scan.nextLine().split(" ");

    int nbCity = Integer.parseInt(elem[0]);
    int nbRoad = Integer.parseInt(elem[1]);

    int[] connexion = new int[nbCity];

    for (int i = 0; i < nbRoad; i++){
        String[] connect = scan.nextLine().split(" ");
        if (Integer.parseInt(connect[0]) <= connexion.length){
          connexion[Integer.parseInt(connect[0]) - 1]++;
        }
        if (Integer.parseInt(connect[1]) <= connexion.length){
          connexion[Integer.parseInt(connect[1]) - 1]++;
        }
    }

    for (int i = 0; i < nbCity; i++){
      System.out.println(connexion[i]);
    }

  }
}
