package com.easy.code.pattern;

import java.math.BigDecimal;
import java.util.function.Consumer;

public interface AccountState {
	AccountState withdraw(BigDecimal balance,BigDecimal amount, Consumer<BigDecimal> subtractFromBalance);

	AccountState deposit(BigDecimal amount, Consumer<BigDecimal> addToBalance);

	AccountState freezeAccount();
	AccountState holderVerified();
	AccountState closeAccount();

}
