//A definição de "amplitude" em Estatística é dada pela grandeza numérica resultante da diferença entre o maior valor e o menor valor do conjunto de valores de uma amostra. Escreva programa que leia uma sequencia de números reais positivos terminada em zero (o número zero não deve ser processado pois serve para marcar o final da entrada de dados). O programa deve determinar e mostrar o valor da amplitude estatística dos valores. Exemplo: para a sequencia 4.5, 5.2, 1.7, 1.3, 1.9, 2.2, 8.3, 9.1, 5.4 e 0, teremos o resultado de 7.8 como amplitude.

#include <stdio.h>

int main() {

    float num, menor, maior, amplitude;

    printf("Informe número: ");
    scanf("%f", &num);

    menor = num;
    maior = num;

    while(num != 0){

        if(num < menor){
            menor = num;
        }

        if(num > maior){
            maior = num;
        }

    printf("Informe número: ");
    scanf("%f", &num);
    }

    amplitude = maior - menor;

    printf("A amplitude é: %.1f", amplitude);
    
return 0;
}