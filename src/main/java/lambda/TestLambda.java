package lambda;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import model.InputObject;
import model.OutputObject;
import service.ProcessingService;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

@Named("test")
public class TestLambda implements RequestHandler<InputObject, OutputObject> {

    @Inject
    ProcessingService service;
    
    public OutputObject handleRequest(InputObject input, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("chegou aqui");
        return service.process(input).setRequestId(context.getAwsRequestId());
    }
}
