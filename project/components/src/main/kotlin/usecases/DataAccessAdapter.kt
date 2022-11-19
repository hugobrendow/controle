package usecases

import org.springframework.stereotype.Component


@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@Component
annotation class DataAccessAdapter(
        val value: String = ""
)