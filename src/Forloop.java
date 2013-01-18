public class Forloop {
	static int MAX = 10;

	public static void main (String[] args) {
		classic_for();
		simple_while();
		clever_while();
		foreach();
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

	static void foreach () {
		for (int i : range(0, MAX)) {
			System.out.println("foreach: " + i );
		}
		for (int i : range(MAX, 0)) {
			System.out.println("foreach (reversed range): " + i );
		}
	}

	static int[] range (int initial, int max) {
		if (initial > max) {
			int[] range = new int[initial - max];
			int i = initial + 1;
			while (--i > max) {
				range[initial - i] = i;
			}
			return range;
		}
		int[] range = new int[max - initial];
		int i = initial - 1;
		while (++i < max) {
			range[i - initial] = i;
		}
		return range;
	}
}

