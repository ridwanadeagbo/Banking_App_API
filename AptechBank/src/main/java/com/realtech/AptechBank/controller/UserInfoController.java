package com.realtech.AptechBank.controller;

import com.realtech.AptechBank.dto.*;
import com.realtech.AptechBank.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bankingapp/")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @PostMapping("/createaccount")
    public BankResponse createAccount(@RequestBody UserRequest userRequest){
        return userInfoService.createAccount(userRequest);
    }
    @GetMapping("admin/allUsers")
    public List<AccountInfo> allUsers(){
        return userInfoService.allUsers();
    }
    @GetMapping("admin/getAccountName")
    public String getAccountName(@RequestBody EnquiryRequest request){
        return userInfoService.getAccountName(request);
    }
    @GetMapping("user/getBalance")
    public BankResponse getBalance(@RequestBody EnquiryRequest request){
        return userInfoService.getBalance(request);
    }
    @PostMapping("user/creditAccount")
    public BankResponse creditAccount(@RequestBody CreditDebitRequest request){
        return userInfoService.creditAccount(request);
    }
    @PostMapping("user/debitAccount")
    public BankResponse debitAccount(@RequestBody CreditDebitRequest request){
        return userInfoService.debitAccount(request);
    }
    @PostMapping("user/transfer")
    public BankResponse transfer(@RequestBody TransferRequest request){
        return userInfoService.transfer(request);
    }
    @PostMapping("user/multipleTransfer")
        public BankResponse multipleTransfer(@RequestBody MultipleTransferRequest request){
        return userInfoService.multipleTransfer(request);
    }
}