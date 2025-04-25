//Escreva um programa que leia uma sequência de 10 números inteiros do teclado e, ao final do programa, apresente a quantidade de números pares e a quantidade de números ímpares que foram digitados.
 

#include <stdio.h>
 
int main() {
    
    int i, num, quant_pares, quant_impares;
    
    quant_pares = 0;
    quant_impares = 0;
    
    for(i = 1; i <= 10; i++){
        printf("Informe número: ");
        scanf("%d", &num);
        
        if(num % 2 == 0){
            quant_pares++;
        }
        else{
            quant_impares++;
        }
    }
    
    printf("\nQuantidade de números pares: %d", quant_pares);
    printf("\nQuantidade de números ímpares: %d", quant_impares);
    
    return 0;
}