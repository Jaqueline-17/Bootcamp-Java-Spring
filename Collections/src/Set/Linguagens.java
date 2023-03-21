package Set;
/* Crie uma classe LinguagemFavorita que possua os atributos nome, 
 * anoDeCriacao e ide. Em seguida, crie um conjunto com 3 linguagens
 * e faça um programa que ordene o conjunto por:
 * - Ordem de Inserção.
 * - Ordem Natural (Nome).
 * - IDE
 * - Ano de Criação e Nome.
 * - Nome, Ano de Criação e IDE.
 * Ao final, exiba as linguagens no console, uma abaixo da outra.  
 */



// import java.util.Arrays;
// import java.util.LinkedHashSet;

public class Linguagens {
    
    public static void main(String[] args) {
        
        // LinkedHashSet<LinguagemFavorita> minhasLinguagensFavoritas1 = new LinkedHashSet<>(
        //         Arrays.asList(
        //                 new LinguagemFavorita("Python", 1991, "Pycharm"),
        //                 new LinguagemFavorita("JavaScript", 1995, "IntelliJ"),
        //                 new LinguagemFavorita("Java", 1991, "Visual Studio Code")
        //         )
        // );


    }

    public class LinguagemFavorita {
        public String nome;
        public Integer anoDeCriacao;
        public String ide;
        
        public LinguagemFavorita() {
        }

        public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
            this.nome = nome;
            this.anoDeCriacao = anoDeCriacao;
            this.ide = ide;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getAnoDeCriacao() {
            return anoDeCriacao;
        }

        public void setAnoDeCriacao(int anoDeCriacao) {
            this.anoDeCriacao = anoDeCriacao;
        }

        public String getIde() {
            return ide;
        }

        public void setIde(String ide) {
            this.ide = ide;
        }

        
        
    }
}
