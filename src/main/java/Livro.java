
public class Livro {
    //Atributos(Características)
private static int proximoIsbn = 1;
private int Isbn;
private String Titulo;
private String Autor;
private int Ano;    
//Construtor (Garante que o objeto comece a existir com valores válidos)
public Livro(String Titulo, String Autor, int Ano) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Ano = Ano;
        this.Isbn=proximoIsbn++;
}
   //Método gette(utilizado para acessar o valor de um atributo privado da classe)
    public int getIsbn(){
    return Isbn;
    }
    
    public String getTitulo(){
    return Titulo;
    }
     public String getAutor(){
    return Autor;
    }
      public int getAno(){
    return Ano;
    }
    
    
    
    }
