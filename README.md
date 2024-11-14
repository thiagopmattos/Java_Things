# Projeto Banco - Sistema de Conta Bancária em Java

Este é um sistema simples de conta bancária implementado em Java, onde são simuladas operações bancárias como saque, depósito, transferência entre contas e cálculo de bonificação. O sistema é composto por uma classe `Conta`, que contém os atributos e métodos necessários para gerenciar uma conta bancária, além de realizar operações de transferência e bonificação.

## Funcionalidades

- **Saque**: Permite que o usuário realize um saque, desde que o valor seja positivo e o saldo seja suficiente.
- **Depósito**: Permite que o usuário faça um depósito, desde que o valor seja positivo.
- **Transferência**: Permite que o usuário transfira valores entre contas, desde que o saldo seja suficiente e o valor seja válido.
- **Bonificação**: Calcula a bonificação do cliente com base em um critério de cliente especial. Clientes especiais recebem uma bonificação de 10% sobre o saldo, enquanto os clientes normais recebem 5%.
- **Mostrar Atributos**: Exibe os dados da conta, incluindo CPF do titular, número do banco, saldo atual e bonificação calculada.

## Estrutura do Projeto

A estrutura do código é composta por uma única classe:

- **Conta**: Classe que contém os atributos e métodos para realizar as operações bancárias descritas acima. Os atributos da classe incluem:
  - `Cpf`: CPF do titular da conta (String)
  - `numBanco`: Número do banco da conta (int)
  - `saldo`: Saldo atual da conta (double)
  - `clienteEspecial`: Indica se o cliente é especial ou não (boolean)

### Métodos da Classe `Conta`:

1. **Construtor**:
   - `public Conta(String cpf, int numBanco, double saldo, boolean clienteEspecial)`: Construtor para inicializar uma conta bancária com os dados fornecidos.

2. **Método `bonificacao()`**:
   - Retorna a bonificação do cliente com base no seu status (especial ou não).

3. **Método `sacar(double valor)`**:
   - Realiza o saque de um valor da conta, se o saldo for suficiente e o valor for positivo.

4. **Método `depositar(double valor)`**:
   - Realiza o depósito de um valor na conta, se o valor for positivo.

5. **Método `mostrarAtributos()`**:
   - Exibe as informações da conta, incluindo o CPF, número do banco, saldo e bonificação.

6. **Método `transferir(Conta destino, double valor)`**:
   - Realiza a transferência de um valor de uma conta para outra, se o saldo for suficiente e o valor for válido.

## Exemplo de Uso

Aqui está um exemplo simples de como usar a classe `Conta` para realizar operações bancárias:

```java
public class Main {
    public static void main(String[] args) {
        // Criando duas contas bancárias
        Conta conta1 = new Conta("123.456.789-00", 101, 1000.0, true);
        Conta conta2 = new Conta("987.654.321-00", 102, 500.0, false);
        
        // Mostrando atributos da conta 1
        conta1.mostrarAtributos();
        
        // Realizando um saque
        conta1.sacar(200.0);
        
        // Realizando um depósito
        conta1.depositar(150.0);
        
        // Realizando uma transferência
        conta1.transferir(conta2, 300.0);
        
        // Mostrando atributos da conta 2
        conta2.mostrarAtributos();
    }
}
```

Saída esperada:

```
CPF do titular: 123.456.789-00
Número do banco: 101
Saldo atual: 1000.0
Bonificação: 100.0
Valor de saque: 200.0
Depósito de 150.0
Transferência de R$300.0 realizada com sucesso para a conta de CPF 987.654.321-00
CPF do titular: 987.654.321-00
Número do banco: 102
Saldo atual: 800.0
Bonificação: 40.0
```

## Como Rodar o Projeto

1. Certifique-se de ter o Java instalado em seu computador.
2. Clone este repositório no seu computador:

   ```bash
   git clone https://github.com/seuusuario/conta-bancaria-java.git
   ```

3. Abra o diretório do projeto e compile os arquivos Java:

   ```bash
   javac Conta.java Main.java
   ```

4. Execute o programa:

   ```bash
   java Main
   ```

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues, corrigir bugs, ou adicionar novas funcionalidades.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Sinta-se à vontade para modificar e usar este código conforme necessário em seus próprios projetos!
