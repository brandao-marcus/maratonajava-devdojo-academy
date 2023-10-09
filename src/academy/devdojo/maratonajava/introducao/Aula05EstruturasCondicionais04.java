package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
        /*
         primeiraFaixa € 0  € 34,712  9.70%
         segundaFaixa € 34,712  € 68,507  37.35%
         terceiraFaixa € 68,507  49.50%
        */

    public static void main(String[] args) {
    double salarioAnual = 70000;
    double primeiraFaixa = 9.70 / 100;
    double segundaFaixa = 37.35 / 100;
    double terceiraFaixa = 49.50 / 100;
    double valorDoImposto;
    if(salarioAnual <= 34712){
        valorDoImposto = salarioAnual * primeiraFaixa;
    } else if(salarioAnual >= 34713 && salarioAnual <= 68507){
        valorDoImposto = salarioAnual * segundaFaixa;
        }else{
        valorDoImposto = salarioAnual * terceiraFaixa;
    }
        System.out.println(valorDoImposto);
    }
}
