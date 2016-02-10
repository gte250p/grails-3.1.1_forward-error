package forward.error

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(controller: 'error', action:'internalServerError')
        "404"(controller: 'error', action:'notFound')
    }
}
