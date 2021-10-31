package revisao.model;

public class ImpostoCamisa implements ImpostoInterface {
    @Override
    public Double calcula(Double valorOriginal) {
        return valorOriginal * 10;
    }
}
