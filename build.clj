(require 'cljs.build.api)

(cljs.build.api/build "src"
  {:main 'hallway.core
   :output-to "out/main.js"})
