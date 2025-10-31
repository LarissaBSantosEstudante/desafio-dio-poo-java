package dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Bootcamp> bootcampsInscritos = new HashSet<>();
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.bootcampsInscritos.add(bootcamp);
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevs().add(this);
    }

    public void progredir() {

       Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
       if(conteudo.isPresent()) {
           this.conteudosConcluidos.add(conteudo.get());
           this.conteudosInscritos.remove(conteudo.get());
       } else {
           System.out.println("Você não está inscrito em nenhum conteúdo.");
       }

    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXP).sum();
    }

    public void exibirBootcampsEmAndamento() {
        bootcampsInscritos.forEach(bootcamp -> System.out.println(bootcamp.toString()));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Bootcamp> getBootcampsInscritos() {
        return bootcampsInscritos;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
