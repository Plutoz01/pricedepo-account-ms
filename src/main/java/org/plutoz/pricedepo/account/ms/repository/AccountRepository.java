package org.plutoz.pricedepo.account.ms.repository;

import org.plutoz.pricedepo.account.ms.domain.Account;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {

}
