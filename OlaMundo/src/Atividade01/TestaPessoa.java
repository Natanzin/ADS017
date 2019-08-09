/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade01;

    import Atividade01.Pessoa;

public class TestaPessoa {
        public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Putona", Pessoa.SEXO_FEMININO );
        
        System.out.println(pessoa.getNome() + " - " + pessoa.getSexo());
        
    }
}
