//Escreva um programa que mostre a tabuada de um número inteiro qualquer que será digitado pelo usuário, mas a tabuada não deve necessariamente iniciar em 1 e terminar em 10, ou seja, o valor inicial e final devem ser informados também pelo usuário, conforme mostrado no exemplo a seguir: 
//Mostrar a tabuada de: 5 Começar por: 4 Terminar em: 7
//5 X 4 = 20
//5 X 5 = 25
//5 X 6 = 30
//5 X 7 = 35

#include <stdio.h>

int main() {

    int tabuada, comecar, terminar, i;

    printf("Mostrar tabuada de: ");
    scanf("%d", &tabuada);

    printf("Começar por: ");
    canf("%d", &comecar);

    printf("Terminar em: ");
    scanf("%d", &terminar);

    for(i = comecar; i <= terminar; i++){
        printf("\n%d x %d = %d", tabuada, i, tabuada * i);
    }
    
return 0;
}