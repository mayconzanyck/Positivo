//Exercicio area 
#include <stdio.h>
//Mudar para portugues
#include <locale.h>

int main() {
	
    setlocale(LC_ALL, "Portuguese");

	float base, altura, area;
	
	printf("Informe base: ");
	scanf("%f", &base);
	
	printf("Informe a altura: ");
	scanf("%f", &altura);
	
	area = base * altura / 2;
	
    //(%.2f) para definir apenas 2 casas decimais após a virgula, (%.1f) uma casa decimal
	printf("A área é de: %.2f", area);
	
	return 0;
}