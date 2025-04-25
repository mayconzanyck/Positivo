//Exercicio para calculo de consumo médio e autonomia
#include <stdio.h>
#include <locale.h>

int main(){

    setlocale(LC_ALL, "Portuguese");

    float capacidade_tanque, litros_abastecidos, km_percorrida, consumo_medio, autonomia;
    
    printf ("Informe a capacidade de litros do tanque: ");
    scanf ("%f", &capacidade_tanque);

    printf ("Informe a quantidade de litros abastecidos: ");
    scanf ("%f", &litros_abastecidos);

    printf ("Informe a distancia percorrida desde o ultimo abastecimento: ");
    scanf ("%f", &km_percorrida);

    consumo_medio = km_percorrida / litros_abastecidos;
    autonomia = capacidade_tanque * consumo_medio;

    printf ("O consumo médio é de %.2f km/l.\n", consumo_medio);
    printf ("A autonomia é de %.2f km.", autonomia);
    
    return 0;
}