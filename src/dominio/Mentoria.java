package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate dataMentoria;

    public Mentoria(String titulo, String descricao, LocalDate dataMentoria) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setDataMentoria(dataMentoria);
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }
}
