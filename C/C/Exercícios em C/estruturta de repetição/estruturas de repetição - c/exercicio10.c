#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");

    int num, i, fatorial;

    fatorial = 1;

    printf("Informe um numero: ");
    scanf("%d", &num);
    
    for(i = 1; i <= num; i++){
        //fatorial *= 1
        fatorial = fatorial * i;
    }

    printf("Fatorial de %d é %d.\n", num, fatorial);

    return 0;
}