<h2>Cadastro de Aparelhos</h2>

<form action="cadastro.php" method="post">

    <p>
        <label for="nome">Aparelho: </label><br>
        <input type="text" name="nome" placeholder="Nome do Aparelho" required>
    </p>

    <p>
        <label for="consumo">Consumo: </label><br>
        <input type="number" name="consumo" placeholder="Consumo maximo (Watts)" min="1" step="0.01" required>
    </p>

    <p>
        <label for="horas_dia">Horas/Dia: </label><br>
        <input type="number" name="horas_dia" placeholder="Horas por dia" min="1" max="24" step="0.01" required style="width: 170px;">
    </p>

    <p>
        <label for="dias_mes">Dias/Mes: </label><br>
        <input type="number" name="dias_mes" placeholder="Dias por mês" min="1" max="31" required style="width: 170px;">
    </p>

    <p>
        <label for="kw_h">Valor kWh(R$): </label><br>
        <input type="number" name="kw_h" placeholder="Valor do kWh em R$" min="0.01" step="0.01" required>
    </p>

    <p>
        <button type="submit">Cadastrar</button>
    </p>

</form>