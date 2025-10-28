package com.prestek.FinancialEntityCore.dto;

public record QuoteDto(
        String institution,
        double rateEAmin,
        double rateEAmax,
        long monthlyPaymentMin,
        long monthlyPaymentMax,
        long feesEstimated,
        double aprEAEstimated,
        String validUntil
) {}