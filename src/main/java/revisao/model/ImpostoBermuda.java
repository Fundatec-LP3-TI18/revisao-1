package revisao.model;

public class ImpostoBermuda implements ImpostoInterface {
    @Override
    public Double calcula(Double valorOriginal) {
        return valorOriginal;
    }
}
