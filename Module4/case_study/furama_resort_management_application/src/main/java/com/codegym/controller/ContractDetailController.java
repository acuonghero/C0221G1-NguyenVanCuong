package com.codegym.controller;

import com.codegym.model.entity.AttachService;
import com.codegym.model.entity.Contract;
import com.codegym.model.entity.ContractDetail;
import com.codegym.model.service.IAttachService;
import com.codegym.model.service.IContractDetailService;
import com.codegym.model.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/contract-detail")
public class ContractDetailController {
    @Autowired
    IContractDetailService contractDetailService;
    @Autowired
    IAttachService attachService;
    @Autowired
    IContractService contractService;
    @ModelAttribute("contract")
    List<Contract> findAllContract(){
       return contractService.findAll();
    }
    @ModelAttribute("attachService")
    List<AttachService> findAllAttachService(){
        return attachService.findAll();
    }
    @GetMapping(value = "/create")
    public String showCreateForm(Model model){
        model.addAttribute("contractDetail",new ContractDetail());
        return "contract_detail/create";
    }
}
