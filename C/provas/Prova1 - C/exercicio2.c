#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");

    int total_cavalos, total_ferraduras;

    printf("Informe a quantidade total de cavalos: ");
    scanf("%d", &total_cavalos);

    total_ferraduras = total_cavalos * 4;

    printf("O total de ferraduras necessarias para equipar todos cavalos é de: %d", total_ferraduras);

    return 0;
}