//Escreva um programa que apresente o seguinte menu:
//# MENU PRINCIPAL #
//[1] Inserir
//[2] Excluir
//[3] Consultar
//[4] Listar
//[5] Sair
//Se as opções 1, 2, 3 ou 4 forem escolhidas, mostrar na tela o nome da opção (Inserir, Excluir, Consultar, Listar). Se a opção 5 for escolhida, encerrar a execução do programa

#include <stdio.h>

int main() {

    int opcao;

    do{

        printf("# MENU PRINCIPAL #\n");
        printf("\n[1] Inserir.");
        printf("\n[2] Excluir.");
        printf("\n[3] Consultar.");
        printf("\n[4] Listar.");
        printf("\n[5] Sair\n");
        scanf("%d", &opcao);

    switch(opcao){
        case 1: printf("Opção escolhida: Inserir\n"); break;
        case 2: printf("Opção escolhida: Excluir\n"); break;
        case 3: printf("Opção escolhida: Consultar\n"); break;
        case 4: printf("Opção escolhida: Listar\n"); break;
    }

    }while(opcao != 5);
    
return 0;
}