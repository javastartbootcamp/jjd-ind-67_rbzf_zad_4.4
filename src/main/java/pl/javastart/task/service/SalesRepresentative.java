package pl.javastart.task.service;

import pl.javastart.task.model.Config;

public class SalesRepresentative {

    private Config config;

    public SalesRepresentative(Config config) {
        this.config = config;
    }

    public Offer createLoanOffer(int requestedAmount, int earnings) {
        Offer offer = new Offer();
        if (earnings >= config.getMinRequiredEarnings()) {
            offer.percentage = config.getPercentage();
            offer.valid = true;
            offer.value = requestedAmount;
        }
        return offer;
    }

}
