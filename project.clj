(defproject limelightmentor "0.0.1"
  :description "A website deployable to AppEngine"
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [gaeshi/kake "0.5.0"]]
  :dev-dependencies [[gaeshi/tsukuri "0.5.0"]
                     [speclj "1.4.0"]]
  :test-path "spec/"
  :java-source-path "src/"
  :repl-init-script "config/development/repl_init.clj"
  :gaeshi-core-namespace limelightmentor.core)
