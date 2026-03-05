import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        try {
         File arquivo = new File("meuarquivo,txt");
        Scanner leitor = new Scanner(arquivo);
    while (leitor.hasNextLine()) {
        String linha = leitor.nextLine();
        System.out.println(linha);
    }
    leitor.close();
    } catch (FileNotFoundException e) {
        System.out.println("Arquivo não encontrado.");

    }
    
}
}

