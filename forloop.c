#include <stdio.h>
#include <stdlib.h>

int MAX = 10;

void classic_for () {
	int i;
	for (i = 0; i < MAX; ++i) {
		printf("classic_for: %d\n", i);
	}
}

void simple_while () {
	int i = 0;
	while (i < MAX) {
		printf("simple_while: %d\n", i);
		++i;
	}
}

void clever_while () {
	int i = -1;
	while (++i < MAX) {
		printf("clever_while: %d\n", i);
	}
}

int main (int argc, char **argv) {
	classic_for();
	simple_while();
	clever_while();
	return EXIT_SUCCESS;
}

