/**
 * Bootstraps the plugin by loading the app resources from config
 */

class ResourcesBootStrap {
 
    def resourceService
    
    def init = { servletContext ->
        resourceService.loadResourcesFromConfig()
    }
    
    def destroy = {
        
    }
}