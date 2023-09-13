package Aula02;

public class ContaBanco {

    public int numConta; 
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("---------------------------------------------");
        System.out.println("Conta: " +this.getNumConta());
        System.out.println("Dono: " +getDono());
        System.out.println("Tipo: " +getTipo());
        System.out.println("Saldo: " +getSaldo());
        System.out.println("Status: " +getStatus());

    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso.");
        

    }

    public void fecharConta(){
        if (this.getSaldo() == 0) {
            this.setStatus(false);
            System.out.println("Conta fechada.");
        }
        else if (this.getSaldo() < 0) {
            System.out.println("O saldo deve ser 0.");
        }

    }

    public void depositar(float v){

        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }
        else {
            System.out.println("Impossível depositar, conta fechada.");
        }

    }
    public void sacar(float v){

        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }
            else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Impossível sacar, conta fechada.");
        }

    }
    public void pagarMensal(int v){
    if (this.getTipo() == "CC") {
        v = 12;
    } else if (this.getTipo() == "CP") {
        v = 20;
    } 
    if (this.getStatus()){
        if(this.getSaldo() > v){
            this.setSaldo(getSaldo() - v);
            System.out.println("Mensalidade paga por " + this.getDono());
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    else {
        System.out.println("Impossível pagar, conta fechada.");
    }

    }

    public ContaBanco(){
        this.saldo=0;
        this.status=false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    

}