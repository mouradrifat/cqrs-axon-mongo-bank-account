package query.entities;

import app.enums.OperationType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Document @Data @AllArgsConstructor @NoArgsConstructor @ToString
public class AccountOperation {
    @Id
    private Long id;
    private Date operationDate;
    private BigDecimal amount;
    private OperationType type;
    @DBRef
    private BankAccount bankAccount;
}
