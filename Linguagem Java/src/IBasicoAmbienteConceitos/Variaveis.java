package IBasicoAmbienteConceitos;

/**
 * Em Java, não pode haver nenhum código fora de uma classe.
 * Nem mesmo a função main, chamada de ponto de entrada (entry point) pode estar fora de uma classe.
 *
 * Não pode haver mais de uma função main por classe, pois desta maneira o compilador não saberia qual função chamar.
 * Também não pode haver mais de um classe no mesmo arquivo java.
 * Cada classe deve ficar dentro de um arquivo com o mesmo nome da classe.
 *
 * Variáveis são usadas para armazenar valores que o software utiliza durante sua execução.
 * */
public class Variaveis {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        // Declaração de variáveis
        String nome = "Linguagem Java";
        Integer idade = 25;
        Boolean fome = false;

    }

}