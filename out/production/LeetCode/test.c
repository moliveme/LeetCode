#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int* ar = malloc(sizeof(int) * 4);
    printf("sizeof(ar) %d sizeof(int) %d num els %d\n",
            sizeof(ar), sizeof(int), sizeof(ar)/sizeof(int));

    free(ar);
    ar = NULL;
    return 0;
}