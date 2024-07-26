package com.easy.code.pattern.accountstates;

import com.easy.code.pattern.AccountState;
import com.easy.code.pattern.AccountUnfrozen;

import java.math.BigDecimal;
import java.util.function.Consumer;

public class NotVerified implements AccountState {
	private AccountUnfrozen onUnFrozen;

	public NotVerified(AccountUnfrozen onUnFrozen) {
		this.onUnFrozen=onUnFrozen;
	}
	@Override
	public AccountState withdraw(BigDecimal balance, BigDecimal amount, Consumer<BigDecimal> subtractFromBalance) {
		return this;
	}

	@Override
	public AccountState deposit(BigDecimal amount, Consumer<BigDecimal> addToBalance) {
		addToBalance.accept(amount);
		return this;
	}

	@Override
	public AccountState freezeAccount() {
		return this;
	}

	@Override
	public AccountState holderVerified() {
		return new Active(this.onUnFrozen);
	}

	@Override
	public AccountState closeAccount() {
		return new Closed();
	}
}
