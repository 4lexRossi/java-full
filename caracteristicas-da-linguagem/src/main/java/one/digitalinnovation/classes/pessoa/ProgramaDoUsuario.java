package one.digitalinnovation.classes.pessoa;

import one.digitalinnovation.classes.usuario.SuperUsuario;

public class ProgramaDoUsuario {
    public static void main(String[] args) {
        final var batman = new SuperUsuario("batman", "123456");
        batman.getLogin(); //publico

        //batman.getSenha(); //não é possivel acessar pois protected só acessa no msm pacote

        //String nomeDocliente = batman.nome; //não acessa poois é default  não está no msm pacote
    }
}
