package Laba_3.Chain;

//import com.sun.net.httpserver.Request;

class ChainService {

    public Request exec(String inputStream) {
        Request request = new Request();
        request.setInputStream(inputStream);

        ChainHandler handler = new HeaderChainHandler();
        handler.next(new MethodChainHandler())
                .next(new PathChainHandler())
                .next(new SessionChainHandler());

        handler.process(request);

        return request;
    }

}

