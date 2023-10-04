import java.io.*;
import java.util.StringTokenizer;
  
class Main{
  
static final PrintWriter out=new PrintWriter(System.out);
static int ans=0;
  
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
int n=Integer.parseInt(line);
int[] a=new int[n];
StringTokenizer st=new StringTokenizer(br.readLine());
for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());
SelectionSort(a);
getValue(a);
out.println(ans);
out.flush();
}
}
  
private static void swap(int[] a,int s,int t){
int tmp=a[s]; a[s]=a[t]; a[t]=tmp; ans++;
}
  
private static void SelectionSort(int[] a){
for(int i=0;i<a.length-1;i++){
int min=i;
for(int j=i+1;j<a.length;j++){
if(a[j]<a[min]) min=j;
}
if(i!=min) swap(a,i,min);
}
}
  
private static void getValue(int[] a){
for(int i=0;i<a.length-1;i++) out.print(a[i]+" ");
out.println(a[a.length-1]);
}
}