package br.com.exercicioaula09;

public class ProjetoLivros {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("A arte de ligar o foda-se", "Fulano", 200, p[1]);
        l[2] = new Livro("Testando", "Fulana", 500, p[0]);

        System.out.println(l[1].detalhes());


    }
}
