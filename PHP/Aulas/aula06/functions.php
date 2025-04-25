<?php
    // Função para verificar se o form foi enviado (método de envio = post).
    function form_nao_enviado(){
        // Retorne 'true' se chegamos na página via GET (ou seja, diferente do POST); 
        // Retorna 'false' se chegamos na página via POST.
        return $_SERVER['REQUEST_METHOD'] != 'POST';
    } 

    //função para verificar se os valores digitados no form não sao valores numericos
    function valor_nao_numerico(){

        //se qualquer um dos campos nao for numero, a função retornara verdadeiro
        return !is_numeric($_POST['valor1']) || !is_numeric($_POST['valor2']);
    }
?>