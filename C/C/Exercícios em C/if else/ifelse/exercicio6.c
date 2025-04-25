#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");

    int num;

    printf("Informe um numero: ");
    scanf("%d", &num);

    if(num % 2 == 0 && num % 3 == 0){
        printf("O numero %d é divisivel por 2 e por 3.\n", num);
    } 
    else {
        printf("O numero %d não é divisivel por 2 e por 3.\n", num);
    } 

    return 0;
}