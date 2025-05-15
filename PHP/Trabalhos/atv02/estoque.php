<?php
require_once 'validacoes.php';

//verifica se o método de requisição é POST
if ($_SERVER['REQUEST_METHOD'] == 'POST') {

    //cria o array que se associa com os dados do livro
    $livro = [
        'titulo' => $_POST['titulo'] ?? '',
        'autor' => $_POST['autor'] ?? '',
        'preco' => floatval($_POST['preco'] ?? 0),
        'quantidade' => intval($_POST['quantidade'] ?? 0)
    ];

    //valida os dados usando função
    if (!validar_livro($livro)) {
        echo "<h2>Erro: Dados inválidos!</h2>";
        echo "<p>Verifique se todos os campos foram preenchidos corretamente.</p>";
        echo "<a href='index.php'>Voltar ao formulário</a>";
        exit;
    }

    //calcula o valor total do estoque
    $valorTotal = calcularValorTotalEstoque($livro);

    //mostra os dados
    echo "<h1>Livro Cadastrado!</h1>";
    echo "<p><strong>Título:</strong> " . htmlspecialchars($livro['titulo']) . "</p>";
    echo "<p><strong>Autor:</strong> " . htmlspecialchars($livro['autor']) . "</p>";
    echo "<p><strong>Preço por Unidade:</strong> R$ " . number_format($livro['preco'], 2, ',', '.') . "</p>";
    echo "<p><strong>Quantidade:</strong> " . $livro['quantidade'] . "</p>";
    echo "<p><strong>Valor Total no Estoque:</strong> R$ " . number_format($valorTotal, 2, ',', '.') . "</p>";
    echo "<a href='index.php'>Cadastrar novo livro</a>";
}
?>