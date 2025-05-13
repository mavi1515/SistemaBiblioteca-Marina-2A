
public class Usuário {
    //atributos
    private int ID;
    private String nome;
    private String email;
    
    
    
    //construtor
    public Usuário(int ID, String nome, String email){
    this.ID = ID;
    this.nome = nome;
    this.email = email;
    }
    
    public int getID(){
    return ID;
    }
    public String getnome(){
    return nome;
    }
    public String getemail(){
    return email;
    }
    public void setID(int novoID){
    this.ID=novoID;
    }
    
    public void setnome(String novoNome){
    this.nome=novoNome;
    }
    public void setemail(String novoEmail){
    this.email=novoEmail;
    }
}
