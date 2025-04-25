#include <stdio.h>
#include <string.h>

int main() {

    char nome[20] = "Stufio", outro_nome[20] = "Marcelo";
    
    if(strcmp(nome, outro_nome) == 0){
        printf("Nomes iguais!");
    }
    else if(strcmp(nome, outro_nome) < 0){
        printf("Nome vem antes de outro nome");
    }
    else{
        printf("Outro nome vem antes de nome");
    }

    return 0;
}