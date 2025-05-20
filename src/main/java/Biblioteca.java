
import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros;// é uma lista que armazena os objetos do tipo Livro.


   

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);//método add() da classe ArrayList é utilizado para adicionar o objeto livro à lista livros
        System.out.println("Este livro foi adicionado: " + livro.getTitulo());
    }

   
    }


        
       

