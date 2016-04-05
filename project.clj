(defproject sikuli-clj "0.0.1-SNAPSHOT"
  :description "A façade for the Sikuli API"
  :url "http://github.com/cstrahan/sikuli-clj"
  :dependencies [[org.clojure/clojure    "1.7.0"]
                 [org.sikuli/sikuli-api  "1.2.0"]
                 [org.sikuli/sikuli-core "1.2.0"]]
   :plugins [[lein-localrepo "0.5.2"]]

   :repositories [["java.net" "http://download.java.net/maven/2"]
                 ["sonatype" {:url "https://oss.sonatype.org/content/groups/public"
                              ;; If a repository contains releases only setting
                              ;; :snapshots to false will speed up dependencies.
                              :snapshots true
                              ;; Disable signing releases deployed to this repo.
                              ;; (Not recommended.)
                              :sign-releases false
                              ;; You can also set the policies for how to handle
                              ;; :checksum failures to :fail, :warn, or :ignore.
                              :checksum :fail
                              ;; How often should this repository be checked for
                              ;; snapshot updates? (:daily, :always, or :never)
                              :update :always
                              ;; You can also apply them to releases only:
                              :releases {:checksum :fail :update :always}}]])
