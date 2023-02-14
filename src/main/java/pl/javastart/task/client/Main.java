package pl.javastart.task.client;

import pl.javastart.task.model.Config;
import pl.javastart.task.service.Offer;
import pl.javastart.task.service.CustomerService;
import pl.javastart.task.service.SalesRepresentative;

public class Main {
    public static void main(String[] args) {
        Config config = new Config();
        SalesRepresentative salesRepresentative = new SalesRepresentative(config);

        // to nie powinno być możliwe
        //salesRepresentative.config.minRequiredEarnings = 0;

        Offer offer = salesRepresentative.createLoanOffer(1_000_000, 1000);

        // to również nie powinno być możliwe
        //offer.valid = true;
        //offer.percentage = -0.5;
        //offer.value = 2_000_000;

        CustomerService customerService = new CustomerService();
        customerService.payoutOffer(offer);
    }
}