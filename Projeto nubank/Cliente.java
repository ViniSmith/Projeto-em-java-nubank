
public class Cliente
{
    private String nome, sobrenome;
    private int cpf, dataNascimento;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public int getCpf() {
        return this.cpf;
    }
    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public int getDataNascimento() {
        return this.dataNascimento;
    }
}
