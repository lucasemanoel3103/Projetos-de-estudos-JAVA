package sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeContatos {
    private List<Contato> contatos;

    public GerenciadorDeContatos() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato){
        contatos.add(contato);
    }

    public void removerContato(String nome){
        contatos.removeIf(contato -> contato.getNome().equalsIgnoreCase(nome));
    }

    public Contato buscarContato(String nome){
        for(Contato contato : contatos){
            if(contato.getNome().equalsIgnoreCase(nome)){
                return contato;
            }
        }
        return null;
    }
    public void listarContatos(){
        if(contatos.isEmpty()){
            System.out.println("Nenhum contato encontrado.");
        }else{
            for(Contato contato : contatos){
                System.out.println(contato);
            }
        }
    } 
}
