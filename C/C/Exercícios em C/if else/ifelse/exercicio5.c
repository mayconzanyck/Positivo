#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");

    float num;

    printf("Informe um numero: ");
    scanf("%f", &num);

    if(num>=20 && num<=90){
        printf("O numero %.2f esta entre 20 e 90.\n",num);
    }
    else{
        printf("O numero %.2f não se encontra entre 20 e 90.\n", num);
    }
    
    return 0;
}