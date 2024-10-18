import com.conversorDeMoneda.http.CurrencyApiClient;
import com.conversorDeMoneda.model.ExchangeRates;
import com.conversorDeMoneda.view.CurrencyView;
import com.google.gson.JsonObject;

import static com.conversorDeMoneda.utils.CurrencyUtils.convertAndShowCurrency;
import static com.conversorDeMoneda.utils.MenuUtils.getCurrenciesForChoice;
import static com.conversorDeMoneda.utils.MenuUtils.showMenuAndGetChoice;

public class Main {
    private static final String API_URL_TEMPLATE = "https://v6.exchangerate-api.com/v6/%s/latest/%s";

    public static void main(String[] args) {
        String apiKey = System.getenv("EXCHANGERATE_API_KEY");

        if (apiKey == null) {
            System.out.println("La variable de entorno EXCHANGERATE_API_KEY no está definida.");
            return;
        }

        CurrencyApiClient apiClient = new CurrencyApiClient();
        CurrencyView view = new CurrencyView();

        view.showWelcomeMessage();

        boolean running = true;
        while (running) {
            int choice = showMenuAndGetChoice(view);
            if (choice == 7) {
                view.showExitMessage();
                break;
            }

            String[] currencies = getCurrenciesForChoice(choice);
            String baseCurrency = currencies[0];
            String targetCurrency = currencies[1];

            double amount = view.getAmount();

            String apiUrl = String.format(API_URL_TEMPLATE, apiKey, baseCurrency);

            try {
                JsonObject jsonResponse = apiClient.getExchangeRates(apiUrl);

                if (jsonResponse.has("error-type")) {
                    String errorType = jsonResponse.get("error-type").getAsString();
                    view.showErrorMessage(errorType);
                } else {
                    ExchangeRates exchangeRates = new ExchangeRates(jsonResponse);
                    convertAndShowCurrency(view, exchangeRates, baseCurrency, targetCurrency, amount);
                }
            } catch (Exception e) {
                view.showErrorMessage("Error al obtener las tasas de cambio: " + e.getMessage());
            }
        }
    }

}