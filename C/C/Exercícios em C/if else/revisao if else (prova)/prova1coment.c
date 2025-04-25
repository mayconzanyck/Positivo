#include <stdio.h> // Inclui a biblioteca padrão de entrada e saída

int main() {
    // Declaração de variáveis
    int i, num, quant_pares, quant_impares;
    
    // Inicializa contadores de números pares e ímpares
    quant_pares = 0;
    quant_impares = 0;
    
    // Loop que se repete 10 vezes
    for(i = 1; i <= 10; i++) {
        // Solicita ao usuário para informar um número
        printf("Informe número: ");
        scanf("%d", &num); // Lê o número informado pelo usuário
        
        // Verifica se o número é par
        if(num % 2 == 0) {
            quant_pares++; // Incrementa contador de pares
        }
        else {
            quant_impares++; // Incrementa contador de ímpares
        }
    }
    
    // Exibe a quantidade de números pares e ímpares
    printf("\nQuantidade de números pares: %d", quant_pares);
    printf("\nQuantidade de números ímpares: %d", quant_impares);
    
    // Retorna 0 para indicar que o programa terminou com sucesso
    return 0;
}