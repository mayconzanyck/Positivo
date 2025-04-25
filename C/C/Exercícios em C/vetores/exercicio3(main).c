//Escreva um programa que alimente um vetor com 5 números e calcule a média destes valores. Nasequência, apresente na tela os valores que são iguais ou superiores à média.
#include <stdio.h>

int main() {

    //Para alimentar o vetor ja preenchido é so colocar "numeros[5] = {1, 2, 3, 4, 5}".
    float numeros[5], soma, media;
    int i;
    
    soma = 0;
    
    for(i = 0; i < 5; i++){
        printf("Informe numero: ");
        scanf("%f", &numeros[i]);

        //soma += numeros[i];
    }

    for(i = 0; i < 5; i++){
        soma += numeros[i];
    }
    
    //media dividido pela qauntidade de numeros no vetor.
    media = soma / 5;
    
        for(i = 0; i < 5; i++){
        if(numeros[i] >= media){
            printf("%.2f ", numeros[i]);
        }
    }

    return 0;
}