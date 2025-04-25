#include <stdio.h>
#include <locale.h>

int main(){
	
	setlocale(LC_ALL, "Portuguese");
	
	float nota1, nota2, media;
	
	printf("Informe a primeira nota: ");
	scanf("%f", &nota1);
	
	printf("Informe a segunda nota: ");
	scanf("%f", &nota2);
	
	media = (nota1 + nota2) / 2;
	
	printf("Sua media é: %.1f", media);
	
	if(media >= 6){
		printf("\nVocê esta Aprovado!");
	}
	else{
		printf("\nVocê esta Reprovado!");
	}
	
	return 0;
}