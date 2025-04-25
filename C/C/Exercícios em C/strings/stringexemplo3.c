#include <stdio.h>
#include <string.h>

int main() {

    char senha[20] = "123", confirmar_senha[20] = "12345";
    
    //cmp = comparação
    if(strcmp(senha, confirmar_senha) == 0){
        printf("As senhas conferem!");
    }
    else{
        printf("As senhas não conferem!");
    }

    return 0;
}