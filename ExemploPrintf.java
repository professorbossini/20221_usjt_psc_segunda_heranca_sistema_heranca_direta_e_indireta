public class ExemploPrintf {
    public static void main(String[] args) {
        int idade = 17;
        String nome = "Ana";
        //Ana tem 17 anos
        System.out.println (nome + " tem " + idade + " anos.");
        System.out.printf("%s tem %d anos.\n", nome, idade);
    }
}
