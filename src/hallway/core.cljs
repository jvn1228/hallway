(ns hallway.core)

(enable-console-print!)

(println "hello world")

(let [canvas (.getElementById js/document "canvas")]
  (set! (.-width canvas) (.-innerWidth js/window))
  (set! (.-height canvas) (.-innerHeight js/window)))

(defn draw-box
  [color box-x box-y]
  (let [canvas (.getElementById js/document "canvas")
        ctx (.getContext canvas "2d")]
    (set! (.-fillStyle ctx) color)
    (.fillRect ctx box-x box-y 100 100)))

