package revisao.DIP.FormasDeServir;

public class ServirVodka implements JeitoDeServirBebida { // Classe concreta = instavel

    public String servir(){
        System.out.println("=== DENTRO DA CLASSE VODKA ===");
        return "Estou servindo Vodka!!!!";
    }
}
