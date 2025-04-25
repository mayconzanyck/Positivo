#include <stdio.h>
#include <stdbool.h>

int main() {

    int vetor[8] = {15, 15, 15, 15, 15, 
    15, 15, 15}, i;
    bool iguais = true;
    
    for(i = 1; i < 8; i++){
        if(vetor[i] != vetor[0]){
            iguais = false;
        }
    }
    
        if(iguais == true){
            printf("Os elementos são iguais!");
        }else{
            printf("Os elementos são diferentes!");
        };
    
    return 0;
}