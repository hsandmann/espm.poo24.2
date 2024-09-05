

## Docker

Docker compose

```bash title="Executar no diretório do arquivo compose.yaml"
docker compose up -d
```

```bash title="Executar no diretório do arquivo compose.yaml"
docker compose down
```

docker ps -a


```mermaid
classDiagram
    Banco o-- Conta
    Conta <|-- ContaCorrente
    Conta <|-- ContaPoupanca
    Conta <|-- ContaInvestimento
    class Banco{
      -String nome
      -List[Contas] contas
    }
    class Conta{
      -String id
      -double saldo
      -Cliente cliente
      +_sacar_()
      +depositar()
    }
    class ContaCorrente{
      +sacar()
    }
```