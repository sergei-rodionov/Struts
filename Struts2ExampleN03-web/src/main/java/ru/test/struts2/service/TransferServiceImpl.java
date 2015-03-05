package ru.test.struts2.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ru.test.struts2.dao.DAO;
import ru.test.struts2.entity.Account;
import ru.test.struts2.entity.Person;
import ru.test.struts2.entity.Transfer;

/**
 *
 * @author APronchakov <artem.pronchakov@gmail.com>
 */
public class TransferServiceImpl implements TransferService{
	private Logger log = Logger.getLogger(TransferServiceImpl.class);
	
	private DAO dao;

	@Override
	public List<Transfer> getTransfersByPerson(Person person) {
		List<Transfer> tList = new ArrayList<Transfer>();
		for (Account account: person.getAccountList()) {
			tList.addAll(account.getIncommingTransfers());
			tList.addAll(account.getOutcommingTransfers());
		}
		return tList;
	}

	public DAO getDao() {
		return dao;
	}

	public void setDao(DAO dao) {
		this.dao = dao;
	}

	@Override
	@Transactional(propagation= Propagation.REQUIRED)
	public void proccessTransfer(Account from, Account to, double amount, String comment) {
		Transfer transfer = new Transfer();
		transfer.setSendersAccount(from);
		transfer.setRecieversAccount(to);
		transfer.setAmount(new BigDecimal(amount));
		transfer.setComment(comment);
		
		transfer = dao.save(transfer, true);
	}

}
