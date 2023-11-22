public class contabanco {

    public int numConta;
    public String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void abirConta(String t){

    }
    public void fecharConta(){
        
    }
    public void depositar(){
        
    }
    public void sacar(){
        
    }
    public void pagarMensal(){
        
    }

    public contabanco(){
        
    }

    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(int n){
        return this.numConta;
    }

    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(int t){
        return this.tipo;
    }

    public void setDono(int d){
        this.numConta = d;
    }
    public String getDono(int n){
        return this.dono;
    }

    public void setStatus(boolean st){
        this.status = st;
    }
    public boolean getStatus(int st){
        return this.status;
    }

    public void setSaldo(int s){
        this.saldo = s;
    }
    public float getSaldo(int s){
        return this.saldo;
    }
}