
package olamundo;

    import olamundo.Funcionario;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(182145,"Natanzin",Pessoa.SEXO_MASCULINO,10500);
        System.out.println(funcionario.getMatricula() + "-" + funcionario.getNome() + " - " + funcionario.getSexo() + " - " + funcionario.getSalario());
    }
    
    
}
