package Core;

import Interfaces.ICarrierRepo;
import Interfaces.ICashRepo;
import Models.Carrier;
import Models.Ticket;
import Models.User;
import Services.CarrierRepository;
import Services.CashRepository;

public class CashProvider {
    private long cardNumber;
    private boolean isAuthorized = false;
    private ICarrierRepo carrierRepository;
    private ICashRepo cashRepository;

    public CashProvider() {

        this.carrierRepository = CarrierRepository.getCarrierRepository();
        this.cashRepository = CashRepository.getCashRepository();
    }

    public boolean buy(Ticket ticket) {
        if (isAuthorized) {
            Carrier carrier = carrierRepository.read(1);
            return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
        }
        return false;
    }


    public void authorization(User client) {
        cardNumber = client.getCardNumber();
        isAuthorized = true;
    }

    
}
