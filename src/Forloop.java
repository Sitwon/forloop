public class Forloop {
	static int MAX = 10;

	public static void main (String[] args) {
		classic_for();
	}

	static void classic_for () {
		for (int i = 0; i < MAX; ++i) {
			System.out.println("classic_for: " + i);
		}
	}
}

