(ns hallway.core)

(enable-console-print!)

(println "hello world")

(defn draw-box
  [color]
  (let [canvas (.getElementById js/document "canvas")
        ctx (.getContext canvas "2d")]
    (set! (.-fillStyle ctx) color)
    (.fillRect ctx 10 10 100 100)))
