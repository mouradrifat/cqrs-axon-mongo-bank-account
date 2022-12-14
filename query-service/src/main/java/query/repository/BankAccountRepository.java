package query.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import query.entities.BankAccount;

public interface BankAccountRepository extends MongoRepository<BankAccount,String> {
}
