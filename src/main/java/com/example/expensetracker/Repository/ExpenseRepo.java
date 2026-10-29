package com.example.expensetracker.Repository;

import com.example.expensetracker.Model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepo extends JpaRepository<Expense,Long> {
}
