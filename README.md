

# JavaPureAPI

Bem-vindo ao repositório `JavaPureAPI`, uma implementação simples e eficiente de uma API em Java puro. Este projeto é ideal para quem deseja aprender sobre Java e desenvolvimento de APIs sem o uso de frameworks adicionais.

## Características

- **Código Java Puro:** Focamos em utilizar apenas Java puro, sem frameworks externos.
- **Operações CRUD:** Implementações básicas de operações Create, Read, Update e Delete.
- **Handler como Controller:** Utilizamos um handler personalizado que atua como um controlador.
- **Inserção com Driver Oracle:** Demonstração de como realizar inserções usando o driver da Oracle.

## Pré-Requisitos

Para executar este projeto, você precisará do seguinte:
- Java JDK instalado.
- Docker para rodar a imagem do Oracle Database.

## Configuração do Docker com Oracle

Para configurar e executar a imagem do Docker do Oracle Database, siga estas etapas:

1. **Instalar o Docker:** Primeiro, instale o Docker a partir do [site oficial do Docker](https://www.docker.com/get-started).

2. **Baixar Imagem do Oracle:** No terminal, execute:
   ```bash
   docker pull store/oracle/database-enterprise:12.2.0.1
   ```

3. **Criar Container do Oracle:** Em seguida, crie um container com:
   ```bash
   docker run -d -p 1521:1521 --name oracle-db store/oracle/database-enterprise:12.2.0.1
   ```

4. **Verificar Container:** Confirme se o container está rodando com:
   ```bash
   docker ps
   ```

5. **Conectar com a API:** Atualize as configurações de conexão da API para apontar para o banco de dados Oracle no Docker.

## Como Executar

1. **Clone o Repositório:** Faça um clone do repositório para sua máquina local.
2. **Configure o Ambiente:** Siga as instruções acima para configurar o Docker com Oracle.
3. **Execute a API:** Utilize sua IDE Java preferida ou linha de comando para executar a API.

## Contribuições

Sua contribuição é muito bem-vinda! Se você tem sugestões de melhorias ou novas funcionalidades, fique à vontade para criar um pull request.

## Licença

[Inserir detalhes da licença aqui]

---
