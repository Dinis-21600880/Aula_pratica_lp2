public class Utilizador{
    String nome;
    String apelido;
    String email;
    int num_telemovel;
    String user_name;
    String password;

    Utilizador(){}

    Utilizador(String nome, String apelido, String email, int num_telemovel, String user_name, String password){
        this.nome= nome;
        this.apelido=apelido;
        this.email= email;
        this.num_telemovel=num_telemovel;
        this.user_name= user_name;
        this.password= password;
    }

    public String toString(){
        return nome + " " + apelido+ " " + email+ " " + num_telemovel;
    }

    public boolean temEmail(){
        if(email == ""){
            return false;
        }else if (email == null){
            return false;
        }else{
            return true;
        }
    }


    public void mostrar(){
        System.out.println(nome +" "+ apelido+" "+email+" "+num_telemovel);
    }

    public boolean verificarCredenciais(String user_name, String password){
        if(this.user_name == user_name && this.password == password){
           return true;
        }else{
           return false;
        }
    }


}