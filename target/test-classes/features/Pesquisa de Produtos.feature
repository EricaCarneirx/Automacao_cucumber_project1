#language: pt
@PesquisaProdutos
Funcionalidade: Pesquisa de produtos no e-commerce

  @CT01
  Cenario: pesquisa de produtos com sucesso
    Dado que acesso a página principal do e-commerce "http://automationpractice.com/index.php"
    Quando é realizado uma pesquisa de um produto "T-Shirts"
    Então deve ser exibido o produto
    E deve ser exibido com o preço correto "$16.51"

  @CT02
  Cenário: pesquisa de produtos negativos
    Dado que acesso a página principal do e-commerce "http://automationpractice.com/index.php"
    Quando é realizado uma pesquisa de um produto "teste"
    Então deve ser exibido 0 resultados
    E deve ser exibida a mensagem de alerta "No results were found for your search "teste""

  @CT03
  Cenário: realizar login no sistema
    Dado que acesso a página principal do e-commerce "http://automationpractice.com/index.php"
    E a página de sign in é acessada
    Quando o login é realizado com "carlos.silva@teste.com" usuário e senha "teste@15"
    Então a página de ‘minha conta’ é exibida com sucesso

  @CT04
  Cenário: Validar se não é possível acessar página de cadastro sem o preenchimento do campo email
    Dado que acesso a página principal do e-commerce "http://automationpractice.com/index.php"
    E a página de sign in é acessada
    Quando acessar página de cadastro de contas
    Então a seguinte mensagem de erro "Invalid email address." é exibida na página
