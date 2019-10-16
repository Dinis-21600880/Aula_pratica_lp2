public class Main {
    public static void main(String[] args){
        //Criar objetos com construtor
        Utilizador utilizador1 = new Utilizador("Dinis","Oliveira","asd@gmail.com",912375608,"Alentejano","1234");

        Utilizador utilizador2 = new Utilizador("Andre","Pereria","qwe@gmail.com",918475456,"AP","5678");

        //Criar objetos sem construtor
        Utilizador utilizador3;

        utilizador3 = new Utilizador();
        utilizador3.nome = "Joao";
        utilizador3.apelido = "Carlos";
        utilizador3.email = "akldjasjf@gmail.com";
        utilizador3.num_telemovel = 912483925;

       // System.out.println(utilizador3);

        utilizador1.mostrar();
        System.out.println(utilizador1.temEmail());
        System.out.println(utilizador1.verificarCredenciais("Alentejano","1234"));
    }


}



