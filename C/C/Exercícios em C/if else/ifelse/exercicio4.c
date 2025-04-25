#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");

        float altura, peso_ideal;
        char genero;

        printf("Informe o seu genero: ");
        scanf(" %c", &genero);

        if(genero != 'H' && genero != 'h' && genero != 'M' && genero != 'm'){
            printf("Genero invalido.");
            return 0;
        }

        printf("Informe sua altura: ");
        scanf("%f", &altura);

        if(genero == 'H' || genero == 'h'){
            peso_ideal = 72.7 * altura - 58;
            printf("Ola! O seu peso ideal será de: %.1f", peso_ideal);
        }
        else if(genero == 'M' || genero == 'm'){
            peso_ideal = 62.1 * altura - 44.7;
            printf("Ola! O seu peso ideal será de: %.1f", peso_ideal);
        }
        else{
            printf("Genero invalido. Por favor informe H ou M");
        }

    return 0;
}