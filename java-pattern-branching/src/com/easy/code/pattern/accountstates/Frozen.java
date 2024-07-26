package com.easy.code.pattern.accountstates;

import com.easy.code.pattern.AccountState;
import com.easy.code.pattern.AccountUnfrozen;

import java.math.BigDecimal;
import java.util.function.Consumer;

public class Frozen implements AccountState {

	private AccountUnfrozen onUnFrozen;

	public Frozen(AccountUnfrozen onUnFrozen) {
		this.onUnFrozen=onUnFrozen;
	}

	@Override
	public AccountState deposit(BigDecimal amount, Consumer<BigDecimal> addToBalance) {
		addToBalance.accept(amount);
		return this.unFreeze();
	}

	@Override
	public AccountState withdraw(BigDecimal balance, BigDecimal amount, Consumer<BigDecimal> subtractFromBalance) {
		if(balance.compareTo(amount) >=0){
			subtractFromBalance.accept(amount);
		}
		return this.unFreeze();
	}


	@Override
	public AccountState freezeAccount() {
		return this;
	}

	@Override
	public AccountState holderVerified() {
		return this;
	}

	@Override
	public AccountState closeAccount() {
		return new Closed();
	}

	private AccountState unFreeze(){
		this.onUnFrozen.handle();
		return new Active(this.onUnFrozen);
	}
}
