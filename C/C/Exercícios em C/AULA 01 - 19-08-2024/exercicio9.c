//Exercicio para calcular gorjeta e valor total de um restaurante
#include <stdio.h>
#include <locale.h>

int main(){

    setlocale(LC_ALL, "Portuguese");

    float valor_gasto, gorjeta, total_pagar;

    printf ("Informe o valor gasto: R$");
    scanf ("%f", &valor_gasto);

    gorjeta = valor_gasto * 0.1;
    total_pagar = valor_gasto + gorjeta;

    printf ("O valor da gorjeta será de R$%.2f.\n", gorjeta);
    printf ("O valor total a pagar será de R$%.2f.\n", total_pagar);

    return 0;
}