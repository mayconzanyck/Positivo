#include <stdio.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "Portuguese");

    float morango, maca, desconto = 0, total_pagar, total_kg, total_valor;
    float maca_kg, morango_kg;

    printf("Informe o peso total dos morangos (kg): ");
    scanf("%f", &morango);

    printf("Informe o peso total das maçãs (kg): ");
    scanf("%f", &maca);

    if(morango <= 5){
            morango_kg = 6.50 * morango;    
    }   
    else{
            morango_kg = 6.20 * morango;
    }   

    if(maca <= 5){
            maca_kg = 3.80 * maca;
    }   
    else{
            maca_kg = 3.50 * maca;
    }
    

    total_kg = morango + maca;
    total_valor = morango_kg + maca_kg;

    if(total_kg > 10 || total_valor > 50){
        desconto = 0.1;
    }

    total_pagar = total_valor * (1 - desconto);

    printf("O valor total por %.2f kg de frutas é de R$%.2f.\n", total_kg, total_pagar);

    return 0;
}