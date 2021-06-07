package model.sevice.contract.impl;

import model.bean.Contract;
import model.repository.ContractRepository;
import model.sevice.contract.IContract;

public class ContractImpl implements IContract {
ContractRepository contractRepository = new ContractRepository();
    @Override
    public void insertContract(Contract contract) {
        contractRepository.insertContract(contract);
    }
}
