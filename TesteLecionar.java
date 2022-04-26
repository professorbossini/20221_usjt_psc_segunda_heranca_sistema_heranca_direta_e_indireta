public class TesteLecionar {
    public static void main(String[] args) {
        ProfessorHorista p1 = new ProfessorHorista();
        ProfessorPesquisador p2 = new ProfessorPesquisador();

        p1.setNome("Ana");
        p2.setNome("Pedro");

        p1.lecionar();

        p2.lecionar();
    }
}
