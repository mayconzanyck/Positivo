//Exercicio para converter valor em real para dolar devido a taxa de cambio informada.
#include <stdio.h>
#include <locale.h>

int main(){

    setlocale(LC_ALL, "Portuguese");

    float taxa_cambio, valor_real, valor_dolar;

    printf("Informe a quantidade de reais: ");
    scanf("%f", &valor_real);

    printf("Informe a taxa de cambio atual: ");
    scanf("%f", &taxa_cambio);

    valor_dolar = valor_real / taxa_cambio;

    printf("O seu saldo em doláres é de $ %.2f.", valor_dolar);

    return 0;
}