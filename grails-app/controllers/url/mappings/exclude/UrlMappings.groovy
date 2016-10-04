package url.mappings.exclude

class UrlMappings {

    static excludes = ["/stomp/", "/stomp/*", "/topic/*"]

    static mappings = {
        '/**'(controller:"index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
