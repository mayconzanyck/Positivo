//Exercicio para calcular valor total de aluguel
#include <stdio.h>
#include <locale.h>

int main(){

    setlocale(LC_ALL, "Portuguese");

    float km_percorrido, valor_total;
    int dias_alugados;

    printf ("Informe a quantidade de quilometros percorridos: ");
    scanf ("%f", &km_percorrido);

    printf ("Informe a quantidade de dias que o carro foi alugado: ");
    scanf ("%d", &dias_alugados);

    valor_total = dias_alugados * 70 + km_percorrido * 0.15;

    printf ("O valor total a pagar será de %.2f\n", valor_total);

    return 0;
}