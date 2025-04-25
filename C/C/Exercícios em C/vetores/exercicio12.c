//Escreva um programa que alimente um vetor G de 6 elementos contendo o gabarito da Mega-Sena e um vetor A de 10 elementos contendo uma aposta. A seguir, mostre na tela quantos pontos fez o apostador.
#include <stdio.h>

int main() {
   //G de gabarito
    int G[6] = {1, 2, 3, 4, 5, 6}, A[10] = {1, 10, 2, 20, 3, 30, 4, 40, 5, 50}, quant_acertos = 0, i, j;

    for(i = 0; i < 6; i++){
        for(j = 0; j < 10; j++){
            if(G[i] == A[j]){
                quant_acertos++;
            }
        }
    }
    
    printf("Acertos: %d.\n", quant_acertos);

    return 0;
}