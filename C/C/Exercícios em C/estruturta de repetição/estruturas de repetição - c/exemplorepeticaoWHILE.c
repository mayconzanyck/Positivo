#include <stdio.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "Portuguese");

    //(i) seria a mesma coisa que "contador".
    int i;
    
    i = 1;
    
    while(i <= 5){
        printf("%d\n", i);
        i = i + 1;
        //podendo ser utilizado i++; ou i--; para soma ou diminuir o contador em UM.
    }

    return 0;
}