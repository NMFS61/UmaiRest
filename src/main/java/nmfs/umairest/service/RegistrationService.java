package nmfs.umairest.service;

import nmfs.umairest.model.request.RegistrationRequest;
import nmfs.umairest.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by c0259896 on 13/09/2019.
 */
@Service
public class RegistrationService {

    @Autowired
    SmsService smsService;
    public int register(RegistrationRequest request){
        int retVal=1;
        System.out.println(request.getPhone());
        if(request.getPhone()==null || request.getPhone().isEmpty()){

        }else {
            String messageKey=Utils.generateRandonNumber(4);
            // TODO: 15/09/2019 : Register into database
            try {
                //TODO: Phone format validation
                smsService.someRestCall(request.getPhone(),messageKey);
            }
            catch (Exception ex){System.out.println("An error happened while sending sms"+ex.getMessage());}
        }

        return retVal;
    }

    public int checkCode(String code){
        int retVal=1;


        return retVal;
    }

    public void updateCustomer(){}

}
