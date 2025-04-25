#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");

    int paes_vendidos, broas_vendidas;
    float valor_pao, valor_broas, valor_total, poupanca;

    printf("Qual a quantidade de pães franceses vendidos no dia: ");
    scanf("%d", &paes_vendidos);

    printf("Qual a quantidade de broas vendidas no dia: ");
    scanf("%d", &broas_vendidas);

    valor_pao = paes_vendidos * 0.12;
    valor_broas = broas_vendidas * 1.50;
    valor_total = valor_pao + valor_broas;
    poupanca = valor_total * 0.1;

    printf("A quantidade total arrecadada é de: R$%.2f.\n", valor_total);
    printf("A quantidade que deve ser guardada é de: R$%.2f.\n", poupanca);

    return 0;
}