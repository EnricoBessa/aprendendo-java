import java.util.Random;

public class luta {
    // atributos
    private lutador desafiado;
    private lutador desafiante;
    private int rounds;
    private boolean aprovado;

    // metodos
    public void marcarLuta(lutador l1, lutador l2) {
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovado) {
            System.out.println("======================");
            this.desafiado.apresentar();
            this.desafiante.apresentar();

            Random aleatorio = new Random();

            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0: // empate
                    System.out.println("==============");
                    System.out.println("Empatou");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1: // Desafiante ganhou
                    System.out.println("==============");
                    System.out.println(desafiado.getNome() + " ganhou a luta!");
                    desafiado.ganharLuta();
                    System.out.println(desafiante.getNome() + " perdeu a luta!");
                    desafiante.perderLuta();
                    break;
                case 2: // Desafiado ganhou
                    System.out.println("==============");
                    System.out.println(desafiante.getNome() + " ganhou a luta!");
                    desafiante.ganharLuta();
                    System.out.println(desafiado.getNome() + " perdeu a luta!");
                    desafiado.perderLuta();
                    break;
            }

        } else {
            System.out.println("A luta nao pode acontecer");
        }
    }

    // metodos especiais
    public lutador getDesafiado() {
        return desafiado;
    }

    public lutador getDesafiante() {
        return desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    // Métodos Setters

    public void setDesafiado(lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

}
