//Exercicio para transformar celsisus em fahrenheit
#include <stdio.h>
#include <locale.h>

int main(){

    setlocale(LC_ALL, "Portuguese");

    float celsius, fahrenheit;

    printf("Informe a temperatura em celsius: ");
    scanf("%f", &celsius);

    fahrenheit = celsius * 1.8 + 32;

    printf("A temperatura em fahrenheit é de %.1f °F.", fahrenheit);

    return 0;
}