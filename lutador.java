public class lutador {
    // atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private int peso;
    private String categoria;
    private int vitoria, derrota, empate;

    // metodos
    public void apresentar() {
        System.out.println("---------------------------------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Vitorias: " + this.getVitoria());
        System.out.println("Derrotas: " + this.getDerrota());
        System.out.println("Empates: " + this.getEmpate());
    }

    public void status() {
        System.out.println("---------------------------------");
        System.out.println(this.getNome());
        System.out.println("É um : " + this.getCategoria());
        System.out.println(this.getVitoria() + " Vitorias");
        System.out.println(this.getDerrota() + " Derrotas");
        System.out.println(this.getEmpate() + " Empates");
    }

    public void ganharLuta() {
        this.setVitoria(this.getVitoria() + 1);
    }

    public void perderLuta() {
        this.setDerrota(this.getDerrota() + 1);
    }

    public void empatarLuta() {
        this.setEmpate(this.getEmpate() + 1);
    }

    // metodos especiais
    public lutador(String nome, String nacionalidade, int idade, float altura, int peso, int vitoria, int derrota,
            int empate) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.empate = empate;
    }
    // Métodos Getters

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitoria() {
        return vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public int getEmpate() {
        return empate;
    }

    // Métodos Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
        this.setCategoria();
    }

    private void setCategoria() {
        if (this.peso < 52) {
            this.categoria = "Invalido";
        } else if (this.peso <= 70) {
            this.categoria = "Peso Leve";
        } else if (this.peso <= 83) {
            this.categoria = "Peso Medio";
        } else if (this.peso <= 120) {
            this.categoria = "Peso Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

}
