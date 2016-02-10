package forward.error

class ErrorController {

  def notFound() {
    log.info("The following page was not found: "+request.forwardURI);

    if( request.forwardURI.contains("foo") ){ // This special case should be forwarded to the foo controller.
      log.warn("User requested Foo, sending to FooController...");
      forward(controller: 'foo', action: 'index');
      return;
    }

    // Display notFound...
  }

  def internalServerError() {
    log.warn("An internal server error has occurred");
  }

}
