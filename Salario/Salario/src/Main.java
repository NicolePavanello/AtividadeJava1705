public class Main {
    public static void main(String[] args) {
        System.out.println("SALÁRIO DO LIDER:");
        Salario Lider = new Lider(5,10);
        System.out.println(Lider.salariofinal());
        System.out.println("SALÁRIO DO GERENTE:");
        Salario Gerente = new Gerente(5,10);
        System.out.println(Gerente.salariofinal());
        System.out.println("SALÁRIO DO FUNCIONÁRIO:");
        Salario Funcionario = new Funcionario(5,10);
        System.out.println(Funcionario.salariofinal());
    }
}
