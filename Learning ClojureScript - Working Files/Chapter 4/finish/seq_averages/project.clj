(defproject seq_averages "0.1.0-SNAPSHOT"
  :description "Calculate means of arbitrary number of items"
  :url "http://example.com/seq_averages"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-3169"]
                 [domina "1.0.3"]]
  :jvm-opts ^:replace ["-Xmx1g" "-server"]
  :node-dependencies [[source-map-support "0.2.8"]]
  :plugins [[lein-npm "0.4.0"]]
  :source-paths ["src" "target/classes"]
  :clean-targets ["out" "release"]
  :target-path "target")
