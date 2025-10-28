package com.prestek.FinancialEntityCore.request;

public record QuoteRequest(
        long amount,
        int termMonths,
        int score,
        long monthlyIncome,
        long monthlyExpenses
) { }

