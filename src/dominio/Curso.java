package dominio;

import java.time.LocalDate;

public class Curso extends Conteudo{
    private double cargaHoraria;

    public Curso(String titulo, String descricao, double cargaHoraria) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setCargaHoraria(cargaHoraria);
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + cargaHoraria;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
