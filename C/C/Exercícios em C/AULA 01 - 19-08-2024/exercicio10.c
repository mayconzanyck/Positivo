//Exercicio para calcular salario do mes
#include <stdio.h>
#include <locale.h>

int main(){

    setlocale(LC_ALL, "Portuguese");

    float salario, total_vendas, comissao;
    int sapatos_vendidos;
    
    printf("Quantos sapatos foram vendidos no mês?: ");
    scanf("%d", &sapatos_vendidos);

    printf("Qual foi o valor total das vendas?: ");
    scanf("%f", &total_vendas);

    salario = total_vendas * 0.2 + sapatos_vendidos * 5;

    printf("O salário do mês é de R$%.2f.\n", salario);

    return 0;
}