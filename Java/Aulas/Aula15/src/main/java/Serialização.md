### Serialização é o processo de transformar um objeto em uma sequencia de bytes, para que ele possa ser:
```
-Salvo em um arquivo
-Enviado pela rede
-Armazenado de forma persistente
```
### Ja a desserialização é o processo inverso, reconstruir um objeto apartir de uma sequencia de bytes previamente serializada

## Explicações adicionais
```
Comandos

- ObjectOutputStream : Serve para salvar objetos em arquivos binarios
- ObjectInputStream : Serve para ler objetos salvos
- writeObject(obj) : Salva o objeto no arquivo
- readObject() : Recupera o objeto do arquivo
- implements Serealizable : Torna a classe serializavel
```


#### OBS: É possivel serializar qualquer objeto desde que ele implemente a interface Serializable
#### Exemplo: Vamos criar um classe Pessoa, serializa-la para um arquivo e depois recupera-la (desserializar)

## Formato .dat
### (binario, usado com ObjectOutputStream)
```
Vantagens: guarda o objeto completo com estrutura. util para persistencia interna
Desvantagens: não é legivel por uma pessoa, dificil de compartilhar com outras aplicações
```

## Formato .txt
### (texto puro)
```
- Armazena os dados manualmente formatados em texto
- É legivel e editavel
- Precisa escrever e ler manualmente os atributos, nao guarda a estrutura do objeto
```

## Formato .json
### (padrão de dados estruturado)
```
- Guarda os dados de forma estruturada e legivel
- Muito usado em integrações com APIs, banco de dados, etc
- Requer bibliotecas externas como Gson ou Jackson para facilitar
```