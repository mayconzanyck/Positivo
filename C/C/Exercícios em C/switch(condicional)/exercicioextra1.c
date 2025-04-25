//Switch/case é usado quando o valor que sera digitado pelo usauario ja é informado, assim não necessitando usar if e else.
#include <stdio.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "Portuguese");

    int codigo;
    
    printf("Informe o código: ");
    scanf("%d", &codigo);
    
    switch(codigo){
        case 110: printf("Vestuário.\n"); break;
        case 120: printf("Eletrodomesticos.\n"); break;
        case 130: printf("Informática.\n"); break;
        case 140: printf("Literatura.\n"); break;
        case 150: printf("Artigos Esportivos.\n"); break;
        default: printf("Código Inválido.\n");

    return 0;
}