(defproject whitepages/throttler "1.1.0"
  :description "Control the throughput of function calls and core.async channels using the token bucket algorithm"
  :url "https://github.com/whitepages/throttler"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/core.async "0.1.278.0-76b25b-alpha"]]
  :profiles {:dev {:dependencies [[midje "1.5.1"]
                                  [criterium "0.4.3"]
                                  [org.clojure/tools.nrepl "0.2.13"]
                                  [cider/cider-nrepl "0.16.0-snapshot"]
                                  [refactor-nrepl "2.4.0-snapshot"]]
                   :plugins [[lein-midje "3.1.1"]]}})
