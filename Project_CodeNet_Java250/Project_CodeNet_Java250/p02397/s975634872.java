import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);

int i=1;
int tmp;
while(true){
int x = sc.nextInt();
int y = sc.nextInt();
if(x==0 && y==0){break;}

if(x>y){
tmp =x;
x=y;
y=tmp;
}

System.out.println(x+" "+y);
i=i+1;

}

}
}