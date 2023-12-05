public class aula07 {
    public static void main(String[] args) {
    lutador L[] = new lutador[4];
    L[0] = new lutador("Edinaldo", "Brasileiro", 27, 180, 80, 20, 10, 0);
    L[1] = new lutador("Roger", "Brasileiro", 25, 185, 90, 16, 12, 8);
    L[2] = new lutador("Chico", "Brasileiro", 30, 178, 70, 10, 8, 5);
    L[3] = new lutador("Caze", "Brasileiro", 29, 189, 100, 0, 0, 30);    

    L[3].apresentar();
    L[3].status();
    
}   
}
