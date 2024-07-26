package com.easy.code.pattern;

import com.easy.code.pattern.accountstates.Active;

import java.math.BigDecimal;


public class Account {
	private BigDecimal balance;
	private AccountState state;

	public Account(AccountUnfrozen onUnFrozen) {
		balance = BigDecimal.TEN;
		this.state= new Active(onUnFrozen);
	}

	public void holderVerified() {
		this.state = this.state.holderVerified();
	}

	public void closeAccount() {
		this.state = this.state.closeAccount();
	}

	public void freezeAccount() {
		this.state=this.state.freezeAccount();
	}

	public void deposit(BigDecimal amount) {
		this.state=this.state.deposit(amount,this::addToBalance);
	}

	private void addToBalance(BigDecimal amount){
		this.balance.add(amount);
	}
	private void subtractToBalance(BigDecimal amount){
		this.balance.subtract(amount);
	}

	public void withdraw(BigDecimal amount) {
		this.state=this.state.withdraw(this.balance,amount,this::subtractToBalance);
	}

	public BigDecimal getBalance(){
		return this.balance;
	}

}
