package one.digitalinnovation.classes.pessoa;

public class ProgramaPessoaFisica {
    public static void main(String[] args){
        final PessoaFisica pessoaFisica = new PessoaFisica(33, 95.5f);

        System.out.println(pessoaFisica.relatorio());
    }
}
