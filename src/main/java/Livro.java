
public class Livro {
    //Atributos(Características)
private static int proximoIsbn = 1;
private int isbn;
private String titulo;
private String autor;
private int ano;  
private boolean disponivel;
//Construtor (Garante que o objeto comece a existir com valores válidos)
public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.isbn=proximoIsbn++;
        this.disponivel= true;
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
      public boolean isDisponivel(){
      return disponivel;
      }
    
    public void setTitulo(String novoTitulo){//sette para alterar os valores
    this.titulo=novoTitulo;
    }
    public void setAutor(String novoAutor){
    this.autor=novoAutor;
    }
    public void setAno(int novoAno){
    this.ano=novoAno;
    }
    public void setDisponivel(boolean disponivel){
    this.disponivel=disponivel;
    }
    public void emprestar() {
        if (disponivel) {
            disponivel = false;// Altera o estado do atributo disponivel para false, indicando que o livro não está mais disponível.
            System.out.println("Livro emprestado: " + titulo);//Mostra a mensagem
        } else {
            System.out.println("Livro que já foi emprestado: " + titulo);
        }
    }

    public void devolver() {
        if (disponivel) {
            disponivel = true;
            System.out.println("Livro devolvido: " + titulo);
        } else {
            System.out.println("Este livro não foi emprestado: " + titulo);
        }
    }


    }
