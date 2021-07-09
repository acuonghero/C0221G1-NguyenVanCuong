package com.codegym.controller;

import com.codegym.model.entity.AttachService;
import com.codegym.model.entity.Contract;
import com.codegym.model.service.IAttachService;
import com.codegym.model.service.IContractService;
import com.codegym.model.service.IService;
import com.codegym.model.service.impl.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/using-service")
public class CustomerUsingServiceController {
    @Autowired
    IContractService contractService;
    @Autowired
    IService serviceImpl;
    @Autowired
    IAttachService attachService;

    @GetMapping(value = "")
    public ModelAndView showList(@RequestParam Optional<String> search, Pageable pageable){
        List<AttachService> attachServices = attachService.findAll();
        String nameValue = "";
        if(search.isPresent()){
            nameValue = search.get();
        }
        Page<Contract> contractPage = contractService.findAllByCustomerName(nameValue,pageable);
        return new ModelAndView("using_service/list").addObject("attachService",attachServices)
                .addObject("contract",contractPage);
    }
}
