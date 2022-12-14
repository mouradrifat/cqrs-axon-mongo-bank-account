package query.mappers;


import org.mapstruct.Mapper;
import query.dto.AccountOperationResponseDTO;
import query.dto.BankAccountResponseDTO;
import query.entities.AccountOperation;
import query.entities.BankAccount;

@Mapper(componentModel = "spring")
public interface BankAccountMapper {
    BankAccountResponseDTO bankAccountToBankAccountDTO(BankAccount bankAccount);
    AccountOperationResponseDTO accountOperationToAccountOperationDTO(AccountOperation accountOperation);
}
