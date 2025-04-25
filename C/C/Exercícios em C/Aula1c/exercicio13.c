//Exercicio calcular altura do predio
#include <stdio.h>
#include <locale.h>

int main(){

    setlocale(LC_ALL, "Portuguese");

    float minha_sombra, sombra_predio, minha_altura, altura_predio;

    printf("Informe o comprimento da sua sombra: ");
    scanf("%f", &minha_sombra);

    printf("Informe o comprimento da sombra do prédio: ");
    scanf("%f", &sombra_predio);

    printf("Informe a sua altura: ");
    scanf("%f", &minha_altura);

    altura_predio = (sombra_predio / minha_sombra) * minha_altura;

    printf("A altura do prédio é de %.2f.\n", altura_predio);

    return 0;
}