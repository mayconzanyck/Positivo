#include <stdio.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "Portuguese");

    int num1, num2, num3;

    printf("Informe o primeiro valor inteiro: ");
    scanf("%d", &num1);

    printf("Informe o segundo valor inteiro: ");
    scanf("%d", &num2);

    printf("Informe o terceiro valor inteiro: ");
    scanf("%d", &num3);

    if(num1 <= num2 && num1 <= num3){
        printf("O menor valor é %d.\n", num1);
    }
    else if(num2 <= num1 && num2 <= num3){
        printf("O menor valor é %d.\n", num2);
    }
    else{
        printf("O menor valor é %d.\n", num3);
    }
    return 0;
}