#include <stdio.h>
#include <locale.h>

int main(){
	
	setlocale(LC_ALL, "Portuguese");
	
	float nota1, nota2, nota3, media;
	
	printf("Escreva a primeira nota: ");
	scanf("%f", &nota1);
	
	printf("Escreva a segunda nota: ");
	scanf("%f", &nota2);
	
	printf("Escreva a terceira nota: ");
	scanf("%f", &nota3);
	
	media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
	
	printf("A média do aluno é de: %.1f.", media);
	
	return 0;
}
