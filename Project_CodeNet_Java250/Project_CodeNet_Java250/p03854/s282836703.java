import java.util.*;

class Main {

  public static void main(String[] args) {

    String[] motValide = new String[]{"eraser", "erase", "dreamer", "dream"};

    Scanner scan = new Scanner(System.in);
    String chaine = scan.nextLine();

    for(int i = 0; i < motValide.length; i++)
      chaine = chaine.replace(motValide[i], ".");


      int compteur = 0;

      for (int k = 0; k < chaine.length(); k++){
        if (chaine.charAt(k) == '.'){
          compteur = compteur+1;
        }
      }


    if (chaine.length() == compteur)
      System.out.println("YES");
    else
      System.out.println("NO");

  }

}
