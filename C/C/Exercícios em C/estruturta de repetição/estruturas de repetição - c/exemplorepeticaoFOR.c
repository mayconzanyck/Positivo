#include <stdio.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "Portuguese");
 
    int i;
    //pode-se declarar a variavel dentro do for, porem sera valida apenas dentro da funçao, fora nao funcionará.
    for(i = 1; i <= 5; i++){
        printf("%d\n", i);
    }
    
    printf("Valor de i: %d.", i);
    
    return 0;
}