
public class Administrador {
    //Atributos
  private int ID;
  private String nome;
  private String email;
  private String cargo;
  //construtor
  public Administrador(int ID, String nome, String email, String cargo){
  this.ID = ID;
  this.nome = nome;
  this.email = email;
  this.cargo = cargo;
  }
  //método get
    public int getID() {
        return ID;
    }
    public String getnome(){
    return nome;
    }
    public String getemail(){
    return email;
    }
    public String getcargo(){
    return cargo;
    }
    //método set 
    public void setID(int novoID){
    this.ID=novoID;
    }
    
    public void setnome(String novoNome){
    this.nome=novoNome;
    }
    public void setemail(String novoEmail){
    this.email=novoEmail;
    }
    public void setcargo(String novoCargo){
    this.cargo=novoCargo;
    }
}
