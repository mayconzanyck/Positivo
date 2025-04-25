#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");

    int num1, num2;
    
    printf("Informe o primeiro numero: ");
    scanf("%d", &num1);
    
    printf("Informe o segundo numero: ");
    scanf("%d", &num2);

    if(num1 > num2){
        printf("A ordem numerica sera: %d e %d", num2, num1);
    }
    else{
        printf("A ordem numerica sera: %d e %d", num1, num2);
    }

    return 0;
}