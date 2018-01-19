(require 'cljs.build.api)

(cljs.build.api/watch "src"
  {:main 'hallway.core
   :output-to "out/main.js"})
