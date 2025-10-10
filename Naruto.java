
class DemonioBijuu {
    // Atributo privado - só a própria classe pode acessar diretamente
    private String habilidades; // só a classe Demonio mexer nisso

    // permite Ler o valor do atributo privado
    public String getHabilidades() { // porta de acesso controlado
        return habilidades;
    }

    // permite Definir/Modificar o valor do atributo privado
    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }
}

// Classe filho Herdando DemonioBijuu
public class Naruto extends DemonioBijuu {
    public void mostrarPoder() {
        System.out.println("Habilidades: " + getHabilidades());
    }

    public static void main(String[] args) {
        Naruto ninja = new Naruto();
        ninja.setHabilidades("Modo Sábio das Seis Caminhos");
        ninja.mostrarPoder();
    }
}
