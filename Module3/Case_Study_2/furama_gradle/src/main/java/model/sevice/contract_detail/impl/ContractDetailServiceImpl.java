package model.sevice.contract_detail.impl;

import model.bean.AttachService;
import model.bean.Contract;
import model.repository.ContractDetailRepository;
import model.sevice.contract_detail.IContractDetailService;

import java.util.List;

public class ContractDetailServiceImpl implements IContractDetailService {
    ContractDetailRepository contractDetailRepository = new ContractDetailRepository();
    @Override
    public List<AttachService> selectAllAttachService() {
        return contractDetailRepository.selectAllAttachService();
    }

    @Override
    public List<Contract> selectAllContract() {
        return contractDetailRepository.selectAllContract();
    }
}
