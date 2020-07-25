(ns testing.core
  (:require [clojure.browser.repl :as repl]))

(defonce conn
 (repl/connect "http://localhost:9000/repl"))

(enable-console-print!)

(println "Hello world!")



; 3*5 - 8 / 4 + 7 
;  (+ (- (* 3 5) (/ 8 4)) 7)