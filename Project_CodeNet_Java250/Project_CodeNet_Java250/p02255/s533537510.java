import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		ContestScanner scan = new ContestScanner();

		int N = scan.nextInt();
		int[] A = new int[N];

		for(int i=0; i < N; i++)
		{
			A[i] = scan.nextInt();
		}

		(new Solve(N, A)).solve();
	}
}
class Solve {
	private final int N;
	private final int[] A;

	public Solve(final int N, final int[] A)
	{
		this.N = N;
		this.A = A;
	}

	public void solve()
	{
		int A[] = copyNumbers(N, this.A);

		printNumList(N, A);

		for(int i=1; i < N; i++)
		{
			int v = A[i];
			int j= i - 1;

			while(j >= 0 && v < A[j])
			{
				A[j+1] = A[j];
				j--;
			}

			A[j+1] = v;

			printNumList(N, A);
		}
	}

	public int[] copyNumbers(final int N, final int[] A)
	{
		int[] numbers = new int[N];

		for(int i=0; i < N; i++) numbers[i] = A[i];

		return numbers;
	}

	public void printNumList(final int N, final int[] A)
	{
		StringBuilder sb = new StringBuilder();

		for(int i=0; i < N; i++)
		{
			sb.append(A[i]);
			sb.append(" ");
		}


		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}
}
class ContestScanner {
	BufferedReader reader;
	String[] line;
	int index;
	public ContestScanner() {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}

	public ContestScanner(String filename) throws FileNotFoundException {
		reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
	}

	public String nextToken() throws IOException {
		if(line == null || index >= line.length)
		{
			line = reader.readLine().trim().split(" ");
			index = 0;
		}

		return line[index++];
	}

	public String next() throws IOException {
		return nextToken();
	}

	public String readLine() throws IOException {
		line = null;
		index = 0;

		return reader.readLine();
	}

	public int nextInt() throws IOException, NumberFormatException {
		return Integer.parseInt(nextToken());
	}

	public long nextLong() throws IOException, NumberFormatException {
		return Long.parseLong(nextToken());
	}

	public double nextDouble() throws IOException, NumberFormatException {
		return Double.parseDouble(nextToken());
	}

	public int[] nextIntArray(int N) throws IOException, NumberFormatException {
		int[] result = new int[N];

		for(int i=0; i < N; i++) result[i] = nextInt();

		return result;
	}

	public long[] nextLongArray(int N) throws IOException, NumberFormatException {
		long[] result = new long[N];

		for(int i=0; i < N; i++) result[i] = nextLong();

		return result;
	}

	public double[] nexDoubleArray(int N) throws IOException, NumberFormatException {
		double[] result = new double[N];

		for(int i=0; i < N; i++) result[i] = nextDouble();

		return result;
	}
}