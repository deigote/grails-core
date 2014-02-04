package grails.test.runtime

interface SharedRuntimeConfigurer {
    String[] getRequiredFeatures()
    void configure(TestRuntime runtime)
}
