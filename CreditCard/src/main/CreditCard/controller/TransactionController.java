package com.Project.CreditCard.controller;


import com.Project.CreditCard.entity.Transaction;
import com.Project.CreditCard.service.TransactionService;
import com.Project.CreditCard.utility.SpendingCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    private final TransactionService transactionService;
    @Autowired
    public TransactionController(TransactionService _transactionService)
    {
        this.transactionService=_transactionService;
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Transaction>> getTransactionByUserId(@PathVariable String userId)
    {
        List<Transaction> transactions = transactionService.getTransactionsByUserId(userId);
        return ResponseEntity.ok(transactions);
    }

    @GetMapping("/merchant/{merchant}")
    public ResponseEntity<List<Transaction>> getTransactionsByMerchant(@PathVariable String merchant)
    {
        List<Transaction> transactions=transactionService.getTransactionsByMerchant(merchant);
        return ResponseEntity.ok(transactions);
    }

    @GetMapping("/category/{spendingCategory}")
    public ResponseEntity<List<Transaction>> getTransactionsByCategory(@PathVariable SpendingCategory spendingCategory)
    {
        List<Transaction> transactions= transactionService.getTransactionsBySpendingCategory(spendingCategory);
        return ResponseEntity.ok(transactions);
    }




}
