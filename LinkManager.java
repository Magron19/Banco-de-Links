import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class LinkManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Link> listaLinks = new ArrayList<>();
        
        carregarArquivo(listaLinks);

        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar link");
            System.out.println("2. Editar link");
            System.out.println("3. Excluir link");
            System.out.println("4. Listar links");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1:  
                    System.out.println("Título do link: ");
                    String titulo = scanner.nextLine();
                    
                    System.out.println("URL do link: ");
                    String url = scanner.nextLine();

                    System.out.println("Descrição do link: ");
                    String descricao = scanner.nextLine();
                    
                    System.out.println("Assunto do link: ");
                    String assunto = scanner.nextLine();

                    listaLinks.add(new Link(titulo, url, descricao, assunto));
                    break;

                case 2:  
                    System.out.println("Insira o número do link para editar (1-" + listaLinks.size() + "):");
                    int linkEditar = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Novo título: ");
                    String novoTitulo = scanner.nextLine();
                    System.out.println("Nova URL: ");
                    String novaUrl = scanner.nextLine();
                    System.out.println("Nova descrição: ");
                    String novaDescricao = scanner.nextLine();
                    System.out.println("Novo assunto: ");
                    String novoAssunto = scanner.nextLine();

                    listaLinks.set(linkEditar-1, new Link(novoTitulo, novaUrl, novaDescricao, novoAssunto));
                    break;

                case 3:  
                    System.out.println("Insira o número do link para excluir (1-" + listaLinks.size() + "):");
                    int linkExcluir = scanner.nextInt();
                    listaLinks.remove(linkExcluir-1);
                    break;

                case 4:  
                    System.out.println("Links úteis:");
                    for (int i = 0; i < listaLinks.size(); i++) {
                        Link link = listaLinks.get(i);
                        System.out.println((i + 1) + ". Título: " + link.titulo + " | URL: " + link.url + " | Assunto: " + link.assunto);
                    }
                    break;

                case 5:  
                    System.out.println("Saindo...");
                    scanner.close();
                    break;

                default:  
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 5);

        salvarArquivo(listaLinks);
    }

    public static void salvarArquivo(ArrayList<Link> listaLinks) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("links.txt"));
            for (Link l : listaLinks) {
                writer.write("***Título***\n" + l.titulo + "\n***URL***\n" + l.url + "\n***Descrição***\n" + l.descricao + "\n***Assunto***\n" + l.assunto + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void carregarArquivo(ArrayList<Link> listaLinks) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("links.txt"));
            String line = reader.readLine();
            while (line != null) {
                if (line.equals("***Título***")) {
                    String titulo = reader.readLine();
                    reader.readLine();
                    String url = reader.readLine();
                    reader.readLine();
                    String descricao = reader.readLine();
                    reader.readLine();
                    String assunto = reader.readLine();
                    listaLinks.add(new Link(titulo, url, descricao, assunto));
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo ainda não criado.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}