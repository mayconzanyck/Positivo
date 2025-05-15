<?php
//verifica se os dados são válidos
function validar_livro($livro) {
    if (empty(trim($livro['titulo'])) || empty(trim($livro['autor']))) {
        return false;
    }
    if (!is_numeric($livro['preco']) || $livro['preco'] < 0.01) {
        return false;
    }
    if (!filter_var($livro['quantidade'], FILTER_VALIDATE_INT) || $livro['quantidade'] <= 0) {
        return false;
    }
    return true;
}

//calcula o valor total do estoque (do livro)
function calcularValorTotalEstoque($livro) {
    return $livro['preco'] * $livro['quantidade'];
}