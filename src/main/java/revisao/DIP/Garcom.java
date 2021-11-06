package revisao.DIP;

import revisao.DIP.FormasDeServir.JeitoDeServirBebida;
import revisao.DIP.FormasDeServir.ServirCerveja;
import revisao.DIP.FormasDeServir.ServirVodka;

public class Garcom {
    // SOLID

    // Injecao de dep
    // Acoplou + classes concretas = quebrando o DIP
    public String servirBebidaSemAbstracao(int idBebida, ServirVodka servirVodka, ServirCerveja servirCerveja){
        if(idBebida == 1)
            return servirVodka.servir();
        else
            return servirCerveja.servir();
    }

    // OCP
    public String servirBebidaComAbstracao(int idBebida, JeitoDeServirBebida jeitoCoringa){ //cerveja ou vodka
        return jeitoCoringa.servir();
    }

}
