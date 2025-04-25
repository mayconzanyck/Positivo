#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");

    float num1, num2, soma;

    printf("Informe o primeiro numero: ");
    scanf("%f", &num1);

    printf("Informe o segundo numero: ");
    scanf("%f", &num2);

    soma = num1 + num2;

    if(soma >= 20){
        printf("O numero sera %.2f", soma - 5);
    } 
    else{
       printf("O numero sera %.2f", soma + 8);
    }

    return 0;
}