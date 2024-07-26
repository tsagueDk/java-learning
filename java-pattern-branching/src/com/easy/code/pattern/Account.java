package com.easy.code.pattern;

import java.math.BigDecimal;

public class Account {
	private BigDecimal balance;
	private boolean isVerified;
	private boolean isClosed;
	private EnsureUnfrozen ensureUnfrozen;
	private AccountUnfrozen onUnFrozen;

	public Account(AccountUnfrozen onUnFrozen) {
		balance = BigDecimal.ZERO;
		this.onUnFrozen= onUnFrozen;
		this.ensureUnfrozen= this::stayUnFrozen;
	}

	public void holderVerified() {
		this.isVerified = true;
	}

	public void closeAccount() {
		this.isClosed = true;
	}

	public void freezeAccount() {
		if (this.isClosed)
			return; // Account must not be closed
		if (!this.isVerified)
			return; //Account must be verified
		this.ensureUnfrozen= this::unfreeze;
	}

	public void deposit(BigDecimal amount) {
		if (this.isClosed) {
			return;
		}
		ensureUnfrozen.execute();
		this.balance.add(amount);
	}

	public void withdraw(BigDecimal amount) {
		if (!this.isVerified) {
			return;
		}
		if (this.isClosed) {
			return;
		}
		ensureUnfrozen.execute();
		this.balance.subtract(amount);
	}



	private void unfreeze() {
		this.onUnFrozen.handle();
		this.ensureUnfrozen=this::stayUnFrozen;
	}

	private void stayUnFrozen() {
		//do nothing
	}

}
