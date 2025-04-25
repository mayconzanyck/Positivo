/*
----------------------------
Interface: Autenticavel.java
----------------------------
*/

//Define o "contrato" para qualquer classe que quiser autenticar

public interface Autenticavel {
    
    //Metodo que TODA classe que implementar essa interface sera OBRIGADA a definir
    void autenticar(String usuario, String senha);
    
}

//interface: define um contrato, e nao uma classe com logica
//O metodo autenticar nao tem corpo, ele apenas diz o que deve existir em quem implementar.
//Toda classe que implementar Autenticavel devera obrigatoriamente criar esse metodo