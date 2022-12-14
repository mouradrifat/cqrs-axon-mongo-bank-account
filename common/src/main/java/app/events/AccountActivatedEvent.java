package app.events;

import app.enums.AccountStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

public class AccountActivatedEvent extends BaseEvent<String> {
    @Getter
    private final AccountStatus status;

    public AccountActivatedEvent(@JsonProperty("id") String id, @JsonProperty("status") AccountStatus status) {
        super(id);
        this.status = status;
    }
}
