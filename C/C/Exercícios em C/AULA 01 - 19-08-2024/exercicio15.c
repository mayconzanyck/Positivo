//Exercicio total de litros
#include <stdio.h>
#include <locale.h>

int main() {

    setlocale(LC_ALL, "Portuguese");

    int quantidade_latas, quantidade_garrafas_600ml, quantidade_garrafas_2l;
    float total_litros;

    printf("Informe a quantidade de latas de 350 ml: ");
    scanf("%d", &quantidade_latas);

    printf("Informe a quantidade de garrafas de 600 ml: ");
    scanf("%d", &quantidade_garrafas_600ml);

    printf("Informe a quantidade de garrafas de 2 litros: ");
    scanf("%d", &quantidade_garrafas_2l);
    
    total_litros = (quantidade_latas * 0.350) + (quantidade_garrafas_600ml * 0.600) + (quantidade_garrafas_2l * 2.0);

    printf("Total de litros de refrigerante comprados: %.2f L\n", total_litros);

    return 0;
}