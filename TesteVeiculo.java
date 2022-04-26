public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo v = new Veiculo();
        //v.placa = "ABC-1234";
        v.setPlaca("ABC-1234");



        //v.placa = "DEF-3214";
        v.setPlaca("DEF-3214");

        //System.out.println("A placa é " + v.placa);
        System.out.println("A placa é " + v.getPlaca());
    }
}
