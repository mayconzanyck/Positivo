//Exercicio de total_segundos
#include <stdio.h>
#include <locale.h>

int main(){
	
	setlocale(LC_ALL, "Portuguese");
	
	int horas, minutos, segundos, total_segundos;
	
	printf("Informe horas: ");
	scanf("%d", &horas);
	
	printf("Informe minutos: ");
	scanf("%d", &minutos);
	
	printf("Informe segundos: ");
	scanf("%d", &minutos);
	
	total_segundos = horas * 3600 + minutos * 60 + segundos;
	
	printf("O tempo total em segundos é de: %d segundos", total_segundos);
	
	return 0;
}