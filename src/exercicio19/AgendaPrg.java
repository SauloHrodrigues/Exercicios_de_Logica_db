package exercicio19;

import exercicio19.contato.Agenda;

public class AgendaPrg {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionarContato("Saulo", "(19) 99267-4087");
        agenda.adicionarContato("Suze", "(19) 99164-4489");
        agenda.adicionarContato("Carlos", "(19) 9333-1122");
        agenda.adicionarContato("Alice", "(18) 99555-46633");
        agenda.adicionarContato("Valeria", "(11) 98127-4254");
        agenda.adicionarContato("Toni", "(13) 92222-0404");
        agenda.adicionarContato("Lourded", "(15) 95566-3377");

        agenda.mostraAgenda();
        agenda.deletarContato("suze");
        System.out.println();
        System.out.println("Deletado");
        agenda.mostraAgenda();
    }

}
