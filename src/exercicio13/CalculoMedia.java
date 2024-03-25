package exercicio13;

import exercicio13.entidade.Nota;

import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean addNota;
        Nota media = new Nota();
        String addNovaNota;
        System.out.println("*********** CALCULO MÉDIA ************\n");
        System.out.print("Digite uma nota: ");
        do {
            media.setNota(input.nextDouble());

            System.out.print("Quer adicionar nova nota s/n: ");
            addNovaNota = String.valueOf((input.next().charAt(0)));
            if (addNovaNota.equalsIgnoreCase("s")){
                System.out.print("Adicione uma nova nota: ");
                addNota = true;
            }else{
                addNota= false;
            }
        }while (addNota);

        System.out.println("Media do aluno:"+ media.getMedia());
        System.out.println("Situação do aluno:"+ media.getSituacaoAluno());

        input.close();
    }
}
