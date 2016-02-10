package forward.error


import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(UrlPrintingInterceptor)
class UrlPrintingInterceptorSpec extends Specification {

    def setup() {
    }

    def cleanup() {

    }

    void "Test urlPrinting interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"urlPrinting")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
