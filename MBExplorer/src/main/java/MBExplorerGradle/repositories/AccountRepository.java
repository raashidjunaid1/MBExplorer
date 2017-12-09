package MBExplorerGradle.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import MBExplorerGradle.domains.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer> {
}