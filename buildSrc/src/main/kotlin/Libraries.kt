import org.gradle.kotlin.dsl.DependencyHandlerScope

object Libraries {

    object Kotlin {
        object Versions {
            const val kotlin = "1.4.0"
            const val coreKtx = "1.5.0-alpha02"
        }
        const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
        const val kotlinExtensions = "androidx.core:core-ktx:${Versions.coreKtx}"

        fun DependencyHandlerScope.implementationKotlin(){
            add("implementation", kotlin)
            add("implementation", kotlinExtensions)
        }
    }

    object Ui {
        object Versions {
            const val constraint = "2.0.1"
            const val flexbox = "1.0.0"
            const val appCompat = "1.2.0"
        }
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraint}"
        const val flexBoxLayout = "com.google.android:flexbox:${Versions.flexbox}"

        fun DependencyHandlerScope.implementationUi(){
            add("implementation", constraintLayout)
            add("implementation", flexBoxLayout)
            add("implementation", appCompat)
        }
    }

    object UiTest {
        object Versions {
            const val espressoCore = "3.3.0"
            const val junit = "1.1.2"
        }
        const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
        const val junit = "androidx.test.ext:junit:${Versions.junit}"

        fun DependencyHandlerScope.testImplementEspresso(){
            add("testImplementation", espressoCore)
            add("testImplementation", junit)
        }
    }
}