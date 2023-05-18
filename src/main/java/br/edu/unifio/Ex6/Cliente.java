package br.edu.unifio.Ex6;

public class Cliente extends Pessoa {
    private int codigo;

    public Cliente() {
        super();
    }

    public Cliente(String nome, Data dataNascimento, int codigo) {
        super(nome, dataNascimento);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public void imprimirDados() {
        System.out.println("\nDados do Cliente: ");
        super.imprimirDados();
        System.out.println("Código: " + getCodigo());
    }
}
