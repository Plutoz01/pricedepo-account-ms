package org.plutoz.pricedepo.account.ms.repository;

import org.plutoz.pricedepo.account.ms.domain.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

}
