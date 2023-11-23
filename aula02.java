public class aula02 {
   public static void main(String[] args){
        //caneta
        caneta c1 = new caneta();
        c1.setModelo("bic");
        c1.setPonta(0.5f);
        c1.status();
        System.out.println("----------------------------");
        
        //conta banco
        contabanco p1 = new contabanco();
        p1.setDono("Armindo");
        p1.setNumConta(1000);
        p1.abrirConta("cc");
        p1.depositar(100);
        contabanco p2 = new contabanco();
        p2.setDono("Robert");
        p2.setNumConta(1001);
        p2.abrirConta("cp");
        p2.depositar(500);
        p2.sacar(180);

        p1.estado();
        p2.estado();
    }
}