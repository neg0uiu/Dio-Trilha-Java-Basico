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
        System.out.println("Converter valor de numero (* -1)");
            int numero = 5;
            System.out.println("SEM conversão valor de numero: " + numero);
        
        // Numero CONVERTIDO para outra operação 
            int numeroConvertido = numero * -1;
            System.err.println("COM conversão valor de numero: " + numeroConvertido);
        System.out.println("-------------------------------------------");

        // INCREMENTO ( ++ )
        // sempre colocar o incremento ANTES da variavel pois ele atualiza na ordem
        System.out.println("INCREMENTO (++)");
            System.out.println("Numero sem Incremento (5): " + numero);
            
            int numeroIncrementado = ++numero;
            System.out.println("Numero com incremento (++5 = 6) : " + numeroIncrementado);
            System.out.println("Numero com incremento atrasado (6++ = 6 pois ele vai ler o 6 e terminar):  " + numeroIncrementado++); 
        //ele so veio adicionar +1 depois de ler, segue exemplo:
            System.out.println("Incremento atrasado (Agora sim ele vai ler o incremento 6++ = 7): " + numeroIncrementado);
        System.out.println("-------------------------------------------");
        
        // DECREMENTO (--)
        System.out.println("DECREMENTO (--)");
            System.out.println("Numero sem Decremento (6): " + numero); // está 6 devido ao incremento acima
        
        // DECREMENTO SEMPRE IRÁ DIMINUIR -1. EXEMPLO:
            int numeroDecrementado = --numero;
            System.out.println("Numero com Decremento (--6): " + numeroDecrementado);
        System.out.println("-------------------------------------------");

        //INVERSAO booleana (!)
        System.out.println("INVERSAO BOOLEANA(!)");
        // a exclamação converte um termo logico para o outro. Por exemplo: verdadeiro para falso(e vice-versa)
            boolean verdadeiro = true;
            System.out.println("valor sem inversão 'verdadeiro = true = true': " + verdadeiro);

            // Feita a conversão (adicionado "!" na frente do "true", ira tornar falso)
            verdadeiro = !true; 
            System.out.println("valor com inversão 'verdadeiro = !true = false': " + verdadeiro);
        System.out.println("-------------------------------------------");
        
        //OPERADOR TERNARIO
        System.out.println("OPERADOR TERNARIO ( ?, : )");
        // PARA EXPRESSÃO BOOLEANA (SE VAI RETORNAR VERDADEIRO OU FALSO)
        // versão resumida de if(?) else(:)
        // IF=SE (?)
        // ELSE = SE NÃO(:)
        // (tipo) (variavelDeResultado) = (variavel1) (comparador) (variavel2) ? "respostaCasoVERDADEIRO": "respostaCasoFALSO";
            int a = 1;
            int b = 2;
            String resultadoTernario = a == b ? "sim" : "não";
            System.out.println("1 é igual a 2? " + resultadoTernario);
            
            a = 2;
            b = 2;
            resultadoTernario = a == b ? "sim" : "não";
            System.out.println("2 é igual a 2? " + resultadoTernario);
        System.out.println("-------------------------------------------");

        //OPERADOR RELACIONAIS 
        System.out.println("OPERADORES RELACIONAIS ");
        // == igual a
        // != diferente de 
        // >  maior que
        // >= maior que ou IGUAL 
        // <  menor que 
        // <= menor que ou IGUAL
        // .equals para comparar objetos ou textos
            int numeroUm = 1; 
            int numeroDois = 2;
            boolean comparacao = numeroUm == numeroDois;
        // criada boolean "comparacao" que fez a pergunta "a variavel 'numeroUm' eh igual a variavel 'numeroDois'" e a resposta sera "true" ou "false"
            System.out.println("resultado da comparação ('eh igual?'): " + comparacao);

            comparacao = numeroUm != numeroDois;
        // "comparacao" que fez a pergunta "a variavel 'numeroUm' eh diferente da variavel 'numeroDois'?"
            System.out.println("resultado da comparação ('eh diferente?'): " + comparacao);

        //comparação de duas Strings
            String nomeMaca1 = "maçã";
            String nomeMaca2 = "maçã";
            System.out.println("essa String eh igual a outra? " + nomeMaca1.equals(nomeMaca2));

        // Comparação de dois obejtos tipo String
            String meuNome1 = new String("Willian");
            String meuNome2 = new String("Willian");
        //essa vai dar false devido a falta do .equals()
            System.out.println("esse OBJETO String eh igual ao outro? " + meuNome1 == meuNome2);
        // essa comparação vai dar verdadeira devido .equals(variavel2)
            System.out.println("esse OBJETO String eh igual ao outro? " + meuNome1.equals(meuNome2));
        System.out.println("-------------------------------------------");
        //OPERADORES LOGICOS
        System.out.println("OPERADORES LOGICOS (E = &&, OU = ||)");
        // VERIFICADORES DE CONDICAO
        // LIGADOS A TABELA VERDADE
            boolean condicao1 = true;
            boolean condicao2 = false; 

            if (condicao1 && condicao2) {
                System.out.println("A duas expressoes sao verdadeiras");
            } else { System.out.println("uma das expressoes eh falsa");}

            if (condicao1 || condicao2) {
                System.out.println("uma das condicoes eh verdadeira");
            }
            if (condicao1 && ( 5 > 3)) {
                System.out.println("as duas expressoes sao verdadeiras");
            }
        System.out.println("-------------------------------------------");
    }
}
