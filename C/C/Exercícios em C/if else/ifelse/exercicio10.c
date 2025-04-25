#include <stdio.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "Portuguese");

    int folhas;
    float total_pagar;

    printf("Informe o total de cópias: ");
    scanf("%d", &folhas);

    if(folhas > 100){
        total_pagar = folhas * 0.20;
    }
    else{
        total_pagar = folhas * 0.25;
    }

    printf("O total a pagar pelas %d cópias, será de R$%.2f.\n", folhas, total_pagar);

    return 0;
}