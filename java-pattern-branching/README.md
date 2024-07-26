## Design-pattern: State Pattern 


Simple implementation of a state pattern in Banking: purpose of it is to avoid branches with If / else

so when the Account is created , the balance is on 0

for some reasons like the account is not active since 2 Month the bank can freeze it.
## States
- on the frozen state the bank can unfreeze it or close the account
- on the NotVerified state the bank can accept the Verification, close the account and accept deposit
- on the active state everything is possible
- Deposit or withdraw the amount should unfreeze the account

## Installation Guides

#### Required Tools

- Java 8+
- Eclipse - Recent Version
- Git