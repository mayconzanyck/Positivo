using System.Reflection;

namespace Exemplo;

class Program
{

    static void Main(string[] args)
    {
        var pessoa = (nome: "Maria", peso: 68.8, altura: 1.65);
        CalcularIMC(pessoa);
    }

    private static void CalcularIMC((string nome, double peso, double altura) pessoa){
    
        //Calcular O IMC
        var imc = pessoa.peso / (pessoa.altura * pessoa.altura);
        Console.WriteLine(pessoa.nome + " tem um IMC de: " + imc);
    }
}