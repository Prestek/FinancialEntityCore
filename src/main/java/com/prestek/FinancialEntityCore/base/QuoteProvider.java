package com.prestek.FinancialEntityCore.base;

import com.prestek.FinancialEntityCore.dto.QuoteDto;
import com.prestek.FinancialEntityCore.request.QuoteRequest;

public interface QuoteProvider {
    String code();                    // Identificador del banco
    QuoteDto quote(QuoteRequest req);// Calcula la cotización
}