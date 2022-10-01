package operados;

import java.util.Date;

public class operadores {
    public static void main(String[] args) {
        
        // operador de ATRIBUIÇÃO eh o IGUAL - "="
        // note que todos tem igual na atribuição
        // EXEMPLO 
        String nome = "Willian";
        int idade = 20;
        double peso = 50.0;
        char sexo = 'M';
        boolean doadorSangue = true;
        Date dataNascimento = new Date();

        // operadores ARITMÉTICOS (+, -, *, /, %)
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 32;
        int multiplicacao = 20 * 3;
        double divisao = 13 / 2;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        // CONCATENAÇÃO
        // Significa a JUNÇÃO de duas palavras numa frase
        System.out.println("CONCATENAÇÃO: ");
            String meuNome = "Wilian";
            String sobrenome = "Mamede";
            String nomeCompleto = meuNome + " " + sobrenome;
            System.out.println("Primeiro nome: " + meuNome);
            System.out.println("Segundo Nome: " + sobrenome);
            System.out.println("Nome completo concatenado: " + nomeCompleto);
        System.out.println("-------------------------------------------");

        // UNARIOS 
        // AFIRMACAO (+), NEGACÃO (-), ACRESÇÃO ( ++ ), DECRECÃO ( -- ), COMPARAÇÃO ( == )
        // PARA CONVERTER DE NEGATIVO PARA POSITIVO MULTIPLICA POR -1 ( * -1)
        System.out.println("operadores UNARIOS");
            int numero = 5;
            System.out.println("operadores unario: " + numero);
        
        // Numero CONVERTIDO para outra operação 
            int numeroConvertido = numero * -1;
            System.err.println("operadores unario: " + numeroConvertido);
        System.out.println("-------------------------------------------");

        // INCREMENTO ( ++ )
        // sempre colocar o incremento ANTES da variavel pois ele atualiza na ordem
        System.out.println("INCREMENTO (++)");
            System.out.println("Numero sem Incremento (++): " + numero);
            int numeroIncrementado = ++numero;

            System.out.println("Numero com incremento (++): " + numeroIncrementado);
            System.out.println("Numero com incremento atrasado (++ depois da variaveis):  " + numeroIncrementado++); 
        //ele so veio adicionar +1 depois de ler, segue exemplo:
            System.out.println("Incremento atrasado (O resultado agora vai ser '7'): " + numeroIncrementado);
        System.out.println("-------------------------------------------");
        
        // DECREMENTO (--)
        System.out.println("DECREMENTO (--)");
            System.out.println("Numero sem Decremento (--): " + numero); // está 6 devido ao incremento acima
        
        // DECREMENTO SEMPRE IRÁ DIMINUIR -1. EXEMPLO:
            int numeroDecrementado = --numero;
            System.out.println("Numero com Decrementado: " + numeroDecrementado);
        System.out.println("-------------------------------------------");
        
        
    }
}
