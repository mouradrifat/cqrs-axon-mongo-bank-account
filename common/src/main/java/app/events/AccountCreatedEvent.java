package app.events;

import app.enums.AccountStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.math.BigDecimal;


public class AccountCreatedEvent extends BaseEvent<String> {
    @Getter
    private final BigDecimal balance;
    @Getter
    private final String currency;
    @Getter
    private final AccountStatus status;

    public AccountCreatedEvent(@JsonProperty("id") String id, @JsonProperty("balance") BigDecimal balance, @JsonProperty("currency") String currency, @JsonProperty("status") AccountStatus status) {
        super(id);
        this.balance = balance;
        this.currency = currency;
        this.status = status;
    }
}
