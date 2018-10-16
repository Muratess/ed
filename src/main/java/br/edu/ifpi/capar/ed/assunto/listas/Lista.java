package br.edu.ifpi.capar.ed.assunto.listas;

/**
 *
 * @author seijuh
 */
public class Lista {

    private ElementoLista primeiro;
    private ElementoLista ultimo;
    private int total;

    public int totalElementos() {
        return this.total;
    }

    public void adicionar(Materia nova) {
        ElementoLista elementoNovo = new ElementoLista(nova);

        if (total == 0) {
            this.primeiro = elementoNovo;
            this.ultimo = elementoNovo;
        } else {
            ElementoLista temporario = this.ultimo;
            this.ultimo = elementoNovo;
            temporario.definirProximo(elementoNovo);
        }

        this.total++;
    }

    public void remover(int posicao) {

    }

    public void remover(Materia materia) {

    }

    public void removerUltima() {

    }

    public String imprimirLista() {
        StringBuilder builder = new StringBuilder("Lista[");

        builder.append(this.primeiro).append(", ");
        ElementoLista atual = this.primeiro.irParaProximo();
        for (int i = 1; i < totalElementos(); i++) {
            builder.append(atual).append(", ");
            atual = atual.irParaProximo();
        }
        builder.append("]");
        return builder.toString();
    }

    public void alterar(Materia antiga, Materia nova) {

    }
}
