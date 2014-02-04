package grails.test.runtime

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

/**
 * Annotation to be used in Junit tests and Spock specifications.
 * Tests annotated with this annotation will get a shared TestRuntime instance.
 *
 * @author Lari Hotari
 * @since 2.4
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target([ElementType.PACKAGE, ElementType.TYPE])
public @interface SharedRuntime {
    Class<? extends SharedRuntimeConfigurer> value() default DefaultSharedRuntimeConfigurer 
}
