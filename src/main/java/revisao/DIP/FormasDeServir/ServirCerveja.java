package revisao.DIP.FormasDeServir;

public class ServirCerveja implements JeitoDeServirBebida{

    public String servir() {
        System.out.println("=== CLASSE SERVIR CERVEJA ===");
        return "Estou servindo Cerveja!!!!";
    }
}
