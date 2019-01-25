package app

import react.*
import react.dom.*
import logo.*
//import ticker.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("App-header") {
            logo()
            h2 {
                +"Welcome to Ultima Umbrella"
            }
        }
//        p("App-intro") {
//            +"To get started, edit "
//            code { +"app/App.kt" }
//            +" and save to reload."
//        }
//        p("App-ticker") {
//            ticker()
//        }
        div {

            h3 {
                +"Please Login or Sign Up"
            }
            div {
                div {
                    form {
                        +"Login"
                        input {}
                        +"Sign Up"
                        input {}
                    }
                    div {
                        button { b { +"Login" } }

                        button { b { +"SignUp" } }
                    }

                }
            }
        }
    }
}

fun RBuilder.app() = child(App::class) {}
