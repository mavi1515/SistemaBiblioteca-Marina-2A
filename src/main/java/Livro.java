
public class Livro {
    //Atributos(Características)
private static int proximoIsbn = 1;
private int isbn;
private String titulo;
private String autor;
private int ano;    
//Construtor (Garante que o objeto comece a existir com valores válidos)
public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.isbn=proximoIsbn++;
}
   //Método gette(utilizado para acessar o valor de um atributo privado da classe)
    public int getIsbn(){
    return isbn;
    }
    
    public String getTitulo(){
    return titulo;
    }
     public String getAutor(){
    return autor;
    }
      public int getAno(){
    return ano;
    }
    
    public void setTitulo(String novoTitulo){
    this.titulo=novoTitulo;
    }
    public void setAutor(String novoAutor){
    this.autor=novoAutor;
    }
    public void setAno(int novoAno){
    this.ano=novoAno;
    }
    
    
    }
