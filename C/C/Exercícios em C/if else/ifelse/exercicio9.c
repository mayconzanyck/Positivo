#include <stdio.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "Portuguese");

    int idade;

    printf("Informe a sua idade: ");
    scanf("%d", &idade);

    if (idade < 18) {
        printf("Você é menor de idade.\n");
    } else if (idade >= 65) {
        printf("Você está na terceira idade.\n");
    } else {
        printf("Você é maior de idade.\n");
    }

    return 0;
}