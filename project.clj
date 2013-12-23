(defproject aegia "0.0.1-SNAPSHOT"
  :description "Service to parse bodies out of blog posts"
  :url "https://github.com/mathias/aegia"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2120"]]

  :plugins [[lein-cljsbuild "0.3.3"]]
  ;; cljsbuild tasks configuration
  :cljsbuild {:builds
              [{;; clojurescript source code path
                :source-paths ["src/"]

                ;; Google Closure Compiler options
                :compiler {;; the name of the emitted JS file
                           :output-to "application.js"

                           ;; use minimal optimization CLS directive
                           :optimizations :simple

                           ;; prettyfying emitted JS
                           :pretty-print true

                           ;; compile for node
                           :target :nodejs}}]})
