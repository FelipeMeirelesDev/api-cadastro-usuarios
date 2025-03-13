<h1>API - Cadastro de Usuários</h1>

Esta é uma API REST desenvolvida com Spring Boot para realizar operações de cadastro de usuários. Ela é projetada para ser facilmente integrada a outros sistemas que necessitem de funcionalidades relacionadas a usuários, como criação, consulta, atualização e exclusão.

<h3>Recursos Principais</h3>
<B>Documentação da API:</B> Integrada com Swagger para facilitar a visualização e interação com os endpoints.
<br><br>
<B>Banco de Dados: </B>Conectado a um banco MySQL com mapeamento de dados via Hibernate.
<br><br>
<B>Operações CRUD:</B><br>
<ol>
<li>Criar usuários.</li>

<li>Atualizar informações de usuários.</li>

<li>Listar todos os usuários.</li>

<li>Consultar usuários pelo ID.</li>

<li>Deletar usuários.</li>
</ol>

<h3>Endpoints</h3>
<img src="https://i.imgur.com/JuNUuSr.png" alt="Texto Alternativo">

<h3>Configuração (Como Utilizar):</h3>

<h4>Pré-requisitos:</h4>
<B>java 11</B> e superior<br>
<B>Maven</B> para a gestão de dependências<br>
<B>Banco de dados MySQL</B> em execução

<h4>Configuração do Banco de Dados</h4>
<p>Certifique-se de atualizar as informações do banco de dados no arquivo <B>application.properties</B>:</>

#Adicione o nome do seu banco de dados na parte "seu_banco_de_dados"

```
spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco_de_dados?useSSL=false&serverTimezone=UTC
spring.datasource.username=seu_usuario<br> 
spring.datasource.password=sua_senha #Se não tiver senha, deixe vazio.
```
<h4>Acessando a Documentação</h4>

Após iniciar o projeto, acesse a documentação gerada pelo Swagger no navegador:
```
http://localhost:8080/swagger-ui.html
```
