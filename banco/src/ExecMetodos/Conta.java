package ExecMetodos;

public class Conta {

	
	private float limite;
	private float saldo;



	public Conta (float limite, float saldo) {
		
		this.limite=limite;
		this.saldo=saldo;
	}

	public void sacar(float valor){
		if(valor <= this.saldo){
			this.saldo = this.saldo -  valor;
			System.out.println("Saque realizado com sucesso");
		}else if(valor <= this.saldo + this.limite){
			float val_ret = this.saldo - valor;
			if(val_ret < 0){
				this.saldo = 0;
			}

			val_ret = this.limite + val_ret;
			this.limite = val_ret;
			System.out.println("Saque realizado com sucesso");
		}else{
			System.out.println("Saldo insuficiente");
		}
	}

	public void depositar(float valor ) {
		this.saldo = this.saldo + valor;

	}

	public float getSaldo() {
		return	this.saldo + this.limite;
	}



}
