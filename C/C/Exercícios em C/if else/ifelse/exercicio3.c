#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");

    float num;

    printf("Informe um numero: ");
    scanf("%f", &num);

    if(num < 0){
        printf("O numero sera: %.1f", num * -1);
    }
    else{
        printf("O numero sera: %.1f", num);
    }

    return 0;
}