package query.entities;

import app.enums.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
@Document @Data @AllArgsConstructor @NoArgsConstructor @ToString
public class BankAccount {
    @Id
    private String id;
    private BigDecimal balance;
    private AccountStatus status;
}
