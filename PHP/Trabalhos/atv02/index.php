<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Cadastrar Livros</title>
</head>
<body>
    <h1>Cadastrar Livros</h1>
    <form action="estoque.php" method="post">
        <label>Título: <br><input type="text" name="titulo" required placeholder="Titulo do Livro"></label><br><br>
        <label>Autor: <br><input type="text" name="autor" required placeholder="Autor do Livro"></label><br><br>
        <label>Preço: <br><input type="number" step="0.01" name="preco" required placeholder="Preço por Unidade"></label><br><br>
        <label>Quantidade: <br><input type="number" name="quantidade" required placeholder="Quantidade no Estoque"></label><br><br>
        <button type="submit">Cadastrar</button>
    </form>
</body>
</html>