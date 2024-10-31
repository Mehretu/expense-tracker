package com.company.expensetracker.view.expense;

import com.company.expensetracker.entity.Expense;
import com.company.expensetracker.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "expenses", layout = MainView.class)
@ViewController("Expense.list")
@ViewDescriptor("expense-list-view.xml")
@LookupComponent("expensesDataGrid")
@DialogMode(width = "64em")
public class ExpenseListView extends StandardListView<Expense> {
}