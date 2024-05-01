package API.passdois;

import API.passdois.org.EnderecoDto;
import API.passdois.servico.ApiServico;
import java.io.IOException;
import java.util.Scanner;

public class passdois {
    public static void main(String[] args) throws IOException, InterruptedException {
        ApiServico apiservico = new ApiServico();
        Scanner scanf = new Scanner(System.in);

        try {
            System.out.print("\u001B[32mDigite o cep: "); // Alterando a cor para verde
            EnderecoDto enderecodto = apiservico.getEndereco(scanf.nextLine());
            System.out.println("\u001B[0m"); // Resetando a cor para padrão
            System.out.println("\u001B[32m------------------ DADOS OBTIDOS ------------------"); // Alterando a cor para verde
            System.out.println("localidade: " + enderecodto.getLocalidade());
            System.out.println("cep: " + enderecodto.getCep());
            System.out.println("siafi: " + enderecodto.getSiafi());
            System.out.println("ddd: " + enderecodto.getDdd());
            System.out.println("gia: " + enderecodto.getGia());
            System.out.println("ibge: " + enderecodto.getIbge());
            System.out.println("uf: " + enderecodto.getUf());
            System.out.println("bairro: " + enderecodto.getBairro());
            System.out.println("complemento: " + enderecodto.getComplemento());
            System.out.println("logradouro: " + enderecodto.getLogradouro());
            System.out.println("\u001B[0m"); // Resetando a cor para padrão

        } catch (IOException x) {
            throw new RuntimeException(x);
        } catch (InterruptedException x2) {
            throw new RuntimeException(x2);
        }
    }
}
