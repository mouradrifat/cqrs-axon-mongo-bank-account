package query.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import query.entities.AccountOperation;

import java.util.List;

public interface AccountOperationRepository extends MongoRepository<AccountOperation,Long> {
    List<AccountOperation> findByBankAccountId(String accountId);
}
