#include <stdio.h>
#include <stdlib.h>

int MAX = 10;

void classic_for () {
	int i;
	for (i = 0; i < MAX; ++i) {
		printf("classic_for: %d\n", i);
	}
}

int main (int argc, char **argv) {
	classic_for();
	return EXIT_SUCCESS;
}

