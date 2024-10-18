package com.conversorDeMoneda.model;

import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;

public class ExchangeRates {
    private final Map<String, Double> rates;

    public ExchangeRates(JsonObject jsonResponse) {
        this.rates = new HashMap<>();
        JsonObject ratesObject = jsonResponse.getAsJsonObject("conversion_rates");
        ratesObject.entrySet().forEach(entry -> {
            rates.put(entry.getKey(), entry.getValue().getAsDouble());
        });
    }

    public double getRate(String currencyCode) {
        return rates.getOrDefault(currencyCode, 0.0);
    }

    public Map<String, Double> getRates() {
        return rates;
    }
}