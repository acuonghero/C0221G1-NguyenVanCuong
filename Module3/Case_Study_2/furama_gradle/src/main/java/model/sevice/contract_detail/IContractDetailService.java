package model.sevice.contract_detail;

import model.bean.AttachService;
import model.bean.Contract;

import java.util.List;

public interface IContractDetailService {
    List<AttachService> selectAllAttachService();
    List<Contract> selectAllContract();
}
