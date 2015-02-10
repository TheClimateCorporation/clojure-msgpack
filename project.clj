(defproject clojure-msgpack "0.1.0-tcc"
  :description "Pure Clojure implementation of MessagePack spec."
  :url "https://github.com/edma2/clojure-msgpack"
  :repositories {"climate" "http://xdeps.ci.climatedna.net/maven"}
  :license {:name "The MIT License (MIT)"
            :url "http://opensource.org/licenses/MIT"}
  :plugins [[com.climate.plugins/lein-testng "1.0.0"]
            [com.climate.plugins/tcc-base-project "2014.10.27T23.49.27.ac58238"]
            [com.climate.leiningen/lein-jenkins "000004.e9d2051"]]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [reiddraper/simple-check "0.5.3"]])
