package com.gmail.jpalvesl;

import org.apache.commons.lang3.StringUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        double valor;
        Scanner input = new Scanner(System.in);
        Conta c1 = null;

        do {
            try {
                System.out.print(Menu.menu());
                opcao = Integer.parseInt( input.nextLine() );

                switch (opcao) {
                    case 1: // criar conta
                        System.out.print( "Digite um numero: " );
                        int numero = Integer.parseInt( input.nextLine() );

                        System.out.print( "Digite o seu saldo: " );
                        double saldo = Double.parseDouble( input.nextLine() );

                        System.out.print( "Digite o seu nome: " );
                        String nome = input.nextLine();


                        // criando as exceções
                        if ( !StringUtils.isAlphaSpace( nome ) ) throw new EntradaInválidaException();


                        // criando as contas com base nos novos dados
                        c1 = new Conta(saldo, numero, nome);
                        System.out.println( "Conta criada com sucesso" );
                        break;

                    case 2:// depositar
                        System.out.print( "Digite o valor a se depositar: " );
                        valor = Double.parseDouble( input.nextLine() );
                        c1.depositar(valor);
                        System.out.println( "Deposito realizado com sucesso" );
                        break;

                    case 3: // sacar
                        System.out.printf( "Digite o valor a ser sacado: " );
                        valor = Double.parseDouble( input.nextLine() );
                        c1.sacar(valor);
                        System.out.println( "Saque realizado com sucesso" );
                        break;

                    case 4:
                        System.out.println("Extrato...");
                        System.out.println(c1.extrato());
                        break;
                    case 5:
                        System.out.println("Saldo...");
                        System.out.println(c1.consultarSaldo());
                        break;
                    case 6:
                        System.out.println(c1);
                }
            }

            catch ( EntradaInválidaException eia ) {
                System.err.println( "Entrada inválida" );
            }
            catch ( QuantiaNegativaException qne ){
                System.err.println( "Valores negaticos não são aceitos" );
            }
            catch ( SaldoInsuficienteException sie ){
                System.err.println( "Você não possui saldo para realizar esta operação" );
            }
            catch ( InputMismatchException ime ){
                System.err.println( "Digite um numero" );
            }
            catch ( NumberFormatException nfe ){
                System.out.println( "Digite um numero" );
            }
            catch ( Exception e ){
                System.err.println( "Erro não identificado" );
            }
            finally {
                input.close();
                System.out.println( "Scanner sendo fechado" );
                System.out.println( "Fim da execução do programa\n\n" );
            }
        } while ( opcao != 7 );

    }

}
