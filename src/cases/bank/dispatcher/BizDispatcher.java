package cases.bank.dispatcher;

import cases.bank.service.DepositService;
import cases.bank.service.TransferService;
import cases.bank.utils.Biz;

public class BizDispatcher {

    public static void dispatch(String forward) {

        DepositService depositService = new DepositService();
        TransferService transferService = new TransferService();

        switch (forward) {

            case Biz.DEPOSITE:

                depositService.deposit();
                break;
            case Biz.TRANSFER:

                transferService.transfer();
                break;

            default:
                break;
        }
    }

}
