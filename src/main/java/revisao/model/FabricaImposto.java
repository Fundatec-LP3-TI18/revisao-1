package revisao.model;

public class FabricaImposto {

    public static ImpostoInterface criarImposto(Integer idCliente){
        if(idCliente == 1) {
            return new ImpostoCamisa();
        } else  {
            return new ImpostoBermuda();
        }
    }
}
