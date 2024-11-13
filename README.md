# Sistema de Gerenciamento de Links Úteis:
Este projeto é um sistema de gerenciamento de links úteis organizados por assunto. O sistema permite adicionar, editar, excluir e listar links usando uma interface de linha de comando. A persistência dos dados é feita em arquivos de texto.

# Estrutura do Projeto:
O sistema é dividido em duas principais classes:

* Link: Representa um link com título, URL, descrição e assunto.
* LinkManager: Contém o fluxo principal da aplicação e o CRUD para gerenciar os links.
* Funcionalidades
* Adicionar Link: Insira o título, URL, descrição e o assunto para salvar um novo link.
* Editar Link: Selecione o link a ser editado pelo número, e atualize o título, URL, descrição ou assunto.
* Excluir Link: Remova um link selecionando-o pelo número na lista.
* Listar Links: Exibe todos os links cadastrados, organizados por assunto.
* Instalação e Execução
  
# Clone o Repositório:
* git clone <URL_DO_REPOSITORIO>

# Navegue até o Diretório do Projeto:
* cd sistema-gerenciamento-links

#Compile o Código:
* javac LinkManager.java
  
#Execute o Programa:
* java LinkManager
  
# Exemplo de Uso:
Ao executar o programa, o menu principal será exibido, onde você pode selecionar uma das opções:
Menu:
* 1. Adicionar link
* 2. Editar link
* 3. Excluir link
* 4. Listar links
* 5. Sair
Escolha uma opção:
 
# Operações CRUD:
* Adicionar Link: Siga as instruções para inserir o título, URL, descrição e assunto do link.
* Editar Link: Informe o número do link para editá-lo e substitua as informações desejadas.
* Excluir Link: Informe o número do link para removê-lo da lista.
* Listar Links: Exibe todos os links cadastrados, organizados por assunto.
  
# Estrutura do Arquivo de Dados:
Os links são salvos no arquivo links.txt no seguinte formato:

***Título***
Exemplo de Título
***URL***
https://exemplo.com
***Descrição***
Descrição do exemplo
***Assunto***
Tecnologia

# Versionamento:
Este projeto utiliza versionamento semântico, começando pela versão v0.1.0 para funcionalidades básicas, e outras melhorias serão adicionadas conforme o progresso do sistema.

