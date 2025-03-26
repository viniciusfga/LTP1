import java.util.Scanner;

public class Atividade8_b {

    //• Leia 4 números
	//• Calcule o quadrado para cada um
	//• Some todos
	//• Mostre o resultado
    //

    private int a, b, c, d, result;
    private int quadA, quadB, quadC, quadD;
    private Scanner scan;

    Atividade8_b(){

        scan = new Scanner(System.in);
        
    }           

    void imprimirTodasVariaveis(){

        System.out.println("Velores digitados" + " " + a + " " + b + " " + c +" " + d);

    }
    void  calcularQuadrados (){

        quadA = a*a;
        quadB = b*b;
        quadC = c*c;
        quadD = d*d;


    }

    void imprimirResultadoQuadrados () {

        System.out.println("Quadrado de " + a + " é " + quadA);

        System.out.println("Quadrado de "+ b + " é " + quadB);

        System.out.println("Quadrado de " + c + " é " + quadC);

        System.out.println("Quadrado de " + d + " é " + quadD);

    }

    void capturarValores(){

        System.out.println("Digite um valor: " );
        a = scan.nextInt();

        System.out.println("Digite um valor: " );
        b = scan.nextInt();
        
        System.out.println("Digite um valor: " );
        c = scan.nextInt();
        
        System.out.println("Digite um valor: " );
        d = scan.nextInt();

    }

    void somarTodos() {

        result = quadA+quadB+quadC+quadD;

    }

    @Override
    public String toString() {
        return "Atividade8_b [Resultado = " + result + "]";

    }
    void printResult() {
        System.out.println(toString());
    }
    
}