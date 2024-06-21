package lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

// import jakarta.inject.Inject;
import jakarta.inject.Named;
import model.InputCEP;
import model.OutputCEP;
// import service.ViaCepService;

@Named("getCep")
public class GetCEPLambda implements RequestHandler<InputCEP, OutputCEP> {

    // @Inject
    // ViaCepService viaCepService;

    @Override
    public OutputCEP handleRequest(InputCEP input, Context context) {

        System.out.println("chegou aqui");
        return new OutputCEP();
    }
    
}
