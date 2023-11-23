public class contabanco {

    public int numConta;
    public String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estado(){
        System.out.println("----------------------------");
        System.out.println("Dono: " + this.getDono());
        System.out.println("Conta: " + this.getNumConta())
        ;System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Status: " + this.getStatus());

    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "cc") {
            this.setSaldo(50);
        } else if (t == "cp") {
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em debito");
        } else {
            setStatus(false);
            System.out.println("Conta fechada");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo((this.getSaldo() + v));
            System.out.println("Dposito realizado para o " + this.getDono());
        } else {
            System.out.println("Imposivel depositar");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "cc") {
            v = 12;
        } else if (this.getTipo() == "cp") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mesalidade paga por " + getDono());
        } else {
            System.out.println("Impossivel pagar de uma conta fechada");
        }
    }

    public contabanco() {
        // Implementação do construtor, se necessário
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public String getDono() {
        return this.dono;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public float getSaldo() {
        return this.saldo;
    }
}
