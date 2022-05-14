package Aluno;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Conta conta = new Conta();
        Restaurante restaurante = new Restaurante();
        Mesa mesa = new Mesa();

        // Adicionando garçons
        mesa.setGarcom("Andrzej Sapkowski");
        mesa.setGarcom("Svetlana Alexijevich");

        // Adicionando conta
        mesa.setConta(conta);

        // Adicionando mesa
        restaurante.adicionarMesa(mesa);

        // Adicionando pratos
        restaurante.adicionarPrato("Strogonoff", 29.5);
        restaurante.adicionarPrato("Goulash", 17.5);
        restaurante.adicionarPrato("Pot-au-feu", 20.5);

        // Adicionando pedidos
        conta.adicionarPedido(2, "Strogonoff", 29.5);
        conta.adicionarPedido(3, "Goulash", 17.5);
        conta.adicionarPedido(1, "Pot-au-feu", 20.5);

        // Alterando a disponibilidade da mesa
        mesa.setAberta(true);

        int escolha = 0;

        do {
            System.out.println(
                    "\nEscolha uma opção: \n\n1 - Buscar mesa disponível; \n2 - Buscar opções de pratos;\n3 - Fechar pedido;\n4 - Sair.\n");
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    restaurante.mesaIsDisponivel(mesa);
                    break;
                
                case 2:
                    restaurante.pesquisarPrecoPrato("Strogonoff", 29.5);
                    restaurante.pesquisarPrecoPrato("Goulash", 17.5);
                    restaurante.pesquisarPrecoPrato("Pot-au-feu", 20.5);
                    break;
                
                case 3:
                    restaurante.solicitarConta(mesa);
                    break;
            }

        } while (escolha != 4);

        if(escolha==4){
            System.out.println("\nPrograma finalizado!");
        }
        
        entrada.close();
    }
}