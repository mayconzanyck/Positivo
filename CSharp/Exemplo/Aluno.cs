namespace Exemplo;

public class Aluno {
    
    public int Id {get;}

    public string Name{get; set;}

    public Aluno(){
        Random rnd = new Random();

        Id = rnd.Next(1, 50);
    }
}