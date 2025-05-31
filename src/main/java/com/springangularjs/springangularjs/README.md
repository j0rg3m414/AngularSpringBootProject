Como executar
Inicie o serviço Spring Boot (normalmente na porta 8080)
Abra o arquivo index.html em um navegador (você pode usar um servidor simples como python -m http.server se precisar)

Funcionalidades
Lista os produtos cadastrados no serviço Spring Boot
Permite adicionar novos produtos
Atualiza a lista automaticamente

Observações importantes
Este é um exemplo didático simplificado. Em uma aplicação real:
Você precisaria de tratamento de erros mais robusto

Validação de dados

Segurança (CORS mais restrito, autenticação)

Melhor organização do código AngularJS

Para evitar problemas de CORS em desenvolvimento, você pode:

Executar a página AngularJS no mesmo domínio que o serviço

Usar um proxy no AngularJS

Configurar o CORS no Spring Boot de forma mais específica

Em versões mais recentes do Angular (2+), a abordagem seria diferente, usando módulos e componentes.