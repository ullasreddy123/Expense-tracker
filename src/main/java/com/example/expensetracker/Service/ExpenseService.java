package com.example.expensetracker.Service;

import com.example.expensetracker.Model.Expense;
import com.example.expensetracker.Repository.ExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExpenseService {
    @Autowired
    ExpenseRepo expenserepo;

    public List<Expense> getallexpense(){
        return expenserepo.findAll();
    }
    public void saveexpense(Expense expense){
        expenserepo.save(expense);
    }
    public Expense getexpensebyid(Long id){
        return expenserepo.findById(id).orElse(null);
    }

    public void deleteexpense(Long id){
        expenserepo.deleteById(id);
    }
}
