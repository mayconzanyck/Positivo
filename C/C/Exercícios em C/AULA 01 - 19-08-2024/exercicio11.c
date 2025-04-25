//Exercicio calculo de total de votos
#include <stdio.h>
#include <locale.h>

int main(){

    setlocale(LC_ALL, "Portuguese");

    int voto_branco, voto_nulo, voto_valido, total_votos;
    float perc_branco, perc_nulo, perc_valido;

    printf("Informe o total de votos brancos: ");
    scanf("%d", &voto_branco);

    printf("Informe o total de votos nulos: ");
    scanf("%d", &voto_nulo);

    printf("Informe o total de votos validos: ");
    scanf("%d", &voto_valido);

    total_votos = voto_branco + voto_nulo + voto_valido;
    perc_branco = (voto_branco * 100.0) / total_votos;
    perc_nulo = (voto_nulo * 100.0) / total_votos;
    perc_valido = (voto_valido * 100.0) / total_votos;

    printf("A porcentagem dos votos que são brancos é de: %.2f%%.\n", perc_branco);
    printf("A porcentagem dos votos que são nulos é de: %.2f%%.\n", perc_nulo);
    printf("A porcentagem dos votos que são validos é de: %.2f%%.\n", perc_valido);

    return 0;
}