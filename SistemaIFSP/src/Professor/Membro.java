package Professor;
public class Membro {

    private String nome;
    private String prontuário;

    public Membro(String nome, String prontuário) {
        this.nome = nome;
        this.prontuário = prontuário;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProntuário() {
        return prontuário;
    }

    public void setProntuário(String prontuário) {
        this.prontuário = prontuário;
    }

    public String toString() {
        return "Membro [nome = " + nome + ", prontuário = " + prontuário + "]";
    }

    public boolean hasNext() {
        return false;
    }
   
}
