package Professor;
public class Main {
    public static void main(String[] args) throws Exception {
        
        Membro membro1 = new Membro("George", "SY383127");
        Membro membro2 = new Membro("Stephen", "SJ343442");
        Membro membro3 = new Membro("Agatha", "SJ789987");

        Comissao comissao = new Comissao();

        System.out.println("Adicionando membros na comissão: \n");
        comissao.adicionarMembro(membro1);
        comissao.adicionarMembro(membro2);

        System.out.println("\nImprimindo membros da comissão: ");
        comissao.imprimirMembros();

        System.out.println("\nVerificando se é membro da comissão: \n");
        comissao.verificarMembro(membro2.getNome());
        comissao.verificarMembro(membro3.getNome());
    }
}
