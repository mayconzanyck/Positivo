#include <stdio.h>

int main() {
    // Loop de A (65) a Z (90)
    for (char letra = 'A'; letra <= 'Z'; letra++) {
        printf("%c ", letra);
    }
    printf("\n"); // Nova linha após a impressão
    return 0;
}