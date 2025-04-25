//Exercicio troca de variaveis
#include <stdio.h>
#include <locale.h>

int main(){

    setlocale(LC_ALL, "Portuguese");

    int a, b, c;

    printf("Informe o primeiro valor: ");
    scanf("%d", &a);

    printf("Informe o segundo valor: ");
    scanf("%d", &b);

    c = a;
    a = b;
    b = c;

    printf("O valor do primeiro numero é de %d e o segundo de %d.\n", a, b);
    
    return 0;
}