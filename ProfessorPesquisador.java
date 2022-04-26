public class ProfessorPesquisador extends Professor {
    public void pesquisar(){
        System.out.printf(
            "%d %s pesquisando",
            matricula,
            getNome()
        );
    }
}
