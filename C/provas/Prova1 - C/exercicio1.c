#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Poruguese");

    int anos, batimentos_total, batimentos_por_ano;

    printf("Informe a sua idade: ");
    scanf("%d", &anos);

    batimentos_por_ano = 60 * 60 * 24 * 365;
    batimentos_total = batimentos_por_ano * anos;

    printf("O seu coração ja bateu %d vezes.\n", batimentos_total);

    return 0;
}