#include <stdio.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "Portuguese");

    int num;

    printf("Informe um número: ");
    scanf("%d", &num);

    if(num % 2 == 0 && num % 7 == 0) {
        printf("O número %d é divisível por 2 e por 7.\n", num);
    }
    else if(num % 2 == 0) {
        printf("O número %d é divisível apenas por 2.\n", num);
    }
    else if(num % 7 == 0) {
        printf("O número %d é divisível apenas por 7.\n", num);
    }
    else {
        printf("O número %d não é divisível nem por 2 nem por 7.\n", num);
    }

    return 0;
}