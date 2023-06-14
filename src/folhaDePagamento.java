import java.util.Scanner;

public class folhaDePagamento {
    /**
     * @param args
     * @throws Exception
     * @autor Erick Abraão Santos da Silva (Mat. 01615180), Eduardo Ferreira Wagner (Mat. 01456361), Guilherme Cruz Santos (Mat. 01624833) e Guilherme de Melo Silva (Mat. 01429593)
     */
    public static void main(String[] args) throws Exception {
    
    int horas;
    double bruto, liquido; 
    double IR, INSS, sindicato, totalDescontos;
    double valorDaHora, fgts, percentualIR=0;
                
    Scanner leitor = new Scanner (System.in);

    System.out.println("Bem-vindo ao sistema de folha de pagamento."); 
    System.out.println("Calcularemos seu salário e os descontos legais.");           
    System.out.println("Primeiro, digite o valor da hora trabalhada:");
    valorDaHora = leitor.nextDouble();
    System.out.println("Agora digite quantas horas você trabalhou no mês:");
    horas = leitor.nextInt();
                
    bruto = horas * valorDaHora;
   
                   
        if (bruto <= 900){

            percentualIR = 0;

            } else if (bruto > 900 && bruto <= 1500){

                percentualIR = 0.05;

                } else if (bruto > 1500 && bruto <= 2500){

                    percentualIR = 0.1;    
                
                        } else if (bruto > 2500){

                            percentualIR = 0.2; 

                            } 
                
        INSS = 0.1 * bruto;
        sindicato = 0.03 * bruto;
        fgts = 0.11 * bruto; 
        IR = bruto * percentualIR;
        totalDescontos = IR + INSS + sindicato;
        liquido = bruto - totalDescontos;

        percentualIR = percentualIR * 100; //Essa fórmula serve apenas para transformar o multiplicador do IR em porcentagem para ser visualizado corretamente abaixo
        
        System.out.println(" ");
        System.out.println("Aqui está seu salário:");
        System.out.println(" ");
        System.out.println("Salário bruto (" + valorDaHora + " * " + horas + ") - R$ " + bruto);
        System.out.println("IR ("+ percentualIR +"%) R$ " + IR);
        System.out.println("INSS (10%) - R$ " + INSS);
        System.out.println("Sindicato (3%) - R$ " + sindicato);
        System.out.println("FGTS (11%) - R$ " + fgts);
        System.out.println(" ");        
        System.out.println("Total de descontos - " + totalDescontos);
        System.out.println("Salário líquido - " + liquido);
        System.out.println(" ");
        System.out.println("Informação: Os descontos levam em consideração o Imposto de Renda, INSS e Sindicato. O FGTS não é descontado.");      
        System.out.println(" ");   
            }
        }
