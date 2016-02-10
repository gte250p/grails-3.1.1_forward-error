package forward.error

class FooController {

    def index() {
        log.info("Foo:Index being rendered..."); 
        return render(contentType: 'text/plain', text: 'Hello, World!  The time is: '+System.currentTimeMillis());
    }
}
