import java.io.*;
import java.util.*;
public class Main
{
    static PrintWriter out=new PrintWriter((System.out));
    public static void main(String args[])throws IOException
    {
        Reader sc=new Reader();
        int n=sc.nextInt();
        int k=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int x=1;x<=n;x++)
        {
            map.put(x,0);
        }
        for(int x=0;x<k;x++)
        {
            int d=sc.nextInt();
            for(int y=0;y<d;y++)
            {
                int a=sc.nextInt();
                if(map.containsKey(a))
                {
                    map.remove(a);
                }
            }
        }
        out.println(map.size());
        out.close();
    }

    public static void solve()
    {
    }

    static class Reader 
    { 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        public String next()
        {
            while(!st.hasMoreTokens())
            {
                try
                {
                    st=new StringTokenizer(br.readLine());
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt()
        {
            return Integer.parseInt(next());
        }

        public long nextLong()
        {
            return Long.parseLong(next());
        }

        public double nextDouble()
        {
            return Double.parseDouble(next());
        }

        public String nextLine()
        {
            try
            {
                return br.readLine();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            return null;
        }

        public boolean hasNext()
        {
            String next=null;
            try
            {
                next=br.readLine();
            }
            catch(Exception e)
            {
            }
            if(next==null)
            {
                return false;
            }
            st=new StringTokenizer(next);
            return true;
        }
    } 
}