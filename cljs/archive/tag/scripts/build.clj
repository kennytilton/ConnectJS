(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/build "src"
    {:main 'tag.core
     :output-to "out/tag.js"
     :output-dir "out"
     :verbose true})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))


