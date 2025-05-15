<!DOCTYPE html>
<html lang="pt-br">
<head>
    <style>
        table, th, td{
            border: 1px solid black;
            border-collapse: collapse;
            padding: 3px;
        }
    </style>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Aula 09 - Clientes Cadastrados</h1>

    <p>
        <a href="index.php">Volta a home</a>

        <?php
            //incluir arquivo de validacao
            require_once 'validacoes.php';

            //incluir arquivo de conexao 
            require_once 'conexao.php';

            //receber a conexao com o BD
            $conn = conectar_banco();

            $query = "SELECT * FROM tb_clientes";

            $resultado = mysqli_query($conn, $query);

            $linhas_afetadas = mysqli_affected_rows($conn);

            //verificar select de linhas afetadas
            verificar_select($linhas_afetadas);

            //verificar o numero de linhas afetadas
            if($linhas_afetadas == 0){
                exit ("<h3>Nao a clientes para exibir.</h3>");
            }

            //se o numero de linhas afetadas for negativo, ha erro no sql
            if($linhas_afetadas < 0){
                exit("<h3>Nao foi possivel realizar a consulta no banco.</h3>");
            }

            //enquanto houver registros armazenados em um 'resultado', vamos criar um array associativo para cada registro retornado. Mostraremos na tela, o array assoociativo a cada interação do laço

            echo "<h2>Clientes Cadastrados</h2>";

            //montar cabecalho da tabela
            echo "<table>";
            echo    "<tr>";
            echo        "<th>ID #</th>";
            echo        "<th>Nome</th>";
            echo        "<th>Telefone</th>";
            echo        "<th>E-mail</th>";
            echo        "<th>Ações</th>";
            echo    "</tr>";

            while($cli = mysqli_fetch_assoc($resultado)){

                echo "<tr>";
                echo    "<td>" . $cli['id'] . "</td>";
                echo    "<td>" . $cli['nome'] . "</td>";
                echo    "<td>" . $cli['fone'] . "</td>";
                echo    "<td>" . $cli['email'] . "</td>";
                echo    "<td>";
                echo        '<a href="excluir.php?id=' . $cli['id'] . '">Excluir</a>';
                echo    "</td>";
                echo "</tr>";
            }

            echo "</table>";

            mysqli_close($conn);
        ?>
    </p>
</body>
</html>