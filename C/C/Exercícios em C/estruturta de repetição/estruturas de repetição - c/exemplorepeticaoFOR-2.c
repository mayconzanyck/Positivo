#include <stdio.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "Portuguese");
 
    int num, i;

    printf("Informe numero desejado: ");
    scanf("%d", &num);
    
    //O valor final pode ser uma variavel
    for(i = 1; i <= num; i++){
        printf("%d\n", i);
        
    }
    
    return 0;
}