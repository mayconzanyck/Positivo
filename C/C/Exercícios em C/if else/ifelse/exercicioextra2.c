#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");

    float media, nota1, nota2

    printf("Informe a primeira nota: ");
    scanf("%f", &nota1);

    printf("Informe a psegunda nota: ");
    scanf("%f", &nota2);

    media = (nota1 + nota2) / 2;

    printf("Sua media é de: %.1f", media)

    if(media)

    return 0;
}