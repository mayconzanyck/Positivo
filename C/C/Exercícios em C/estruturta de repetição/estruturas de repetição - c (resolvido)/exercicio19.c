//Escreva um programa que apresente na tela o seguinte menu:
//# MENU PRINCIPAL #
//[1] Digitar um número par
//[2] Digitar um número ímpar
//[3] Sair
//Caso o usuário escolha a opção 1, ele deve digitar um número par para voltar ao menu. O mesmo deve ser feito na opção 2, mas para um número ímpar. Caso o usuário escolha a opção 3, o programa deve apresentar a quantidade de números pares digitados na opção 1, a quantidade de números ímpares digitados na opção 2 e encerrar o programa.

#include <stdio.h>

int main() {

    int opcao, num, quant_pares, quant_impares;

    quant_pares = 0;
    quant_impares = 0;

    do{
        printf("# MENU PRINCIPAL #\n");
        printf("\n[1] Digitar um número par.");
        printf("\n[2] Digitar um número ímpar.");
        printf("\n[3] Sair\n");
        scanf("%d", &opcao);

    switch(opcao){
        case 1:
            do{
                printf("Digite um número par: ");
                scanf("%d", &num);
            }while(num % 2 != 0);

            quant_pares++;
            break;

        case 2:
            do{
                printf("Digite um número ímpar: ");
                scanf("%d", &num);
            }while(num % 2 == 0);

        quant_impares++;
        break;
        
    }

    }while(opcao != 3);
    
    printf("\nQuantidade números pares: %d", quant_pares);
    printf("\nQuantidade números ímpares: %d", quant_impares);

return 0;
}