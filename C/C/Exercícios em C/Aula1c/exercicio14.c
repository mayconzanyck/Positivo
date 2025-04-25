//Exercicio calculo de kw
#include <stdio.h>
#include <locale.h>

int main(){

    setlocale(LC_ALL, "Portuguese");

    float salario_minimo, valor_kw, total_pagar;
    int quantidade_kw;

    printf("Informe valor do salário minimo: R$");
    scanf("%f", &salario_minimo);

    printf("Informe a quantidade de quilowatte gasta: ");
    scanf("%d", &quantidade_kw);
    
    valor_kw = salario_minimo / 700;
    total_pagar = quantidade_kw * valor_kw;

    printf("Valor kw: %.2f.\n", valor_kw);
    printf("Total a pagar: %.2f.\n", total_pagar);

    return 0;
}