public class Forloop {
	static int MAX = 10;

	public static void main (String[] args) {
		classic_for();
		simple_while();
		clever_while();
	}

	static void classic_for () {
		for (int i = 0; i < MAX; ++i) {
			System.out.println("classic_for: " + i);
		}
	}

	static void simple_while () {
		int i = 0;
		while (i < MAX) {
			System.out.println("simple_while: " + i);
			++i;
		}
	}

	static void clever_while () {
		int i = -1;
		while (++i < MAX) {
			System.out.println("clever_while: " + i);
		}
	}
}

