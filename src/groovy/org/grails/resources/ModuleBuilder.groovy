package org.grails.resources

class ModuleBuilder {
    
    def _resources = []
    def _depends = []
    def _closure
    
    ModuleBuilder(Closure c) {
        _closure = c
    }
    
    void _build() {
        _closure.delegate = this
        _closure.call()
    }
    
    void dependsOn(String[] dependencies) {
        _depends.addAll(dependencies.toList())
    } 
    
    void resource(args) {
        _resources << args
    }
    
    def missingMethod(String name, args) {
        throw new RuntimeException("Sorry - flavours are not yet supported by the builder!")
    }
}