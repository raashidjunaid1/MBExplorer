package MBExplorerGradle.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MBExplorerGradle.domains.Account;
import MBExplorerGradle.repositories.AccountRepository;

@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepository;

	public Object findAllAccounts() {
		return accountRepository.findAll();
	}

	public Account findById(Integer i) {
		return accountRepository.findOne(i);
	}

	public void deleteById(Integer id) {
		accountRepository.delete(id);
		;
	}

	public void save(Account a) {
		accountRepository.save(a);
	}
}