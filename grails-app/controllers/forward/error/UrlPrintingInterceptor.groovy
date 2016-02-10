package forward.error


class UrlPrintingInterceptor {

    public UrlPrintingInterceptor(){ matchAll(); }

    boolean before() { 
        log.info(String.format("URL[forwardURI: %s, controller: %s, action: %s]", request.forwardURI, controllerName, actionName));
        return true;
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
