package mercado;
import java.util.ArrayList;
import java.util.Scanner;

public class SuperMercado {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		Scanner ler = new Scanner(System.in);
		int valor = 0,som = 0, produto;
		String a1,r1;

		System.out.println("Produtos");

		lista.add("1-arroz");// 1
		lista.add("2-feijão");//2
		lista.add("3-macarrão");//3
		lista.add("4-carne");//4
		lista.add("5-refri");//5

		System.out.println(lista);

		System.out.println("informe o numero correspondente ao produto que deseja: " );
		produto = ler.nextInt();

		for (String sorvete : lista) {
			System.out.println(so);
		}

		System.out.println("\n— Deseja retirar ou adicionar? Aqui esá as opções extras: \n");

		String[] add;
		for (String acren : add) {
			System.out.println(acren);
		}
		System.out.println("\n— deseja adicionar algum item");
		a1 = ler.nextLine();
		if(a1.equals("Sim")) {
			System.out.println("— Qual item deseja adicionar?");
			r1 = ler.nextLine();
			lista.remove(r1);



			System.out.println("Informe o valor dele:");
			valor = ler.nextInt();
			valor = ler.nextInt();
			valor = ler.nextInt();


			som += valor;

			System.out.println(" O valor da sua compra deu: " + som);
			System.out.println("Você comprou: " + produto);

			ler.close();
		}

	}
}
