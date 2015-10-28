(defproject aviary/feedparser-clj "0.7.0"
  :description "Parse RSS/Atom feeds with a simple, clojure-friendly API."
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.jdom/jdom2 "2.0.6"]
                 [com.rometools/rome "1.5.1"]]
  :plugins [[s3-wagon-private "1.1.2"]]
  :repositories ^:replace
  [["central" {:url "http://repo1.maven.org/maven2"}]
   ["clojure" {:url "http://build.clojure.org/releases"}]
   ["clojure-snapshots" {:url "http://build.clojure.org/snapshots"}]
   ["clojars" {:url "http://clojars.org/repo/"}]
   ["private" {:url "s3p://littlebird-maven/releases/"
               :creds :gpg
               :sign-releases false}]])
