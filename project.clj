(defproject people-clojure "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring "1.4.0"] ; allows to start web server, create various routes ( works with compojure)
                 [compojure "1.5.0"]; library allows get routes
                 [hiccup "1.0.5"]] ;library for generating html (like mustache)
  :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :aot [people-clojure.core]
  :main people-clojure.core)
